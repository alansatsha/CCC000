package com.concoeducation.concolanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class toloadactivi extends AppCompatActivity {

    private ImageView ggf;
    Intent intml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toloadactivi);



        getSupportActionBar().hide();


        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(Color.parseColor("#101010"));

        }

        String mcca = getIntent().getStringExtra("reference");
        int baaa = getIntent().getIntExtra("vall", 0);

        TextView aaaa = findViewById(R.id.maxtexta);
        TextView bbbb = findViewById(R.id.mintexta);

        int md = 5000;


        switch (baaa){

            case 1:
                aaaa.setText("Loading...");
                bbbb.setText("Cargando...");
                showGif(R.drawable.hearthicoload);
                md = 2000;
                intml = new Intent(toloadactivi.this, fragmentcontroller.class);
                break;

            case 0:
                aaaa.setText("Hi");
                bbbb.setText("Hola");
                showGif(R.drawable.eyeicooo);
                md = 3000;
                intml = new Intent(toloadactivi.this, MainActivity.class);
                break;

        }

        new Handler().postDelayed(new Runnable() {
            public void run() {
                intml.putExtra("indd", "");
                startActivity(intml);
                finish();
            };
        }, md);


    }

    private void showGif(int aa) {
        ggf = findViewById(R.id.animaaaaaaaa);
        Glide.with(this).load(aa).into(ggf);
    }
}