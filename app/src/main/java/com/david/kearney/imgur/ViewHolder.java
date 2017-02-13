package com.david.kearney.imgur;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by David on 2/7/2017.
 */


public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView mTextView;

    public ViewHolder(View v){
        super(v);
        v.setOnClickListener(this);
        mTextView = (TextView) v.findViewById(R.id.person_name);
    }

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(), "Clicked Position = " + getAdapterPosition(),
                Toast.LENGTH_SHORT).show();
    }
}
