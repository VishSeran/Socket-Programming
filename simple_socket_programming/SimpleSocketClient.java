package simple_socket_programming; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.net.InetAddress; 
import java.net.Socket; 
import java.net.UnknownHostException; 
 
public class SimpleSocketClient { 
 
 //Defining PORT Number 
 static int PORT = 9999; 
 
  
 public static void main(String[] args) throws IOException, 
UnknownHostException{ 
  
  //Assigning local host ip as the server ip address : this calls for the UnknownHostException 
  InetAddress ipAddress = InetAddress.getLocalHost(); 
 
  System.out.println("\t\tSimple Socket Client"); 
  System.out.println("\t\t====================\n\n"); 
   
   
  //Creating Client Socket 
  Socket socket = new Socket(ipAddress, PORT); 
   
   
  //Creating BufferedReader for inputting  
  BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
   
  //Reading the input  
  String input = in.readLine(); 
   
  System.out.println("Server is Connected.........\n\n"); 
   
  System.out.println("Server says : "+input); 
   
  System.exit(0); 
 
 } 
 
} 