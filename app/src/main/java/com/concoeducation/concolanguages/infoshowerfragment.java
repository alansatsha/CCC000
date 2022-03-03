package com.concoeducation.concolanguages;

import static com.concoeducation.concolanguages.R.id.adssspace;
import static com.concoeducation.concolanguages.R.id.adsstextaa;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link infoshowerfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class infoshowerfragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView mtt;
    private TextView mcc;

    public infoshowerfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment infoshowerfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static infoshowerfragment newInstance(String param1, String param2) {
        infoshowerfragment fragment = new infoshowerfragment();
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

    private void toren(String sentt)
    {
        mtt.setText(sentt.split("º")[0]);
        mcc.setText(sentt.split("º")[1]);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_infoshowerfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int fullwidth = displayMetrics.widthPixels;
        int fullheigh = displayMetrics.heightPixels;


        Space adnspace;
        TextView adntext;
        adntext = view.findViewById(adsstextaa);
        adnspace = view.findViewById(adssspace);


        ViewGroup.LayoutParams gt = adntext.getLayoutParams();
        ViewGroup.LayoutParams lo = adnspace.getLayoutParams();

        gt.width = fullwidth - (lo.width * 2);

        adntext.setLayoutParams(gt);

        mtt=view.findViewById(R.id.infotitt);
        mcc=view.findViewById(adsstextaa);

        if(getArguments() != null)
        {
            Bundle aaa = getArguments();
            toren(aaa.getString("a"));
        }
    }
}