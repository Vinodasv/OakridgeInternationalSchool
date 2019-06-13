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

import com.teja.apple.oakridgeinternationalschool.ContactusFragment;
import com.teja.apple.oakridgeinternationalschool.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaterialFragment extends Fragment {


    public MaterialFragment() {
        // Required empty public constructor
    }

    WebView wvPagemat;
    String url = "http://stores.oakridge.in/#";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_material, container, false);
        wvPagemat = (WebView)v.findViewById(R.id.wvPagemat);
        wvPagemat.loadUrl(url);
        WebSettings settings = wvPagemat.getSettings();
        settings.setJavaScriptEnabled(true);
        wvPagemat.setWebViewClient(new MaterialFragment.MyWebViewClient());
        return v;
    }

    private class MyWebViewClient extends WebViewClient {
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
    }}