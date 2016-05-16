package com.sky.androidnote;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by Administrator on 2016/5/16.
 */
public class JsCallJava {

    private final Context mContext;

    public JsCallJava(Context context){
        mContext = context;
    }

    @JavascriptInterface
    public void test(){

    }
}
