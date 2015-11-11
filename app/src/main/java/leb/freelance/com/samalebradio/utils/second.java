package leb.freelance.com.samalebradio.utils;

/**
 * Created by ElyesL on 01/11/2015.
 */

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import leb.freelance.com.samalebradio.R;

public class second extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        WebView w1=(WebView)findViewById(R.id.webView);
        w1.loadUrl("http://tutorialspoint.com/android/sampleXML.xml");
    }
}