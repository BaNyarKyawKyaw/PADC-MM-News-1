package com.example.hp.padc_mm_news.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 12/3/2017.
 */

public class PublicationVO {

    @SerializedName("publication-id")
    private String publicationID;

    @SerializedName("title")
    private String title;

    @SerializedName("logo")
    private String logo;

    public String getPublicationID() {
        return publicationID;
    }

    public String getTitle() {
        return title;
    }

    public String getLogo() {
        return logo;
    }
}
