package de.stuttgart;

public class Main {
    public static void main (String[] args) {
        System.out.println("h");
        EchoServer server = new EchoServer();
        System.out.println("Server is up");
        server.run();
    }
}
