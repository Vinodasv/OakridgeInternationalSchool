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
import com.teja.apple.oakridgeinternationalschool.Adapter.StationaryitemAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CricketFragment extends Fragment {


    public CricketFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Cricket Offers");
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Mrf VIRAT KOHLI SIGNATURE GENIOUS POPULAR WILLOW BAT",
                           "Ceat Popular Willow Bat Full Size Play For Tennis Ball With Full Bat Cover",
                           "DSC Scorer Kashmir Willow Cricket Bat Short Handle Mens",
                           "AVM Splash 20-20 Popular Cricket Bat (Blue)",
                           "Forever Genuine Leather Cricket Ball Set of 6",
                           "Cosco Light Cricket Tennis Ball",
                           "Wooden Wickets Cricket Stumps with Bails",
                           "DSC Intense Rage Cricket Batting Gloves Boys Right (Color May Vary)",
                           "SG Smart Cricket Helmet",
                           "BDM SuperLite Cricket Kit for youth"};
        Integer[] icon = {R.drawable.deals_cricket_1,
                R.drawable.deals_cricket_2, R.drawable.deals_cricket_3,
                R.drawable.deals_cricket_4, R.drawable.deals_cricket_5,
                R.drawable.deals_cricket_6, R.drawable.deals_cricket_7,
                R.drawable.deals_cricket_8, R.drawable.deals_cricket_9,
                R.drawable.deals_cricket_10,};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%", "5%-20% ", "12%-25%", "20%-50%", " 30%-40%",
                "15%-40%"};
        String[] price = {"₹520.00", "₹   599.00 ", "₹ 1,290.00 ",
                          "₹ 577.00", "₹ 710.00", "₹389.00 ",
                          "₹299.00", "₹ 900.00", " ₹984.00",
                          "₹4,361"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        CricketAdapter shrr = new CricketAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


