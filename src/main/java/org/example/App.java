package org.example;

public class App {
    public static void main( String[] args ) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
    }
}
