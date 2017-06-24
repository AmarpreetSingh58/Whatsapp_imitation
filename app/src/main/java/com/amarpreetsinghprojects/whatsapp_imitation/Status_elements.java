package com.amarpreetsinghprojects.whatsapp_imitation;

/**
 * Created by kulvi on 06/24/17.
 */

public class Status_elements {

    String status_name,update_time, status_image;

    public Status_elements(String status_name,String status_image, String update_time) {
        this.status_name = status_name;
        this.update_time = update_time;
        this.status_image = status_image;
    }

    public String getStatus_name() {
        return status_name;
    }

    public String getUpdate_time() {
        return update_time;
    }
    public String getStatus_image(){
        return status_image;
    }
}
