package threads;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EvenOddThreadsTest
{
    @Test
    public void testEvenOddOutput() {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        StringBuilder evenOutput = new StringBuilder();
        StringBuilder oddOutput = new StringBuilder();

        // Redirect System.out to StringBuilder
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            public void write(int b) {
                evenOutput.append((char) b);
            }
        }));

        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            public void write(int b) {
                oddOutput.append((char) b);
            }
        }));

        evenThread.start();
        oddThread.start();

        // Wait for threads to finish
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Assert expected output
        assertEquals("2\n4\n6\n8\n10\n12\n14\n16\n18\n20\n22\n24\n26\n28\n30\n32\n34\n36\n38\n40\n42\n44\n46\n48\n50\n52\n54\n56\n58\n60\n", evenOutput.toString());
        assertEquals("1\n3\n5\n7\n9\n11\n13\n15\n17\n19\n21\n23\n25\n27\n29\n31\n33\n35\n37\n39\n41\n43\n45\n47\n49\n51\n53\n55\n57\n59\n", oddOutput.toString());
    }
}
