package com.example.hp.padc_mm_news.data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HP on 12/2/2017.
 */

public class NewsVO {

    @SerializedName("news-id")
    private String newsID;

    @SerializedName("brief")
    private String brief;

    @SerializedName("details")
    private String details;

    @SerializedName("images")
    private List<String> images;

    @SerializedName("posted-date")
    private String postedDate;

    @SerializedName("publication")
    private PublicationVO publication;

    @SerializedName("favorites")
    private List<FavouriteActionVO> favouritesActions;

    @SerializedName("comments")
    private List<CommentActionVO> commentActions;

    @SerializedName("sent-tos")
    private List<SendActionVO> sendActions;

    public String getNewsID() {
        return newsID;
    }

    public String getBrief() {
        return brief;
    }

    public String getDetails() {
        return details;
    }

    public List<String> getImages() {
        return images;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public PublicationVO getPublication() {
        return publication;
    }

    public List<FavouriteActionVO> getFavouritesActions() {
        return favouritesActions;
    }

    public List<CommentActionVO> getCommentActions() {
        return commentActions;
    }

    public List<SendActionVO> getSendActions() {
        return sendActions;
    }
}
