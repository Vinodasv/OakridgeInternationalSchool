package com.teja.apple.oakridgeinternationalschool.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.StationaryitemAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class StationaryItemFragment extends Fragment {


    public StationaryItemFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_stationary_item_adapter, container, false);
        View rootView= inflater.inflate(R.layout.fragment_sports, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome);

        getActivity().setTitle("StationaryItem");

        String[] sports = {"Nataraj 621 Pencils - Pack of 10", "Cello Fine Grip Ball Pens, Black - Pack of 5",
                "Cello Pinpoint Ballpoint Pens - Blue (Pack of 10)",
                "Cello Topball Click Retractable Ballpoint Pen",
                "Classmate Long Notebook - A4, Soft Cover, 240 Pages, Single Line - Pack of 6",
                "Classmate Long Notebook - 297mm x 210mm, Soft Cover, 180 Pages, Single Line (Pack of 6)",
                "Texas Instruments BA II Plus Financial Calculator",
                "Camlin Kokuyo Scholar Mathematical Drawing Instruments FREE camlin pen pencil",
                " Classmate Archimedes Geometry box",
                " Barbie Polyester 18 Inch Red and Yellow Children's Backpack (Age group :8-12 yrs)"};
        Integer[] icon = {R.drawable.deals_stationary1,
                R.drawable.deals_stationary2, R.drawable.deals_stationary3,
                R.drawable.deals_stationary4, R.drawable.deals_stationary5,
                R.drawable.deals_stationary6, R.drawable.deals_stationary7,
                R.drawable.deals_stationary8, R.drawable.deals_stationary9,
                R.drawable.deals_stationary10,};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%", "5%-20% ", "12%-25%", "20%-50%", " 30%-40%",
                "15%-40%"};
        String[] price = {"₹40.00", "₹  35.00 ", "₹ 93.00 ",
                "₹80.00", "₹ 450.00", "₹360.00 ", "₹600.00", "₹99.00", " ₹150.00", "₹799"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        StationaryitemAdapter shrr = new StationaryitemAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


