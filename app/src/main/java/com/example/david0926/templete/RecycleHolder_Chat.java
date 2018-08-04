package com.example.david0926.templete;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecycleHolder_Chat extends RecyclerView.ViewHolder{

    public TextView name, msg, time;

    public RecycleHolder_Chat(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.chat_name);
        msg = itemView.findViewById(R.id.chat_msg);
        time = itemView.findViewById(R.id.chat_time);


    }
}
