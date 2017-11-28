package com.example.hp.padc_mm_news.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.padc_mm_news.R;
import com.example.hp.padc_mm_news.viewholders.RelatedNewsViewHolder;

/**
 * Created by HP on 11/28/2017.
 */

public class RelatedNewsAdapter extends RecyclerView.Adapter <RelatedNewsViewHolder> {

    public LayoutInflater mLayoutInflater;

    public RelatedNewsAdapter(Context context) {
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public RelatedNewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View itemView = mLayoutInflater.inflate(R.layout.view_item_related_news,parent,false);
       return new RelatedNewsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RelatedNewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
