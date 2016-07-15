package cn.boc.myfirstapp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        String receiveMessage = getIntent().getStringExtra(MainActivity.MESSAGE_CONTENT);

        TextView textView = (TextView) findViewById(R.id.display_message);
        textView.setText(receiveMessage);



    }
}
