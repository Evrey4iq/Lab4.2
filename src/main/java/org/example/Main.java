package org.example;

public class Main {
    public static void main(String[] args) {
        String encoded1 = "h2ll4";
        String encoded2 = "t2st3ng";

        System.out.println("Decoded from 'hello': " + Decoder.decode(encoded1));
        System.out.println("Decoded from 't2st3ng': " + Decoder.decode(encoded2));
    }
}