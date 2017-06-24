package com.amarpreetsinghprojects.whatsapp_imitation;

/**
 * Created by kulvi on 06/24/17.
 */

public class Call_elements {

    String callName, callImage, callTime, callType;

    public Call_elements(String callName, String callImage, String callTime, String callType) {
        this.callName = callName;
        this.callImage = callImage;
        this.callTime = callTime;
        this.callType = callType;
    }

    public String getCallName() {
        return callName;
    }

    public String getCallImage() {
        return callImage;
    }

    public String getCallTime() {
        return callTime;
    }

    public String getCallType() {
        return callType;
    }
}
