package com.teja.apple.oakridgeinternationalschool.Sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.BasketBallAdapter;
import com.teja.apple.oakridgeinternationalschool.Adapter.CricketAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class BasketBall extends Fragment {


    public BasketBall() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("BasketBall Offers");
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Kipsta Tarmak Puncture Proof Basketball - Size 7",
                "Nivia Top Grip Basketball",
                "Klapp Basketball Ring With Nets",
                "Spalding NBA Player Multicolor Size 7 Basketball",
                "HITSAN Mini Basketball Set Indoor Net Hoop with Ball Pump Indoor Sporting Game Goods One Piece",
                };
        Integer[] icon = {R.drawable.deals_basketball_1,
                R.drawable.deals_basketball_2, R.drawable.deals_basketball_3,
                R.drawable.deals_basketball_4, R.drawable.deals_basketball_5};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹1,449.00", "₹511.00 ", "₹1,129.00 ",
                "₹ 1,189.00", "₹ 5,150.00"};

        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        BasketBallAdapter shrr = new BasketBallAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


