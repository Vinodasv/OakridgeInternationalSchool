package com.teja.apple.oakridgeinternationalschool.Fragment;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import android.support.v4.app.Fragment;
//import android.app.FragmentTransaction;
import com.teja.apple.oakridgeinternationalschool.Adapter.SportsAdapterFragment;
import com.teja.apple.oakridgeinternationalschool.AdapterFragmentInterfaces;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.NavigationActivity;
import com.teja.apple.oakridgeinternationalschool.R;
import com.teja.apple.oakridgeinternationalschool.RecyclerItemClickListener;
import com.teja.apple.oakridgeinternationalschool.Recyclerclick;
import com.teja.apple.oakridgeinternationalschool.Sports.Badminton;
import com.teja.apple.oakridgeinternationalschool.Sports.BasketBall;
import com.teja.apple.oakridgeinternationalschool.Sports.CarromBoard;
import com.teja.apple.oakridgeinternationalschool.Sports.Chess;
import com.teja.apple.oakridgeinternationalschool.Sports.CricketFragment;
import com.teja.apple.oakridgeinternationalschool.Sports.FootBallFragment;
import com.teja.apple.oakridgeinternationalschool.Sports.Hockey;
import com.teja.apple.oakridgeinternationalschool.Sports.Swimming;
import com.teja.apple.oakridgeinternationalschool.Sports.Tennis;
import com.teja.apple.oakridgeinternationalschool.Sports.VolleyBall;

import java.util.ArrayList;

import static com.teja.apple.oakridgeinternationalschool.NavigationActivity.replaceFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SportsFragment extends Fragment implements RecyclerView.OnItemTouchListener {

    public SportsFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private int i;
    private static FragmentManager fragmentManager;
    LinearLayout linearLayout;
    //   private RecyclerView recyclerView;
    //   private RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter CricketAdapter;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // fragmentManager = getSupportFragmentManager();
        View rootView = inflater.inflate(R.layout.fragment_sports, container, false);

        recyclerView = rootView.findViewById(R.id.rvHome);

        // getActivity().setTitle("Home");
        //fragmentManager =rootView.getSupportFragmentManager();
        String[] sports = {"Cricket", "FootBall", "Tennis",
                "BasketBall", "VolleyBall", "Hockey",
                "Badminton", "Swimming", " Chess",
                "Carrom Board"};

        Integer[] icon = {R.drawable.deals_sports_cricket,
                R.drawable.deals_sports_football, R.drawable.deals_sports_tennis,
                R.drawable.deals_sports_basket, R.drawable.deals_sports_volleyball,
                R.drawable.deals_sports_hocky, R.drawable.deals_sports_badminton,
                R.drawable.deals_sports_swimming, R.drawable.deals_sports_chess,
                R.drawable.deals_sports_carromboard,};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%",
                "70%-90%", "30%-60%", "5%-20% ",
                "12%-25%", "20%-50%", " 30%-40%",
                "15%-40%"};


        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setSports(sports[i]);
            sh.setImage(icon[i]);
            sh.setRate(rate[i]);
            list.add(sh);
        }
        SportsAdapterFragment shrr = new SportsAdapterFragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);
        recyclerView.setHasFixedSize(true);

        context = getContext();
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(),
                new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
               /* Intent intent = new Intent(getContext(),InterviewActivity.class);
                startActivity(intent);*/
//                mPosition = position;
                        moveToPosition1(position);
//                pref = getActivity().getSharedPreferences("MyPref",MODE_PRIVATE);
//                editor = pref.edit();
//                editor.putInt("mPosition",mPosition);
//                editor.commit();
//                editor.apply();
                    }
                }));


        return rootView;
    }


    public void moveToPosition1(int i) {

        if (i == 0) {

            CricketFragment abc = new CricketFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);

//            CricketFragment frg = new CricketFragment();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();


        } else if (i == 1) {
            FootBallFragment abc = new FootBallFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            FootBallFragment frg = new FootBallFragment();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();


        } else if (i == 2) {

            Tennis abc = new Tennis();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            Tennis frg = new Tennis();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();

        } else if (i == 3) {

            BasketBall abc = new BasketBall();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            BasketBall frg = new BasketBall();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();

        } else if (i == 4) {

            VolleyBall abc = new VolleyBall();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            VolleyBall frg = new VolleyBall();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();


        } else if (i == 5) {

            Hockey abc = new Hockey();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            Hockey frg = new Hockey();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();

        } else if (i == 6) {

            Badminton abc = new Badminton();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            Badminton frg = new Badminton();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();

        } else if (i == 7) {

            Swimming abc = new Swimming();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            Swimming frg = new Swimming();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();


        } else if (i == 8) {

            Chess abc = new Chess();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            Chess frg = new Chess();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();


        } else if (i == 9) {

            CarromBoard abc = new CarromBoard();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);

//            CarromBoard frg = new CarromBoard();
//            FragmentManager manager =getActivity().getSupportFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();

        }


    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }

}


