package com.raihan.radio;

import java.net.InetAddress;
import java.net.UnknownHostException;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private WebView mWebView;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        if(! isNetworkAvailable()){
        	Toast.makeText(getApplicationContext(), "Internet connection is required", Toast.LENGTH_SHORT);
        }      
        else{
        	mWebView = (WebView)findViewById(R.id.webView1);
            
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.loadUrl("file:///android_asset/index.html");
            mWebView.addJavascriptInterface(new Interface(), "Android");
        }
    }
    
    private boolean isNetworkAvailable() {
    	try {
            final InetAddress address = InetAddress.getByName("www.google.com");
            return !address.equals("");
        } catch (UnknownHostException e) {
        }
        return false;
    }
}