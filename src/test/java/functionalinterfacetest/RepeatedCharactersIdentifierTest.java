package functionalinterfacetest;


import functionalinterface.RepeatedCharactersIdentifier;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RepeatedCharactersIdentifierTest
{
RepeatedCharactersIdentifier rep = new RepeatedCharactersIdentifier();

    @Test
    public void testPrintRepeatedCharacters()
    {
        ArrayList<Character> arrayList=new ArrayList<>(Arrays.asList('o'));
        assertEquals(arrayList, rep.getRepeatedCharacters("aloo"));

    }


}
