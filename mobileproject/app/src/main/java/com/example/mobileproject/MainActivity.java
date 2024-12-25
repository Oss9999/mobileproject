package com.example.mobileproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Display the toast message
        Toast.makeText(this, "Welcome to the Garage App!", Toast.LENGTH_SHORT).show();

        // Delay and navigate to the next activity (GarageViewActivity)
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, ClientGarageActivity.class);
            startActivity(intent);
            finish(); // Close MainActivity to prevent going back to it
        }, 2000); // Delay for 2 seconds

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
