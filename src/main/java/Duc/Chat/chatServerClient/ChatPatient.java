package Duc.Chat.chatServerClient;

import java.awt.Frame;
import java.io.*;
import java.net.*;

import Duc.Chat.chatUI.ChatDialogPatient;

public class ChatPatient {

  public static void main(String[] args) {
    try (Socket socket = new Socket("localhost", 12345)) {
      System.out.println("Connected to the server.");
      PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      // Get the user's name

      String userName = "patient";
      out.println(userName); // Send the user's name to the server

      Thread receiveThread = new Thread(() -> {
        String message;
        try {
          while ((message = in.readLine()) != null && (message = in.readLine()).startsWith("doctor")) {
            System.out.println(message);
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
      receiveThread.start();

      while (true) {
        ChatDialogPatient chatDialogPatient = new ChatDialogPatient(new Frame(), true);
        String userInput = chatDialogPatient.getChatArea().getText();
        out.println(userName + ": " + userInput); // Send the user's name along with the message
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
