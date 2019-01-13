package com.homeworks.live.networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by home on 10/29/2018.
 */
public class Server {
    public static void main(String... args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);

        while(true) {
            System.out.println("Waiting for a connection...");
            Socket s = ss.accept();
            System.out.println("Connected: " + s);
            new Thread(new ClientProcessor(s)).start();
        }
    }
}

class ClientProcessor implements Runnable {

    private Socket socket;

    public ClientProcessor(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            processClient();
        }catch(IOException e) {
        }
    }

    private void processClient() throws IOException {
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is)
        );
        PrintWriter writer = new PrintWriter(os, true);

        int v1 = Integer.parseInt(reader.readLine());
        System.out.println(v1);

        int v2 = Integer.parseInt(reader.readLine());
        System.out.println(v2);

        writer.println("" + (v1 + v2));
    }
}