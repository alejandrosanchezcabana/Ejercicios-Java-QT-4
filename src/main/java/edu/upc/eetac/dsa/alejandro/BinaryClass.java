package edu.upc.eetac.dsa.alejandro;

import java.io.*;

/**
 * Created by Alex on 25/9/15.
 */
public class BinaryClass {
    private int integer;
    private char character;
    private double decimal;

    public BinaryClass(int integer, char character, double decimal){
        this.integer=integer;
        this.character=character;
        this.decimal=decimal;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }
    public void saveToFile(String filename) throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
        dos.writeInt(integer);
        dos.writeDouble(decimal);
        dos.writeChar(character);
        dos.close();
    }
    public final static BinaryClass readFromFile (String filename) throws IOException{
        DataInputStream dis=new DataInputStream(new FileInputStream(filename));
        int integer=dis.readInt();
        double decimal=dis.readDouble();
        char character =dis.readChar();
        return new BinaryClass (integer, character, decimal);
    }

}
