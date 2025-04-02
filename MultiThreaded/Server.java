import java.net.ServerSocket;

public class Server {

  
  public static void main(String args[]){
    int port =8081;
    try {
      ServerSocket serverSocket = new ServerSocket(port);
      serverSocket.getSoTimeout(10000);
      System.out.println("Server is Listenig to port "+port);
      while(true){
        Socket acceptedSocket = serverSocket.accept();
        Thread thread = new Thread();
      }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
