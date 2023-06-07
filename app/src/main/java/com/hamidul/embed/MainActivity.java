package com.hamidul.embed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    LinearLayout bWaz1,bWaz2,bWaz3,bWaz4,bWaz5,bWaz6,bWaz7,bWaz8,bWaz9,bWaz10;
    ImageView waz1,waz2,waz3,waz4,waz5,waz6,waz7,waz8,waz9,waz10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.purple_200));
        }

        waz1 = findViewById(R.id.waz1);
        waz2 = findViewById(R.id.waz2);
        waz3 = findViewById(R.id.waz3);
        waz4 = findViewById(R.id.waz4);
        waz5 = findViewById(R.id.waz5);
        waz6 = findViewById(R.id.waz6);
        waz7 = findViewById(R.id.waz7);
        waz8 = findViewById(R.id.waz8);

        bWaz1 = findViewById(R.id.bWaz1);
        bWaz2 = findViewById(R.id.bWaz2);
        bWaz3 = findViewById(R.id.bWaz3);
        bWaz4 = findViewById(R.id.bWaz4);
        bWaz5 = findViewById(R.id.bWaz5);
        bWaz6 = findViewById(R.id.bWaz6);
        bWaz7 = findViewById(R.id.bWaz7);
        bWaz8 = findViewById(R.id.bWaz8);


        //waz icon=========================================================================
        Picasso.get()
                .load("https://img.youtube.com/vi/S_0rlBiTJXo/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz1);

        Picasso.get()
                .load("https://img.youtube.com/vi/xThWIYHZDr8/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz2);

        Picasso.get()
                .load("https://img.youtube.com/vi/x-I3j5xX0tQ/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz3);

        Picasso.get()
                .load("https://img.youtube.com/vi/m0tu35QRip8/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz4);

        Picasso.get()
                .load("https://img.youtube.com/vi/9jrmBk3MuGI/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz5);

        Picasso.get()
                .load("https://img.youtube.com/vi/DuT0pPD1LXI/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz6);

        Picasso.get()
                .load("https://img.youtube.com/vi/9SPG-NAH4nQ/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz7);

        Picasso.get()
                .load("https://img.youtube.com/vi/mr5D7wwuxSU/0.jpg")
                .placeholder(R.drawable.hamidul)
                .error(R.drawable.hamidul)
                .into(waz8);
        //waz icon>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        bWaz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/S_0rlBiTJXo";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/xThWIYHZDr8";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/x-I3j5xX0tQ";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/m0tu35QRip8";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/9jrmBk3MuGI";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/DuT0pPD1LXI";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/9SPG-NAH4nQ";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });

        bWaz8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Video_Player.video_id = "https://www.youtube.com/embed/mr5D7wwuxSU";

                Intent intent = new Intent(MainActivity.this,Video_Player.class);
                startActivity(intent);

            }
        });





    }
}