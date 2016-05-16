package com.sky.androidnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import cn.waps.AppConnect;

public class MainActivity extends AppCompatActivity {

    private MWebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mWebView = new MWebView(this);
        setContentView(mWebView);
//        setContentView(R.layout.activity_main);

        mWebView.loadUrl("http://www.bb-sz.com");

//        AppConnect.getInstance(this).initPopAd(this);
//        AppConnect.getInstance(this).showOffers(this);

    }

    public void Test(View view){
        AppConnect.getInstance(this).showPopAd(this);
//        AppConnect.getInstance(this).showOffers(this, userId);
//        AppConnect.getInstance(this).showAppOffers(this);
    }
}
