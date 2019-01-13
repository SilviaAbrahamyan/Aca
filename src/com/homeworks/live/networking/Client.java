package com.homeworks.live.networking;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by home on 10/29/2018.
 */
public class Client {
    public static void main(String... args) throws IOException {
        Socket socket = new Socket(
                args[0],
                Integer.parseInt(args[1])
        );

        Scanner scanner = new Scanner(System.in);

        String v1 = scanner.nextLine();
        String v2 = scanner.nextLine();

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is)
        );
        PrintWriter writer = new PrintWriter(os, true);

        writer.println(v1); writer.println(v2);
        String sum = reader.readLine();
        System.out.println(v1 + " + " + v2 + " = " + sum);
    }

}
