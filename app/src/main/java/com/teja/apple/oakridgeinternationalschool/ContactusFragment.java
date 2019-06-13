package com.teja.apple.oakridgeinternationalschool;


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

public class ContactusFragment extends Fragment{
    public ContactusFragment() {
        // Required empty public constructor
    }

    WebView wvPage1;
    String url = "http://www.oakridge.in/contact/";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_contactus, container, false);
        wvPage1 = (WebView)v.findViewById(R.id.wvPage1);
        wvPage1.loadUrl(url);
        WebSettings settings = wvPage1.getSettings();
        settings.setJavaScriptEnabled(true);
        wvPage1.setWebViewClient(new MyWebViewClient());
        return v;
    }

    public static class MyWebViewClient extends WebViewClient{
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