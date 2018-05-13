package com.example.ykp.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class IntentActivity extends AppCompatActivity {
    protected WebView webview;
    protected String url = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        if (getIntent()==null)
            finish();
        url = getIntent().getStringExtra("value");
        webview = findViewById(R.id.web_view);
        webview.loadUrl(url);

        webview.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webview.loadUrl(url);
                return true;
            }
        });

    }
}