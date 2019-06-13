package com.teja.apple.oakridgeinternationalschool.Fragment;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.teja.apple.oakridgeinternationalschool.R;

public class MapFragment extends Fragment{

    public MapFragment() {
        // Required empty public constructor
    }

    WebView wvPage2;
    String url = "https://www.google.co.in/maps/place/Oakridge+International+School/@12.887557,77.7497793,17z/data=!3m1!4b1!4m5!3m4!1s0x3bae0d539b9bf9ef:0x8173c2437f9bc14d!8m2!3d12.887557!4d77.751968";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_map, container, false);
        wvPage2 = (WebView)v.findViewById(R.id.wvPage2);
        wvPage2.loadUrl(url);
        WebSettings settings = wvPage2.getSettings();
        settings.setJavaScriptEnabled(true);
        wvPage2.setWebViewClient(new MyWebViewClient());
        return v;
    }

    private class MyWebViewClient extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @SuppressWarnings("deprecation")
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            final Uri uri = Uri.parse(url);
            return true;
        }

        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }

}