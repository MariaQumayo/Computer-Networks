/*
 * 2016-01-10
 * @author Maria
 */

import java.net.*;
import java.util.*;
import java.io.*;

public class myClient {
    public static void main (String[] args)
    {
        new myClient();
    }
    public myClient()
    {
        //to read user imput
        Scanner scanner = new Scanner(System.in);
        try{
            //connect to server at prot 5000
        Socket socket = new Socket("localhost", 5000);
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));        
        
        //waits for the server to send the string saying a connection was made
        String inputString = input.readLine();
        System.out.println(inputString);
        
        //runs the client while true.
        //looks for input from the user, sends it to server
        while(true){
        //input from the user
            String userInput = scanner.nextLine();
        //write that input to the server
            output.println(userInput);
        }
        }catch(Exception error){
            System.out.println("Error: " + error);
        }
    }
}
