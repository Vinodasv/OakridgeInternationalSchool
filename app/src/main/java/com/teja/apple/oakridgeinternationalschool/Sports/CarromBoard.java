package com.teja.apple.oakridgeinternationalschool.Sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.CarromBoardAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.Adapter.CricketAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class CarromBoard extends Fragment {


    public CarromBoard() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("CarromBoard Offers");
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Protoner Carom Board Set,Multi Color",
                "Natraj Wooden Carrom Coins (24 Carrom Coins with 2 Striker & 1 Powder)",
                "A - One Pocket Carrom Board With 24 Coins Striker & 2 Carrom Powder Medium Size - Brown",
                "Tryviz KKS Full size(Large) 32' Inches Cut Pocket Carrom Board with Free COINS, STRIKER & CARROM POWDER ((Free Of Cost))",
                "A-One Traders ( Natraj Wood Quality) 24 Carrom Coins & 2 Carrom Striker & 2 Powder (Combo Pack)",
               };
        Integer[] icon = {R.drawable.deals_carrom_1,
                R.drawable.deals_carrom_2, R.drawable.deals_carrom_3,
                R.drawable.deals_carrom_4, R.drawable.deals_carrom_5};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%"};
        String[] price = {"₹899.00", "₹289.00 ", "₹ 1,099.00 ",
                "₹ 1,399.00", "₹ 299.00"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        CarromBoardAdapterFragment shrr = new CarromBoardAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


