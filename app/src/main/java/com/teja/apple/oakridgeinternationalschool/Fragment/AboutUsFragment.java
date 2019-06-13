package com.teja.apple.oakridgeinternationalschool.Fragment;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;
import com.teja.apple.oakridgeinternationalschool.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUsFragment extends Fragment {

Context context;
RelativeLayout rl;
    public AboutUsFragment() {
        // Required empty public constructor
    }


    WebView mywebview;
    String url = "http://www.oakridge.in/bangalore-international-school";
    CarouselView carouselView;
    int[] sampleImages = {R.drawable.carousel_view, R.drawable.carousel_view0, R.drawable.carousel_view2, R.drawable.carousel_view3, R.drawable.carousel_view4,R.drawable.carousel_view5 ,R.drawable.carousel_view1};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("About Us");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about_us, container, false);
        if (isOnline(getActivity())) {
        carouselView = (CarouselView)view.findViewById(R.id.carouselView);
        rl=view.findViewById(R.id.rl);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

            WebView mywebview = (WebView)view.findViewById(R.id.webView1);
            mywebview.loadUrl(url);

            WebSettings webSettings = mywebview.getSettings();
            webSettings.setJavaScriptEnabled(true);
            rl.setVisibility(View.GONE);

            // Force links and redirects to open in the WebView instead of in a browser
            mywebview.setWebViewClient(new WebViewClient());
            getActivity().setTitle("About Oakridge ");

        }

        else {

            carouselView = (CarouselView)view.findViewById(R.id.carouselView);
            carouselView.setPageCount(sampleImages.length);
            carouselView.setImageListener(imageListener);
        }
        return view;
    }
public boolean isOnline(Context c){
        ConnectivityManager cm = (ConnectivityManager) c
        .getSystemService(Context.CONNECTIVITY_SERVICE);
    NetworkInfo ni = cm.getActiveNetworkInfo();

    if (ni != null && ni.isConnected())
        return true;
    else
        return false;

}
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }

    };

}
