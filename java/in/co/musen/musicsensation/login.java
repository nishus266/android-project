package in.co.musen.musicsensation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;

public class login extends AppCompatActivity {

    @JavascriptInterface
    public void TestMethod(){
        Intent i = new Intent(login.this, feed.class);
        startActivity(i);
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        WebView web = findViewById(R.id.login);

        web.getSettings().setJavaScriptEnabled(true);
        web.addJavascriptInterface(this, "android");
        web.loadUrl("file:///android_asset/profile.html");

    }
}
