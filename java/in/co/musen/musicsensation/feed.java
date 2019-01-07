package in.co.musen.musicsensation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        WebView web = findViewById(R.id.feed);

        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl("file:///android_asset/feed.html");
    }
}
