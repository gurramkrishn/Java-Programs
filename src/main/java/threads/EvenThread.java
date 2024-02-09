package threads;

public class EvenThread extends Thread
{
    public void run() {
        for (int i = 2; i <= 60; i += 2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 59; i += 2) {
            System.out.println(i);
        }
    }
}

