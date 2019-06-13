package com.teja.apple.oakridgeinternationalschool.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.Adapter.Books_Adapter_Fragment;
import com.teja.apple.oakridgeinternationalschool.Adapter.PuzzlesAdapter;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PuzzlesRiddlesFragment2 extends Fragment {


    public PuzzlesRiddlesFragment2() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_sports, container, false);
        recyclerView=rootView.findViewById(R.id.rvHome);

        // getActivity().setTitle("Home");

        String[] sports = {
                "Brain Games for Clever Kids Paperback – 12 Oct 2016",
                "Crosswords for Clever Kids Paperback – 12 Feb 2015",
                "The Kids' Book of Crosswords 1 Paperback – 30 May 2017",
                "The Mammoth Book of Logical Brain Games (Mammoth Books) Paperback – 12 May 2016",
                "Walker's Manly Exercises Kindle Edition",
                "Know Your Own I.Q. Paperback – 30 Nov 1962",
                "The Moscow Puzzles: 359 Mathematical Recreations Kindle Edition",
                "Ball of Confusion: Puzzles, Problems and Perplexing Posers Kindle Edition",
                " Oor Wullie's New Funbook Volume 1 Paperback – Import, 27 Jul 2015",
                "The World of the Witcher: Video Game Compendium19 May 2015"};

        Integer[] icon = {R.drawable.deals_puzzle_1,
                R.drawable.deals_puzzle_2, R.drawable.deals_puzzle_3,
                R.drawable.deals_puzzle_4, R.drawable.deals_puzzle_5,
                R.drawable.deals_puzzle_6, R.drawable.deals_puzzle_7,
                R.drawable.deals_puzzle_8, R.drawable.deals_puzzle_9,
                R.drawable.deals_puzzle_10,};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%", "5%-20% ", "12%-25%", "20%-50%", " 30%-40%",
                "15%-40%"};
        String[] price = {"₹178.00", "₹ 225.00", "₹266.00",
                          "₹337.00", "₹654.00", "₹514.00 ",
                          "₹275.00", "₹321.00", " ₹948.48",
                          "₹1908.00"};
        String[] author = {"by Gareth Moore (Author)",
                "by Gareth Moore (Illustrator, Author)",
                "by Gareth Moore (Author)",
                "by Gareth Moore (Author)",
                "by Donald Walker (Author))",
                "by Hans J. Eysenck (Author)",
                "by Boris A. Kordemsky (Author))",
                "by Johnny Ball (Author)",
                "by Oor Wullie (Author)",
                "by CD Projekt Red (Author)"};



        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            sh.setPrice(price[i]);
            sh.setAuthor(author[i]);
            list.add(sh);
        }
        PuzzlesAdapter shrr = new PuzzlesAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


