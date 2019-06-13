package com.teja.apple.oakridgeinternationalschool.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class DealsFragment extends Fragment {


    public DealsFragment() {
        // Required empty public constructor
    }
    View view;
    Adapter adapter;
    private void setupViewPager(ViewPager viewPager) {
///<b><span style="font-size: large;">     adapter = new Adapter(getChildFragmentManager());</span></b>
        adapter = new Adapter(getChildFragmentManager());
        adapter.addFragment(new SportsFragment(), "Sports");
        adapter.addFragment(new BooksFragment(), "Books");
       // adapter.addFragment(new UniformsFragment(), "Uniforms");
        adapter.addFragment(new StationaryItemFragment(), "StationaryItem");
        adapter.addFragment(new PuzzlesRiddlesFragment2(), "Puzzles");
        viewPager.setAdapter(adapter);
    }
        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_deals, container, false);
            getActivity().setTitle("Deals");
            super.onCreate(savedInstanceState);
            ButterKnife.bind(this, view);
            final ViewPager viewPager = ButterKnife.findById(view, R.id.viewpager);
            setupViewPager(viewPager);
            TabLayout tabLayout = ButterKnife.findById(view, R.id.tabs);
            tabLayout.setupWithViewPager(viewPager);
            return view;


    }


   @Override
   public void onDestroyView() {
       super.onDestroyView();
      // ButterKnife.unbind(this);
    }



    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public Adapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitles.get(position);
        }
    }



}
