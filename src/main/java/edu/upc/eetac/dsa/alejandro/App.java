package edu.upc.eetac.dsa.alejandro;

import java.io.IOException;
import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        BinaryClass writeTest=new BinaryClass(3, 'a', 2.76);
        writeTest.saveToFile("ficherodeprueba");

        BinaryClass readTest=BinaryClass.readFromFile("ficherodeprueba");
        System.out.println("Ineteger: "+readTest.getInteger());
        System.out.println("Character: "+readTest.getCharacter());
        System.out.println("Decimal: "+readTest.getDecimal());

        File file =new File ("ficherodeprueba");
        file.delete();
    }
}
