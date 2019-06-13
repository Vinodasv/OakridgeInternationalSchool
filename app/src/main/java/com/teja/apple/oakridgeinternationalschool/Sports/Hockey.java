package com.teja.apple.oakridgeinternationalschool.Sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.CricketAdapter;
import com.teja.apple.oakridgeinternationalschool.Adapter.HockeyAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.DealsFragment;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.NavigationActivity;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class Hockey extends Fragment {


    public Hockey() {
        // Required empty public constructor
    }


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Hockey Offers");

        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);

        String[] sports = {"PORT Match Field Hockey Ball Pack of 1",
                "Forever Online Shopping Colored Hockey Balls Set Of 2",
                "Sunley Edge Hockey Stick L-36 For Practice Level",
                "CE Teranga Punjab Tiger Hockey Stick With Full PVC Grip-Full Size",
                "Hockey ball (traning)- Size Standard , Professional Wooden, Solid Blade Mulbery Head , Firm Rubber Grip"
               };
        Integer[] icon = {R.drawable.deals_hockey_1,
                R.drawable.deals_hockey_2, R.drawable.deals_hockey_3,
                R.drawable.deals_hockey_4, R.drawable.deals_hockey_5};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹199.00", "₹165.00 ", "₹ 399.00 ",
                "₹ 230.00", "₹ 265.00"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        HockeyAdapterFragment shrr = new HockeyAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


