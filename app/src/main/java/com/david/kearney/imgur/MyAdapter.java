package com.david.kearney.imgur;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by David on 2/7/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<ViewHolder>{

    private String[] mDataset;

    public MyAdapter(String[] myDataset){
        this.mDataset = myDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View layoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.name_list, null);

        // TODO Set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(layoutView);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount(){
        return mDataset.length;
    }
}
