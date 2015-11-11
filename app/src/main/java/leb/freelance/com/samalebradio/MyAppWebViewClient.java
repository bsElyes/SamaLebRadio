package leb.freelance.com.samalebradio;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by ElyesL on 01/11/2015.
 */
public class MyAppWebViewClient  extends WebViewClient{
    private ProgressDialog progDailog;

    MyAppWebViewClient(Context context){
        progDailog = ProgressDialog.show(context, "Loading", "Please wait...", true);
        progDailog.setCancelable(true);
    }
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        if(Uri.parse(url).getHost().endsWith("twitter.com")||Uri.parse(url).getHost().endsWith("instagram.com")) {
            return false;
        }
        if(Uri.parse(url).getHost().length() == 0) {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);

        progDailog.show();

        return true;
    }

    @Override
    public void onPageFinished(WebView view, final String url) {
        progDailog.dismiss();
    }
}
