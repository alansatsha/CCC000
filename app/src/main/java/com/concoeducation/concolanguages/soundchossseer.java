package com.concoeducation.concolanguages;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

public class soundchossseer extends Fragment {

    private ImageButton tuui;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Button mddda;
    private Button mdddb;
    private Button mdddc;
    private Button mdddd;
    private Button mddde;
    private Button mdddf;
    private TextView lloa;
    private MediaPlayer ttta;
    Boolean mtttt = false;
    private String iiifa;

    public soundchossseer() {
        // Required empty public constructor
    }


    public static soundchossseer newInstance(String param1, String param2) {
        soundchossseer fragment = new soundchossseer();
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
        return inflater.inflate(R.layout.fragment_soundchossseer, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tuui = view.findViewById(R.id.msndbtt);



        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int fullwidth = displayMetrics.widthPixels;
        int fullheigh = displayMetrics.heightPixels;


        Space adnspace;
        TextView adntext;
        Space hhhu;
        adntext = view.findViewById(R.id.hhhtext);
        adnspace = view.findViewById(R.id.hhhspace);


        ViewGroup.LayoutParams gt = adntext.getLayoutParams();
        ViewGroup.LayoutParams lo = adnspace.getLayoutParams();

        gt.width = fullwidth - (lo.width * 2);

        adntext.setLayoutParams(gt);




        tuui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msssd();
            }
        });

        lloa = view.findViewById(R.id.hhhtext);
        mddda = view.findViewById(R.id.btta);
        mdddb = view.findViewById(R.id.bttb);
        mdddc = view.findViewById(R.id.bttc);
        mdddd = view.findViewById(R.id.bttd);
        mddde = view.findViewById(R.id.btte);
        mdddf = view.findViewById(R.id.bttf);

        if(getArguments() != null)
        {
            Bundle al = getArguments();
            String liii = al.getString("a");
            ttttj(liii);

        }

    }
    private void ttttj(String lffff)
    {
        lloa.setText(lffff.split("º")[0]);
        mddda.setText(lffff.split("º")[1]);
        mdddb.setText(lffff.split("º")[2]);
        mdddc.setText(lffff.split("º")[3]);
        mdddd.setText(lffff.split("º")[4]);
        mddde.setText(lffff.split("º")[5]);
        mdddf.setText(lffff.split("º")[6]);
        iiifa  = lffff.split("º")[8];
        ttta = MediaPlayer.create(getActivity().getApplicationContext(), Uri.parse(iiifa));
        msssd();
    }
    private void msssd()
    {

        if(ttta.isPlaying())
        {
            //mtttt = false;
            ttta.stop();
            tuui.setImageResource(R.drawable.soundiscobutt);
        }
        else
        {
            //mtttt = true;
            ttta = MediaPlayer.create(getActivity().getApplicationContext(), Uri.parse(iiifa));
            ttta.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mtttt = false;
                    tuui.setImageResource(R.drawable.soundiscobutt);
                }
            });
            ttta.start();
            tuui.setImageResource(R.drawable.plysoundiscobutt);
        }
    }
}