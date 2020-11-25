package com.example.mentalhealthtracker;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MoreResources extends AppCompatActivity {
    // attributes
    private static final String appBarTitle = "More Resources";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_resources);

        ActionBar mainActionBar = getSupportActionBar();

        if (mainActionBar != null) {
            mainActionBar.setTitle(appBarTitle);
            mainActionBar.setDisplayHomeAsUpEnabled(true);
        }

        // Button that links to 'Web Support Articles' component
        Button webSupportButton = findViewById(R.id.webSupportButton);
        webSupportButton.setOnClickListener(v -> openWebSupport());

        // Button that links to 'Connect with Counsellors' component
        Button connectCounsellorsButton = findViewById(R.id.counsellorsButton);
        connectCounsellorsButton.setOnClickListener(v -> openConnectCounsellors());

    }

    public void openWebSupport() {
        Intent intent = new Intent(this, WebSupportArticles.class);
        startActivity(intent);
    }


    public void openConnectCounsellors() {
        Intent intent2 = new Intent(this, ConnectCounsellors.class);
        startActivity(intent2);
    }
}
