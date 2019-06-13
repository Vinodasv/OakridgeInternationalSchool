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
import com.teja.apple.oakridgeinternationalschool.Adapter.VolleyBallAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class VolleyBall extends Fragment {


    public VolleyBall() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("VolleyBall Offers");

        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Wasan Soft Feel Volleyball - Yellow (12 years and above)",
                "Queen Sports Volleyball Net Standard quality Cotton Beige Standard Size for Sports Training Practice and Fun",
                "Cosco Shot Volleyball, 4",
                "GEE Nylon Standard Size Volleyball Net, All nylon (Black)",
                "Nivia Pu-5000 Pu-18P Volleyball, Size 4",
                };
        Integer[] icon = {R.drawable.deals_volleyball_1,
                R.drawable.deals_volleyball_2, R.drawable.deals_volleyball_3,
                R.drawable.deals_volleyball_4, R.drawable.deals_volleyball_5
               };
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹329.00", "₹449.00 ", "₹380.00 ",
                "₹ 359.00", "₹  551.00"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        VolleyBallAdapterFragment shrr = new VolleyBallAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}

