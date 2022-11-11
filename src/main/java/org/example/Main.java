package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nHello universe\nhello multiverse\n\n\n\n\nhello multiline\n");
        (new Throwable("oeps")).printStackTrace();
        System.out.println("bye");
        doeiets();
    }
    
    private static void doeiets() {
        throw new IllegalArgumentException("foute boel");
    }
}
