package com.example.david0926.templete;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Tab_People extends Fragment{


    RecyclerView rcv;
    RecycleAdapter_People rcvAdap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_people, container, false);
        rcv = v.findViewById(R.id.people_recycler);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false);
        rcv.setLayoutManager(lm);
        rcvAdap = new RecycleAdapter_People();
        rcv.setAdapter(rcvAdap);

        for(int i=0;i<10;i++) {
            View itemImageView = inflater.inflate(R.layout.recycle_item_people, container, false);
            ImageView profile = itemImageView.findViewById(R.id.people_profile);
            profile.setBackground(new ShapeDrawable(new OvalShape()));
            profile.setClipToOutline(true);
            RecycleModel_People model = new RecycleModel_People();
            model.setProfile(profile);
            model.setName("Someone");
            model.setMsg("Hello World!");
            model.setTime("12:53 PM");
            rcvAdap.add(model);
            rcvAdap.notifyDataSetChanged();
        }

        return v;
    }
}
