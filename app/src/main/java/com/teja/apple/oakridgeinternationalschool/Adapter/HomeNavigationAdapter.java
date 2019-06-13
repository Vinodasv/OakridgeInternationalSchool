package com.teja.apple.oakridgeinternationalschool.Adapter;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

//import static com.teja.apple.oakridgeinternationalschool.NavigationActivity.replaceFragment;

/**
 * Created by raja on 27/03/2018.
 */
    public class HomeNavigationAdapter extends RecyclerView.Adapter<HomeNavigationAdapter.myviewholder> {
    String title;
    Bitmap bitmap;
    private TextView textView1;
    private static FragmentManager fragmentManager;
    private int position;
    ArrayList<Model> List;
    private Activity mActivity;

    public HomeNavigationAdapter(ArrayList<Model> Model, Activity mActivity) {
        List = Model;

        this.mActivity = mActivity;
    }


    @Override
    public HomeNavigationAdapter.myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_adapter_navigation, parent, false);
        return new HomeNavigationAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(HomeNavigationAdapter.myviewholder holder, int position) {
        holder.textView1.setText(List.get(position).getTitle());
        holder.textView1.setTag(List.get(position).getTitle());

        //holder.icon.setTag(List.get(position).getIcon());
        holder.icon.setImageResource(List.get(position).getImage());
      //holder.icon.setTag(List.get(position).getUrl());
        holder.setIsRecyclable(false);

    }



    @Override
    public int getItemCount() {
        return List.size();
    }



    public static class myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView textView1;
        public  CircleImageView icon;
        public CardView cardView;
        public myviewholder(View v){
            super(v);

            textView1=v.findViewById(R.id.tx);
            icon=v.findViewById(R.id.profile_image);
            cardView=v.findViewById(R.id.cardview1);
            cardView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
           // int position = Integer.parseInt(cardView.getTag().toString());
//
        }
    }
}
