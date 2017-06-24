package com.amarpreetsinghprojects.whatsapp_imitation;

/**
 * Created by kulvi on 06/23/17.
 */

public class Chat_elements {

    String name, image, chat;

    public Chat_elements(String name, String image, String chat) {
        this.name = name;
        this.image = image;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getChat() {
        return chat;
    }
}
