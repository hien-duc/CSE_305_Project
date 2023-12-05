package Duc.Chat;

import Duc.Chat.chatServerClient.*;
import Duc.Chat.chatUI.*;

public class ChatController {
  private Chat view;
  private ChatClient model;

  public ChatController(Chat view, ChatClient model) {
    this.view = view;
    this.model = model;
  }


}
