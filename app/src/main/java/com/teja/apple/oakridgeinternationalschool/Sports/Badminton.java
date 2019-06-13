package com.teja.apple.oakridgeinternationalschool.Sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.teja.apple.oakridgeinternationalschool.Adapter.BadmintonAdapter;
import com.teja.apple.oakridgeinternationalschool.Adapter.CricketAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class Badminton extends Fragment {


    public Badminton() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Badminton Offers");
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Urbanese Badminton Rackets | Multicolor",
                "Klapp Zigma Badminton Set, Adult",
                "Silver's SB-260 COMBO2 Badminton Kit",
                "Yonex Mavis 200i Nylon Shuttle Cock, Pack of 6 (Yellow)",
                "Cosco AERO No. 727 Nylon Shuttle cock (yellow) nylon base. Set of 6 Cock."};
        Integer[] icon = {R.drawable.deals_badminton_1,
                R.drawable.deals_badminton_2, R.drawable.deals_badminton_3,
                R.drawable.deals_badminton_4, R.drawable.deals_baminton_5};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹399.00", "₹383.00 ", "₹599.00 ",
                "₹335.00", "₹ 349.00"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        BadmintonAdapter shrr = new BadmintonAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}



