package com.concoeducation.concolanguages;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;


public class multiimagechooserf extends Fragment {

    private ImageButton ma;
    private ImageButton mb;
    private ImageButton mc;
    private ImageButton md;

    private Button uuut;

    private int currentchhh = 0;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public multiimagechooserf() {
        // Required empty public constructor
    }

    public static multiimagechooserf newInstance(String param1, String param2) {
        multiimagechooserf fragment = new multiimagechooserf();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_multiimagechooserf, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ma = view.findViewById(R.id.uimagea);
        mb = view.findViewById(R.id.uimageb);
        mc = view.findViewById(R.id.uimagec);
        md = view.findViewById(R.id.uimaged);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int fullwidth = displayMetrics.widthPixels;
        int fullheigh = displayMetrics.heightPixels;

        ViewGroup.LayoutParams rrf = ma.getLayoutParams();
        int uu = (int)Math.round(fullwidth * .44);

        rrf.width = uu;
        rrf.height = uu;

        ma.setLayoutParams(rrf);
        mb.setLayoutParams(rrf);
        mc.setLayoutParams(rrf);
        md.setLayoutParams(rrf);



        Space adnspace;
        TextView adntext;
        Space hhhu;
        adntext = view.findViewById(R.id.baaatext);
        adnspace = view.findViewById(R.id.baaaspace);


        ViewGroup.LayoutParams gt = adntext.getLayoutParams();
        ViewGroup.LayoutParams lo = adnspace.getLayoutParams();

        gt.width = fullwidth - (lo.width * 2);

        adntext.setLayoutParams(gt);




        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setBackgroundResource(R.drawable.secobgrc);
                mb.setBackgroundResource(R.drawable.imagebackg);
                mc.setBackgroundResource(R.drawable.imagebackg);
                md.setBackgroundResource(R.drawable.imagebackg);
                currentchhh = 1;
            }
        });

        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setBackgroundResource(R.drawable.imagebackg);
                mb.setBackgroundResource(R.drawable.secobgrc);
                mc.setBackgroundResource(R.drawable.imagebackg);
                md.setBackgroundResource(R.drawable.imagebackg);
                currentchhh = 2;
            }
        });

        mc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setBackgroundResource(R.drawable.imagebackg);
                mb.setBackgroundResource(R.drawable.imagebackg);
                mc.setBackgroundResource(R.drawable.secobgrc);
                md.setBackgroundResource(R.drawable.imagebackg);
                currentchhh = 3;
            }
        });

        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.setBackgroundResource(R.drawable.imagebackg);
                mb.setBackgroundResource(R.drawable.imagebackg);
                mc.setBackgroundResource(R.drawable.imagebackg);
                md.setBackgroundResource(R.drawable.secobgrc);
                currentchhh = 4;
            }
        });


        uuut = view.findViewById(R.id.uuuni);

        uuut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentchhh == 0)
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Please, chose one image an then press ok.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}