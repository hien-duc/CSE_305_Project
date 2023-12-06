package Duc.Chat.chatServerClient;

import java.awt.Frame;

import Duc.Chat.chatUI.ChatDialogPatient;

public class Conversation {
    public static void main(String[] args) {
        ChatPatient chatpatient = new ChatPatient();
        ChatDialogPatient chatDialogPatient = new ChatDialogPatient(new Frame(), true);
        chatDialogPatient.setVisible(true);
    }
}
