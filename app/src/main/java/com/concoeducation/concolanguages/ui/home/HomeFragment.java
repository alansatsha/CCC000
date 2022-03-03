package com.concoeducation.concolanguages.ui.home;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.concoeducation.concolanguages.MainActivity;
import com.concoeducation.concolanguages.R;
import com.concoeducation.concolanguages.databinding.FragmentHomeBinding;
import com.concoeducation.concolanguages.fragmentcontroller;
import com.concoeducation.concolanguages.lenguageschoser;
import com.concoeducation.concolanguages.toloadactivi;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private FragmentHomeBinding binding;
    private ImageView asass;
    private Space naaa;
    private TextView mnaa, mnaab;
    private Button kkj;
    private ImageView ccd;
    private Button ffff;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });





        return root;




    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mnaa = view.findViewById(R.id.statetextt);
        ffff = view.findViewById(R.id.ssssssssss);
        mnaab = view.findViewById(R.id.mnametext);
        asass = view.findViewById(R.id.mainwelcomeimage);
        naaa = view.findViewById(R.id.heightspace);
        toresp();

        kkj = view.findViewById(R.id.mybuttbb);
        ccd = view.findViewById(R.id.mybutta);

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


        ffff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent ksmdk = new Intent(getActivity(), toloadactivi.class);
                    ksmdk.putExtra("reference", "0000000001");
                    ksmdk.putExtra("vall", 1);
                    startActivity(ksmdk);
                }
                catch (Exception e)
                {
                    Log.e("SASDASD", "exception", e);
                }
            }
        });



    }
    private void tome()
    {
        Intent hh =  new Intent(getActivity(), lenguageschoser.class);
        startActivity(hh);

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void toresp() {

        ViewGroup.LayoutParams params = naaa.getLayoutParams();
        ViewGroup.LayoutParams paramsaa = asass.getLayoutParams();
        params.height = (int)Math.round(paramsaa.height * .8);
        naaa.setLayoutParams(params);


        Date c = Calendar.getInstance().getTime();
        DateFormat date = new SimpleDateFormat("HH:mm:ss");
        String localTime = date.format(c);





        String[] aaa = localTime.split(":");

        if(Float.parseFloat(aaa[0]) > 5)
        {
            if(Float.parseFloat(aaa[0]) < 12)
            {
                fff("day");
                mnaa.setText("Good morning,");
            }
            else if(Float.parseFloat(aaa[0]) < 18)
            {
                fff("afternoon");
                mnaa.setText("   Good afternoon,");
            }
            else
            {
                fff("evening");
                mnaa.setText("   Good evening,");


            }
        }
        else
        {
            fff("evening");
            mnaa.setText("   Good evening,");
        }
    }

    private void fff(String jjj)
    {
        String hicolor;
        int acsc;
        switch (jjj)
        {
            case "day":
                asass.setImageResource(R.drawable.aac);
                acsc = this.getResources().getColor(R.color.daycolour);
                break;

            case "evening":
                asass.setImageResource(R.drawable.aab);
                acsc = this.getResources().getColor(R.color.eveningcolour);
                break;

            case "afternoon":
                asass.setImageResource(R.drawable.aaa);
                acsc = this.getResources().getColor(R.color.afternoncolour);
                break;

            default:
                acsc = this.getResources().getColor(R.color.daycolour);
                break;
        }

        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getActivity().getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(acsc);

        }
    }
}