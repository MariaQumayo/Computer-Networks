/*
 * 2016-01-10
 * @author Maria
 */

import java.net.*;
import java.util.*;
import java.io.*;

public class myServer {
    
    public static void main(String[] args)
    {
        new myServer();
    }
    
    public myServer()
    {
        try{
            //create server socket,pass through a port number to connect on
            ServerSocket sSocket = new ServerSocket(5000);
            //test connection
            System.out.print("server started at: " + new Date()); 
            
            //crate a socket to send and recieve data, wait for client to connect
            Socket socket = sSocket.accept();
            
            //create read and write streams
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            //feedback to user that they have connected
            output.println("You have connected at " + new Date());
            
            //chat part
            //loop to run server functions
           while(true){
            String chatInput = input.readLine();
            System.out.println(chatInput);
           } 
        }
        catch(IOException exception){
            System.out.println("Error: " + exception);
        }
    }
}
