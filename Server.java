// package MultiThreaded;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Server{

  public void run(){
    int port = 8010;

    try ( ServerSocket socket = new ServerSocket(port)){
      socket.setSoTimeout(10000);
      System.out.println("server is online on port "+port);
      while(true){
      try {
        System.out.println("Server is listening on port "+port);
      Socket acceptedConnection = socket.accept(); 
      System.out.println("connection accepted from client  "+acceptedConnection.getRemoteSocketAddress());
      PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream(),true);
        BufferedReader fromClinet = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));

        toClient.println("Hello from server");
      } catch (Exception e) {
        e.printStackTrace();
      }
     
    } 
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
   
    
    
  }
  public static void main(String args[]){
    Server server = new Server();
    try {
      server.run();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}