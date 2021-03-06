package com.ethanhua.skeleton.sample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ethanhua.skeleton.sample.R;
import com.ethanhua.skeleton.sample.model.NewsModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ethanhua on 2017/7/27.
 */

public class NewsAdapter extends RecyclerView.Adapter<SimpleRcvViewHolder> {
    private List<NewsModel> mDatas;

    public NewsAdapter(List<NewsModel> newsModels) {
        this.mDatas = newsModels==null?new ArrayList<NewsModel>():newsModels;
    }

    @Override
    public SimpleRcvViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SimpleRcvViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false));
    }

    @Override
    public void onBindViewHolder(SimpleRcvViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }


}
