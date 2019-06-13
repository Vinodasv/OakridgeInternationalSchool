package com.teja.apple.oakridgeinternationalschool.Sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.CricketAdapter;
import com.teja.apple.oakridgeinternationalschool.Adapter.TennisAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class Tennis extends Fragment {


    public Tennis() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Tennis Offers");

        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Kurtzy Set Of 2 Kids Tennis Racket With One Ball And One Carry Bag With Perfect Grip",
                "Stag 2 Star Table Tennis Racquet",
                "Head Penn X-Out Tennis Ball (Set of 3)",
                "Hi-Quality and Innovative Retractable Table-Tennis Net withAdjustable Length and Push Clamps – Portable and Fits Most Tables",
                "Wilson Grand Slam Tennis Racquet"};
        Integer[] icon = {R.drawable.deal_tennis_1,
                R.drawable.deals_tennis_2, R.drawable.deals_tennis_3,
                R.drawable.deals_tennis_4, R.drawable.deal_tennis_5};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹649.00", "₹ 175.00 ", "₹  225.00 ",
                "₹ 749.00", "₹ 2,133.00"};
        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        TennisAdapterFragment shrr = new TennisAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


