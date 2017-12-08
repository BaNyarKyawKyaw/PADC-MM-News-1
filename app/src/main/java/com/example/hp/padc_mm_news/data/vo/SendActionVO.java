package com.example.hp.padc_mm_news.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 12/3/2017.
 */

public class SendActionVO {

    @SerializedName("send-to-id")
    private String sendToID;

    @SerializedName("sent-date")
    private String sendDate;

    @SerializedName("acted-user")
    private ActedUserVO actedUser;

    @SerializedName("received-user")
    private ActedUserVO receivedUser;

    public String getSendToID() {
        return sendToID;
    }

    public String getSendDate() {
        return sendDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }

    public ActedUserVO getReceivedUser() {
        return receivedUser;
    }
}
