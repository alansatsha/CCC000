package com.concoeducation.concolanguages;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.concoeducation.concolanguages.databinding.ActivityMainBinding;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ImageView asass;
    private Space naaa;
    private TextView mnaa, mnaab;
    private Button kkj;
    private ImageView ccd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);


        kkj = findViewById(R.id.mybuttbb);
        ccd = findViewById(R.id.mybutta);

        kkj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tome();
            }
        });

        ccd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tome();
            }
        });
        int[][] states = new int[][] {
                new int[] { android.R.attr.state_checked}, new int[] { android.R.attr.state_enabled}
        };

        int[] colors = new int[] {
                Color.parseColor("#3F76BF"), Color.parseColor("#555555")
        };

        ColorStateList myList = new ColorStateList(states, colors);


        ColorStateList colorStateList = new ColorStateList(states, colors);
        navView.setItemIconTintList(colorStateList);
        navView.setItemTextColor(colorStateList);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        //toresp();

    }
    private void tome()
    {
        Intent hh =  new Intent(MainActivity.this, lenguageschoser.class);
        startActivity(hh);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}