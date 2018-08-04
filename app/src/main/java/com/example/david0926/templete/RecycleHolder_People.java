package com.example.david0926.templete;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecycleHolder_People extends RecyclerView.ViewHolder{

    public TextView name, msg, time;

    public RecycleHolder_People(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.people_name);
        msg = itemView.findViewById(R.id.people_msg);
        time = itemView.findViewById(R.id.people_time);


    }
}
