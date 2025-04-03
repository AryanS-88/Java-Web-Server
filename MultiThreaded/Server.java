import java.net.ServerSocket;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;
import java.io.PrintWriter;


public class Server {

    public Consumer<Socket> getConsumer(){
     
        
         return (clientSocket)->{
        try {
        PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
        toClient.println("Hello from the server");
        toClient.close();
        clientSocket.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      };
    }
  public static void main(String args[]){
    Server server = new Server(); 
    int port =8081;
    try {
      ServerSocket serverSocket = new ServerSocket(port);
      serverSocket.setSoTimeout(10000);
      System.out.println("Server is Listenig to port "+port);
      while(true){
        Socket acceptedSocket = serverSocket.accept();
        Thread thread = new Thread(()->server.getConsumer().accept(acceptedSocket));
        thread.start();
        
      }
      
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
