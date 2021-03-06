package com.bobby.DoseFM.chat;

import com.bobby.DoseFM.model.MessageItem;
import com.bobby.DoseFM.model.MessageList;

public class ChatContract {
    interface ChatView {
        void onFailure(String message);
        void onSuccess(MessageItem response);
    }

    interface Presenter{
        void cleanMemory();
        void sendMessage(String message);
        void storeChatHistory(MessageList response,String category);
        MessageList getChatHistory(String category);
    }
}
