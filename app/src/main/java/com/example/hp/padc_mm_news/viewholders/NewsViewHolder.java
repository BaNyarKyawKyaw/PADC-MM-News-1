package com.example.hp.padc_mm_news.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.hp.padc_mm_news.adapters.NewsImagesPagerAdapter;
import com.example.hp.padc_mm_news.delegates.NewsItemsDelegate;

/**
 * Created by E5-575G on 11/4/2017.
 */

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private NewsItemsDelegate mNewsItemsDelegate;

    public NewsViewHolder(View itemView,  NewsItemsDelegate newsItemsDelegate) {
        super(itemView);
        mNewsItemsDelegate = newsItemsDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mNewsItemsDelegate.onTapNews();
            }
        });
    }
}
