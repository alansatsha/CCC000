package com.concoeducation.concolanguages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

public class fragmentcontroller extends AppCompatActivity {

    private Space adrspace;
    private TextView adrtext;
    String mcorecode = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentcontroller);
        getSupportActionBar().hide();

        mcorecode = getIntent().getStringExtra("corec");

        String mrrt = mcccd("");
        ggop(mrrt.split("_")[0], mrrt.split("_")[1]);

    }

    private String mcccd(String mma)
    {/*
        String hh[] = mma.split(",");
        String[] maaaa = hh[0].split("%");

        String torrr = "";
        */
        //return maaaa[1] + "{" + torrr;
        return "infss" + "_" + "content here HTMLºbutt1ºbutt2ºbutt3ºbutt4ºbutt5ºbutt6ºbuttnumcorrectº/storage/emulated/0/Download/.Mtttest/file.mp3";
    }

    private void ggop(String mtta, String mddd)
    {
        Bundle mmn = new Bundle();
        mmn.putString("a", mddd);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        switch (mtta)
        {
            case "infss":
                infoshowerfragment bbb = new infoshowerfragment();
                bbb.setArguments(mmn);
                ft.replace(R.id.mprinlayyy, bbb);
                break;
            case "mltchf":
                chossssserafrag bbba = new chossssserafrag();
                bbba.setArguments(mmn);
                ft.replace(R.id.mprinlayyy, bbba);
                break;
            case "souchof":
                soundchossseer ooo = new soundchossseer();
                ooo.setArguments(mmn);
                ft.replace(R.id.mprinlayyy, ooo);
                break;
        }


        ft.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    public void tobbbb(View view)
    {
        super.onBackPressed();
    }
}