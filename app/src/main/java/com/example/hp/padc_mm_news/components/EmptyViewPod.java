package com.example.hp.padc_mm_news.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.hp.padc_mm_news.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HP on 11/25/2017.
 */

public class EmptyViewPod extends RelativeLayout {

    @BindView(R.id.iv_placeholder)
    ImageView ivPLaceHolder;

    @BindView(R.id.tv_empty)
    TextView tvEmpty;

    public EmptyViewPod(Context context) {
        super(context);
    }

    public EmptyViewPod(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EmptyViewPod(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public EmptyViewPod(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this,this );
    }

    public void setEmptyData(int emptyImageID,String emptyString){
        ivPLaceHolder.setImageResource(emptyImageID);
        tvEmpty.setText(emptyString);

    }

    public void setEmpty(String emptyString){
        tvEmpty.setText(emptyString);

    }
}
