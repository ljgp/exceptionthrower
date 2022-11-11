package org.example;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");

        System.out.println("Entering recursion...");
        doeiets();

        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true){
            // spin forever
        }
    }

    private static void doeiets() {
        doeiets();
    }
} 
