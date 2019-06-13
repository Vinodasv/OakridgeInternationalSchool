package com.teja.apple.oakridgeinternationalschool.Sports;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.ChessAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.Adapter.CricketAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class Chess extends Fragment {


    public Chess() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Chess Offers");
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_cricket, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome1);

        String[] sports = {"Speedy Grand Master Chess Set (Vinly Matt + Heavy Coins) With Special Travel Case",
                "Wigano Roll-Up Vinyl Tournament Chess Set with Two Extra Queens, Green",
                "Sunshine Folding Chess Board Set Wooden Game Handmade, Classic Game Of Brilliance (12 Inch)",
                "Funskool Chess Classic"};
        Integer[] icon = {R.drawable.deals_chess_1,
                R.drawable.deals_chess_2, R.drawable.deals_chess_3,
                R.drawable.deals_chess_4};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%"};
        String[] price = {"₹309.00", "₹ 685.00 ", "₹ 425.00 ",
                "₹ 313.00"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);

            list.add(sh);
        }
        ChessAdapterFragment shrr = new ChessAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}



