package at.fhjoanneum.ims.webviewapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

/**
 * entry point of App, load webview and adds JS Interfaces
 * @author EKRAINZ
 *
 */
public class MainActivity extends AppCompatActivity {


    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myWebView = (WebView) findViewById(R.id.webViewAdv);
        myWebView.loadUrl("file:///android_asset/index.html");

        // enable JS
        myWebView.getSettings().setJavaScriptEnabled(true);


        // add JS Interface
        myWebView.addJavascriptInterface(new JsInterface(this), "Androidfunction");

    }


}
