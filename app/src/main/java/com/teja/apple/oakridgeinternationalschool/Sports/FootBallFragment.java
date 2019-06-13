package com.teja.apple.oakridgeinternationalschool.Sports;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.FootBallAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FootBallFragment extends Fragment {


    public FootBallFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Football Offers");
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Okayji Soccer Socks / Football Stocking, 2 Pair, Yellow",
                "Avatoz FCB Replica Football - Size: 5, Diameter: 26 Cm (Pack Of 1, Multicolor)",
                "Cosco Rio Football, Size 3 (Small Sized Football)",
                "Nivia Premier Carbonite Range Football Studs (Black/Orange)",
                "Vector X Volt Football Shoes",
                "Alka Football Four Colour Brazuka, Size 5"};
        Integer[] icon = {R.drawable.deals_foot_1,
                R.drawable.deals_foot_2, R.drawable.deals_football_3,
                R.drawable.deals_football_4, R.drawable.deals_football_5,
                R.drawable.deals_foot_6};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%", "5%-20% "};
        String[] price = {"₹305.00", "₹ 389.00 ", "₹ 305.00 ",
                          "₹850.00", "₹ 499.00", "₹ 550.00 "};

        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        FootBallAdapter shrr = new FootBallAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }
}

