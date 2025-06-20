package simple_socket_programming; 
import java.io.IOException; 
import java.io.PrintWriter; 
import java.net.ServerSocket; 
import java.net.Socket; 
 
public class SimpleSocketServer { 
 
 static int PORT = 9999; 
  
 public static void main(String[] args) throws IOException { 
 
  System.out.println("\t\tSimple Socket Server"); 
  System.out.println("\t\t====================\n\n"); 
   
  //Creating the server socket with the relevant port no. 
  ServerSocket serverSocket = new ServerSocket(PORT); 
   
  try{ 
    
   while(true) { 
     
    //Listening for any client socket requests 
    Socket socket = serverSocket.accept();     
    System.out.println("Client is Connected............\n\n"); 
    
    try{ 
      
     //Creating the print writer for outputting through the output stream 
     PrintWriter out = new 
     PrintWriter(socket.getOutputStream(),true); 
      
     out.println("Welcome to Socket Programming"); 
           
    }finally{     
     socket.close();     
    }        
   }    
  } finally {    
   serverSocket.close();    
  }   
 }   
}