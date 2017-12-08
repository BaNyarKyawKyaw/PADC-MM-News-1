package com.example.hp.padc_mm_news.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 12/3/2017.
 */

public class ActedUserVO {

    @SerializedName("user-id")
    private String userID;

    @SerializedName("user-name")
    private String userName;

    @SerializedName("profile-image")
    private String profileImage;

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getProfileImage() {
        return profileImage;
    }
}
