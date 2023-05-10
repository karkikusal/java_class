import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("A new client connected");
        try{
            ServerSocket serverSocket = new ServerSocket(12345);
            //serverSocket.accept();

            Socket socket = serverSocket.accept();
            System.out.println("A new client connected");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream,true);

            Scanner input = new Scanner(System.in);

            while  (true) {
                String userInput = input.nextLine();
                printWriter.println(userInput);
            }
            //printWriter.println("hello world");


        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}