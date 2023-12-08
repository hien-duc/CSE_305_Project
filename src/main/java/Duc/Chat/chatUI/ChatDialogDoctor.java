
package Duc.Chat.chatUI;

import Duc.Chat.chat.component.ChatBox;
import Duc.Chat.chat.model.ModelMessage;
import Duc.Chat.chat.swing.ChatEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ChatDialogDoctor extends javax.swing.JDialog /* implements WindowListener */ {
    private Icon icon;
    private String name;
    private String date;
    private String message;
    Socket socket;
    PrintWriter out;
    BufferedReader in;
    String role;
    // DoctorMain main;

    public ChatDialogDoctor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // this.main = parent;
        chatArea.setTitle("Chat App");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy, hh:mmaa");

        try {
            socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            role = "doctor";
            // out.println(userName); // Send the user's name to the server

            Thread receiveThread = new Thread(() -> {
                String message;
                try {
                    // Icon icon = new ImageIcon("src\\main\\java\\Duc\\Chat\\chatUI\\p2.png");
                    while ((message = in.readLine()) != null) {
                        if (message.startsWith("patient")) {
                            chatArea.addChatBox(
                                    new ModelMessage(icon, name, date,
                                            message.substring(8, message.length())),
                                    ChatBox.BoxType.LEFT);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiveThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

        chatArea.addChatEvent(new ChatEvent() {
            @Override
            public void mousePressedSendButton(ActionEvent evt) {
                Icon icon = new ImageIcon("src\\main\\java\\Duc\\Chat\\chatUI\\p1.png");
                String name = "Duc";
                String date = df.format(new Date());
                String message = chatArea.getText().trim();
                chatArea.addChatBox(new ModelMessage(icon, name, date, message), ChatBox.BoxType.RIGHT);
                out.println(role + ": " + message);
                chatArea.clearTextAndGrabFocus();
            }

            @Override
            public void mousePressedFileButton(ActionEvent evt) {

            }

            @Override
            public void keyTyped(KeyEvent evt) {

            }
        });
        setLocationRelativeTo(null);
        /*
         * addWindowListener(new WindowAdapter() {
         * 
         * @Override
         * public void windowClosing(WindowEvent e) {
         * // Instantiate and display the new dialog when the current dialog is closing
         * 
         * }
         * });
         */

    }

    /*
     * private void openNewDialog() {
     * // Instantiate and display your new dialog here
     * PaymentForm paymentForm = new PaymentForm(this, true);
     * paymentForm.setVisible(true);
     * }
     */

    private void initComponents() {

        background1 = new Duc.Chat.chat.swing.Background();
        chatArea = new Duc.Chat.chat.component.ChatArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
                background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(background1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chatArea, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                .addContainerGap()));
        background1Layout.setVerticalGroup(
                background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(background1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chatArea, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChatDialogDoctor.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatDialogDoctor.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatDialogDoctor.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatDialogDoctor.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the dialog */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
/*         java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        ChatDialogDoctor dialog = new ChatDialogDoctor(, true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
        System.exit(0);
        }
        });
        dialog.setVisible(true);
        }
        }); */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Duc.Chat.chat.swing.Background background1;
    private Duc.Chat.chat.component.ChatArea chatArea;
    // End of variables declaration//GEN-END:variables

}
