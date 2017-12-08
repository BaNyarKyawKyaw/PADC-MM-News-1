package com.example.hp.padc_mm_news.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 12/3/2017.
 */

public class CommentActionVO {

    @SerializedName("comment-id")
    private String commentID;

    @SerializedName("comment")
    private String comment;

    @SerializedName("comment-date")
    private String commentDate;

    @SerializedName("acted-user")
    private ActedUserVO actedUser;

    public String getCommentID() {
        return commentID;
    }

    public String getComment() {
        return comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public ActedUserVO getActedUser() {
        return actedUser;
    }
}
