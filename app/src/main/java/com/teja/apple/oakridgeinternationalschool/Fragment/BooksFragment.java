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
import com.teja.apple.oakridgeinternationalschool.Model;
import com.teja.apple.oakridgeinternationalschool.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BooksFragment extends Fragment {


    public BooksFragment() {
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

        String[] sports = {"Mathematics for Class 8 by R S Aggarwal (2018-19 Session)",
                "The Story of My life Class 10th Paperback – 20 Mar 2015",
                "NCERT Exemplar Problems: Solutions Mathematics Class 10th Paperback – 3 Nov 2014",
                "Mathematics for Class 7 by R D Sharma (2018-19 Session) Paperback – 2018",
                "Introductory Micro Economics for Class 12 (For 2019 Examination) Paperback – 2018",
                "Science Textbook for Class 10- 1064 Paperback – 31 Jan 2017",
                "CBSE Physics Chapterwise Solved Papers Class 12th 2017-2009 Paperback – 2017",
                "CBSE Chemistry Chapterwise Solved Papers Class 12th 2017-2009 Paperback – 2017",
                " Physics for Class 10 (2019 Exam) Paperback – 2018",
                "Science Textbook for Class - 9 - 964 Paperback – 2014 "};

        Integer[] icon = {R.drawable.deals_books_mathematics,
                R.drawable.deals_book2, R.drawable.deals_book3,
                R.drawable.deals_book4, R.drawable.deals_book5,
                R.drawable.deals_book6, R.drawable.deals_book7,
                R.drawable.deals_book8, R.drawable.deals_book9,
                R.drawable.deals_book10,};
        String[] rate = {"20%-50%", "30%-50%", "10%-20%", "70%-90%", "30%-60%", "5%-20% ", "12%-25%", "20%-50%", " 30%-40%",
                "15%-40%"};
        String[] price = {"₹280.00", "₹ 115.00", "₹145.00",
                "₹285.00", "₹305.00", "₹150.00 ", "₹230.00", "₹168.00", " ₹421.00", "₹143"};
        String[] author = {"by R.S. Aggarwal (Author)",
                "by Helen Keller (Author)",
                "by Experts Compilation (Author)",
                "by R.D. Sharma (Author)",
                "by Sandeep Garg (Author)", "by NCERT (Author)",
                "by S K Singh (Author)", "by Purnima Sharma (Author)",
                "by Lakhmir Singh (Author)", "by NCERT (Author)"};



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
        Books_Adapter_Fragment shrr = new Books_Adapter_Fragment(list, getActivity());
        layoutManager = new LinearLayoutManager(getActivity());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(shrr);


        return rootView;
    }





}


