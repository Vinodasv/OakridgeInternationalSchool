package com.teja.apple.oakridgeinternationalschool.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;

public class FootBallAdapter  extends RecyclerView.Adapter< FootBallAdapter.myviewholder>implements View.OnClickListener {
    String sports;

    // AdapterFragmentInterfaces anInterface;
    ArrayList<Model> List;
    private Activity mActivity;

    public  FootBallAdapter(ArrayList<Model> Model, Activity activity) {
        List = Model;
//            anInterface = fragmentInterface;
        this.mActivity = activity;
    }

    @Override
    public  FootBallAdapter.myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_foot_ball, parent, false);
        return new  FootBallAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder( FootBallAdapter.myviewholder holder, int position) {
        holder.textView1.setText(List.get(position).getSports());
        holder.textView1.setTag(List.get(position).getSports());
        // holder.textView1.setText(title[position]);
        holder.image.setTag(List.get(position).getImage());
        holder.image.setImageResource(List.get(position).getImage());

        holder.textView2.setText(List.get(position).getRate());
        holder.textView2.setTag(List.get(position).getRate());

        //  holder.textView3.setText(List.get(position).getAuthor());
        //   holder.textView3.setTag(List.get(position).getAuthor());
        holder.textView4.setText(List.get(position).getPrice());
        holder.textView4.setTag(List.get(position).getPrice());

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
    @Override
    public void onClick(View v) {
    }
    public class myviewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView textView1;
        TextView textView2;

        //  TextView textView3;
        TextView textView4;
        public myviewholder(View context) {
            super(context);
            image = context.findViewById(R.id.profile_icon);
            textView1 = context.findViewById(R.id.textView);
            textView2 = context.findViewById(R.id.textView2);

            // textView3 = context.findViewById(R.id.textView3);
            textView4 = context.findViewById(R.id.textView4);
        }
    }
}