package com.example.hp.padc_mm_news.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 12/3/2017.
 */

public class FavouriteActionVO {

    @SerializedName("favorite-id")
    private String favouriteID;

    @SerializedName("favorite-date")
    private String favouriteDate;

    @SerializedName("acted-user")
    private ActedUserVO actedUser;

    public String getFavouriteID() {
        return favouriteID;
    }

    public String getFavouriteDate() {
        return favouriteDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
