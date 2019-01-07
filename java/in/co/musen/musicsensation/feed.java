package in.co.musen.musicsensation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class feed extends AppCompatActivity {
    @JavascriptInterface
    public void TestMethod(int a){
        if(a==1) {
            Intent i = new Intent(feed.this, feed.class);
            startActivity(i);
            finish();
        }
        else if(a==2){
            Intent i = new Intent(feed.this, login.class);
            startActivity(i);
            finish();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        WebView web = findViewById(R.id.feed);

        web.getSettings().setJavaScriptEnabled(true);
        web.addJavascriptInterface(this, "android");
        web.loadUrl("file:///android_asset/feed.html");
    }
}
