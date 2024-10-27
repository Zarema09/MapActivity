package com.example.biblioteki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageview = findViewById(R.id.image_view);
        Picasso.get().load("https://m.media-amazon.com/images/M/MV5BMzJjNGY5ZDItNjA3Yy00NTE0LWE0ZTgtMDM3NjMzNDlkYmJlXkEyXkFqcGdeQXVyMTI4NTc5ODc5._V1_.jpg")
                .into(imageview);
        imageview.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        });
    }
}