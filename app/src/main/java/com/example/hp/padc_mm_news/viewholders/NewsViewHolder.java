package com.example.hp.padc_mm_news.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hp.padc_mm_news.R;
import com.example.hp.padc_mm_news.data.vo.CommentActionVO;
import com.example.hp.padc_mm_news.data.vo.FavouriteActionVO;
import com.example.hp.padc_mm_news.data.vo.NewsVO;
import com.example.hp.padc_mm_news.data.vo.SendActionVO;
import com.example.hp.padc_mm_news.delegates.NewsItemsDelegate;
import com.example.hp.padc_mm_news.events.TapNewsEvent;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by E5-575G on 11/4/2017.
 */

public class NewsViewHolder extends BaseViewHolder<NewsVO> {

    private NewsItemsDelegate mNewsItemsDelegate;

    @BindView(R.id.iv_publication_logo)
    ImageView ivPublicationLogo;

    @BindView(R.id.tv_publication_name)
    TextView tvPublicationName;

    @BindView(R.id.tv_published_date)
    TextView tvPublishedDate;

    @BindView(R.id.tv_brief_news)
    TextView tvBriefNews;

    @BindView(R.id.iv_news_hero_image)
    ImageView ivNewsImage;

    @BindView(R.id.tv_news_statistical_data)
    TextView tvNewsStatisticalData;

    private int numOfFav = 0;
    private int numOfCmt = 0;
    private int numofSendTo = 0;

    public NewsViewHolder(View itemView, NewsItemsDelegate newsItemsDelegate) {
        super(itemView);
        mNewsItemsDelegate = newsItemsDelegate;
        ButterKnife.bind(this, itemView);

    }

    @Override
    public void onClick(View view) {
        mNewsItemsDelegate.onTapNews();
    }

    @Override
    public void setData(NewsVO data) {

        if (data.getImages()!=null && data.getImages().size()>=1){
            Glide
                    .with(ivNewsImage.getContext())
                    .load(data.getImages().get(0))
                    .into(ivNewsImage);
        }
        else{
            ivNewsImage.setVisibility(View.GONE);
        }

        Glide
                .with(ivPublicationLogo.getContext())
                .load(data.getPublication().getLogo())
                .into(ivPublicationLogo);

        tvPublicationName.setText(data.getPublication().getTitle());
        tvPublishedDate.setText(data.getPostedDate());
        tvBriefNews.setText(data.getBrief());

        List<FavouriteActionVO> favouritesActions = data.getFavouritesActions();
        if (favouritesActions != null && favouritesActions.size() >=1){
            numOfFav = data.getFavouritesActions().size();
        }
        else{
            numOfFav=0;
        }

        List<CommentActionVO> commentActions = data.getCommentActions();
        if (commentActions != null && commentActions.size() >=1){
            numOfCmt = data.getCommentActions().size();
        }
        else{
            numOfCmt = 0;
        }

        List<SendActionVO> sendActions = data.getSendActions();
        if (sendActions != null && sendActions.size() >=1){
            numofSendTo = data.getSendActions().size();
        }
        else{
            numofSendTo=0;
        }
        tvNewsStatisticalData.setText(numOfFav+" Like(s) - "+numOfCmt+" Comment(s) - "+"Sent to "+numofSendTo+" people");


    }
}
