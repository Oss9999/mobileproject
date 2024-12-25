package com.example.mobileproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class GarageNotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage_notification);

        // Find the ListView (currently empty)
        ListView notificationListView = findViewById(R.id.notificationListView);

        // You can populate this ListView later with data
    }
}
