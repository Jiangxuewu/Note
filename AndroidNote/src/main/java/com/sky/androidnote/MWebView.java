package com.sky.androidnote;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Administrator on 2016/5/16.
 */
public class MWebView extends WebView {
    public MWebView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public MWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public MWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    public void init(Context context, AttributeSet attrs, int defStyleAttr) {

        WebSettings settings = getSettings();
        // 不让左右滑动
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setUseWideViewPort(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setAllowFileAccess(true);
//		settings.setPluginsEnabled(true);
        settings.setLoadWithOverviewMode(true);
        setBackgroundColor(0); // 设置背景色
        //JsInterface Method one
        addJavascriptInterface(new JsCallJava(context), "javaControl");
        //JsBridge  Method two
        setWebChromeClient(new MWebChromeClient());
        //JsRouter  Method three
        setWebViewClient(new MWebViewClient());
    }

    class MWebChromeClient extends WebChromeClient {
        @Override
        public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
            return super.onJsPrompt(view, url, message, defaultValue, result);
        }
    }

    class MWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
