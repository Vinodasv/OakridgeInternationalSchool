package com.teja.apple.oakridgeinternationalschool.Fragment;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.teja.apple.oakridgeinternationalschool.Adapter.HomeNavigationAdapter;
import com.teja.apple.oakridgeinternationalschool.CalenderFragment;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;
import com.teja.apple.oakridgeinternationalschool.RecyclerItemClickListener;

import java.util.ArrayList;

import static com.teja.apple.oakridgeinternationalschool.NavigationActivity.replaceFragment;


/**
 * A simple {@link Fragment} subclass.
 */
//import static com.teja.apple.oakridgeinternationalschool.NavigationActivity.replaceFragment;


public class HomeNavigationFragment extends Fragment implements RecyclerView.OnItemTouchListener{

    CardView cardView;

    private SharedPreferences pref;

  // private SharedPreferences pref;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private int i;
    private static FragmentManager fragmentManager;
    LinearLayout linearLayout;
  //  private int position;
    RecyclerView.Adapter HomeNavigationAdapter;
    Context context;
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.carousel_view, R.drawable.carousel_view0, R.drawable.carousel_view2,
             R.drawable.carousel_view3, R.drawable.carousel_view4,R.drawable.carousel_view5 ,R.drawable.carousel_view1};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.navigation_home_page, container, false);
        recyclerView = rootView.findViewById(R.id.rvHome);
        TextView textView1=rootView.findViewById(R.id.tx);
        getActivity().setTitle("Home");

       // fragmentManager =rootView.getSupportFragmentManager();

        final String[] title = {"Profile", "Announcement", "Attendance",
                "Diary", "Deals", "Bus Location",
                "Fees", "Calender", " Communication",
                "Settings", "Exam", "Materials"};

        int[] icon = {R.drawable.profile_icon, R.drawable.announcement_icon, R.drawable.attendance_icon,
                R.drawable.diary_icon, R.drawable.deals_icon, R.drawable.bus_location_icon,
                R.drawable.fees_icon, R.drawable.calender_icon, R.drawable.parents_icon,
                R.drawable.settings_icon, R.drawable.exam_icon,
                R.drawable.materials_icon};

        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i < icon.length; i++) {
            Model sh = new Model();
            sh.setTitle(title[i]);
            sh.setImage(icon[i]);
            list.add(sh);
        }
        com.teja.apple.oakridgeinternationalschool.Adapter.HomeNavigationAdapter shrr = new HomeNavigationAdapter(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);
        recyclerView.setHasFixedSize(true);

        context = getContext();

//        linearLayout = (LinearLayout) rootView.findViewById(R.id.l1);
//       recyclerView = (RecyclerView) rootView.findViewById(R.id.rvHome);
//        cardView = (CardView) rootView.findViewById(R.id.cardview1);
//        layoutManager = new LinearLayoutManager(context);
//        recyclerView.setLayoutManager(layoutManager);



        carouselView = (CarouselView) rootView.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);


        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(),
                new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
               /* Intent intent = new Intent(getContext(),InterviewActivity.class);
                startActivity(intent);*/
//                mPosition = position;
                moveToPosition(position);
//                pref = getActivity().getSharedPreferences("MyPref",MODE_PRIVATE);
//                editor = pref.edit();
//                editor.putInt("mPosition",mPosition);
//                editor.commit();
//                editor.apply();
            }
        }));


        return rootView;
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };



    public void moveToPosition(int i){

        if (i == 0) {
            ProfileFragment abc = new ProfileFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
//            ProfileFragment frg = new ProfileFragment();
//            FragmentManager manager = getFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();
        }

        if (i == 1) {
            Toast.makeText(getActivity(),"Project under developing ",Toast.LENGTH_SHORT).show();
        }
        if(i==2){
            Toast.makeText(getActivity(),"Project under developing ",Toast.LENGTH_SHORT).show();
        }

        if(i==3){
            Toast.makeText(getActivity(),"Project under developing ",Toast.LENGTH_SHORT).show();
        }


        if(i==4){
            DealsFragment abc = new DealsFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);

//            DealsFragment frg = new DealsFragment();
//            FragmentManager manager = getFragmentManager();
//            manager.beginTransaction().replace(R.id.s, frg).commit();
        }
        if(i==5){
            Toast.makeText(getActivity(),"Developing Backend ",Toast.LENGTH_SHORT).show();
        }
        if(i==6){
            Toast.makeText(getActivity(),"Project under developing",Toast.LENGTH_SHORT).show();
        }
        if(i==7) {


            CalenderFragment abc = new CalenderFragment();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);
        }
        if(i==8) {
            Toast.makeText(getActivity(),"Project under developing ",Toast.LENGTH_SHORT).show();

        }
        if(i==9) {
            Toast.makeText(getActivity(),"Project under developing ",Toast.LENGTH_SHORT).show();


        }
        if(i==10) {
            Toast.makeText(getActivity(),"Project under developing ",Toast.LENGTH_SHORT).show();
        }
        if(i==11) {
            MaterialFragment abc = new MaterialFragment ();
            replaceFragment(abc, HomeNavigationFragment.class.getSimpleName(), true);

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





    





