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
import com.teja.apple.oakridgeinternationalschool.Adapter.SwimmingAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class Swimming extends Fragment {


    public Swimming() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Swimming Offers");

        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Swimming-Combo-194-200-EAR-PLUG-PARENT",
                "Aurion LEAKPRF Swimming Goggles (Black)",
                "Rovars Unisex Swimwear",
                "Intex 59241 Kids Circular Inflatable Swim Ring Float, Size 61 cm, For Ages 6 – 10 Years",
                "Speedo Silicon Flat Swimcap"};
        Integer[] icon = {R.drawable.deals_swimming_1,
                R.drawable.deals_swimming_2, R.drawable.deals_swimming_3,
                R.drawable.deals_swimming_4, R.drawable.deals_swimming_5};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹196.88", "₹425.00 ", "₹700.00 ",
                "₹235.00", "₹399.00"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        SwimmingAdapterFragment shrr = new SwimmingAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


