package at.fhjoanneum.ims.webviewapp;


import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import android.provider.Settings.Secure;

/**
 * JS Interface: simple Demo for JS - Java Interface
 * @author EKRAINZ
 *
 */
public class JsInterface {

    Context c;

    public JsInterface(Context c) {
        super();
        this.c = c;
    }

    @JavascriptInterface
    public void showToast(String msg){

        Log.i("FROM JS", msg);
        Toast.makeText(c, msg, Toast.LENGTH_LONG).show();

        // --- but you can do all which is possible in Android :-)

    }


    @JavascriptInterface
    public String getDevID(){

       String s = "Device ID= "+ Secure.getString(c.getContentResolver(), Secure.ANDROID_ID);
      // Toast.makeText(c, s, Toast.LENGTH_LONG).show();

        return  s;

    }





}