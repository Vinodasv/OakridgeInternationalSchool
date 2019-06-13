package com.teja.apple.oakridgeinternationalschool.Adapter;


import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.teja.apple.oakridgeinternationalschool.AdapterFragmentInterfaces;
import com.teja.apple.oakridgeinternationalschool.Fragment.HomeNavigationFragment;
import com.teja.apple.oakridgeinternationalschool.Fragment.SportsFragment;
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;
import com.teja.apple.oakridgeinternationalschool.Sports.CricketFragment;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SportsAdapterFragment extends RecyclerView.Adapter<SportsAdapterFragment.myviewholder>{
    String sports;
    ArrayList<Model> List;
    private Activity mActivity;

    String  rate;
    Bitmap bitmap;
    AdapterFragmentInterfaces anInterface;
   // ArrayList<Model> List;
 //   private Activity mActivity;

    public SportsAdapterFragment(ArrayList<Model> Model, Activity activity) {
        List = Model;
        this.mActivity = activity;
       // anInterface = fragmentInterface;
    }

    @Override
    public SportsAdapterFragment.myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_sports_adapter, parent, false);
        return new SportsAdapterFragment.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(SportsAdapterFragment.myviewholder holder, int position) {
        holder.textView1.setText(List.get(position).getSports());
        holder.textView1.setTag(List.get(position).getSports());

        holder.image.setTag(List.get(position).getImage());
        holder.image.setImageResource(List.get(position).getImage());

        holder.textView2.setText(List.get(position).getRate());
        holder.textView2.setTag(List.get(position).getRate());
        holder.setIsRecyclable(false);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do your further respective fragment activity task
            }
        });
    }
    @Override
    public int getItemCount() {
        return List.size();
    }


    public class myviewholder extends RecyclerView.ViewHolder  {
        ImageView image;
        TextView textView1;
        TextView textView2;
        public CardView cardView;
        public myviewholder(View context) {
            super(context);
            image = context.findViewById(R.id.profile_icon);
            textView1 = context.findViewById(R.id.textView);
            textView2 = context.findViewById(R.id.textView2);
            cardView=context.findViewById(R.id.cardview1);
           // cardView.setOnClickListener(this);

        }



        }
    }

