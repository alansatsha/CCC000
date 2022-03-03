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
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link chossssserafrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class chossssserafrag extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    private TextView mlaa;
    private Button ma;
    private Button mb;
    private Button mc;
    private Button md;
    private Button me;
    private Button mf;

    public chossssserafrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment chossssserafrag.
     */
    // TODO: Rename and change types and number of parameters
    public static chossssserafrag newInstance(String param1, String param2) {
        chossssserafrag fragment = new chossssserafrag();
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
        return inflater.inflate(R.layout.fragment_chossssserafrag, container, false);



    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Space adrspace;
        TextView adrtext;
        LinearLayout bbb;
        Space hhhu;
        adrtext = view.findViewById(R.id.adsstextaab);
        adrspace = view.findViewById(R.id.spacettta);


        ViewGroup.LayoutParams gt = adrtext.getLayoutParams();
        ViewGroup.LayoutParams lo = adrspace.getLayoutParams();

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int fullwidth = displayMetrics.widthPixels;
        int fullheigh = displayMetrics.heightPixels;

        bbb = view.findViewById(R.id.sssssl);
        ViewGroup.LayoutParams ddda = bbb.getLayoutParams();

        int mdr = (fullheigh) - ddda.height - ((int)Math.round(fullheigh * .20));

        gt.width = fullwidth - (lo.width * 2);

        adrtext.setLayoutParams(gt);


        try {
            LinearLayout lllu = view.findViewById(R.id.supercontainerfull);
            LinearLayout rrr = view.findViewById(R.id.mincontaineraaa);
            Space lsdj = view.findViewById(R.id.suptopspace);
            int uuu = 0;

            ViewGroup.LayoutParams lluui = lllu.getLayoutParams();
            uuu = lluui.height;
            lluui = rrr.getLayoutParams();
            uuu += lluui.height;
            lluui = lsdj.getLayoutParams();
            uuu += lluui.height;
            uuu += (int)Math.round(fullheigh * .05);

            Space wwwl = view.findViewById(R.id.fiiidsssspace);

            ViewGroup.LayoutParams uuuue = wwwl.getLayoutParams();
            uuuue.height = uuu;

            wwwl.setLayoutParams(uuuue);
        }
        catch (Exception ex){

        }
        mlaa = view.findViewById(R.id.adsstextaab);
        ma = view.findViewById(R.id.moooa);
        mb = view.findViewById(R.id.mooob);
        mc = view.findViewById(R.id.moooc);
        md = view.findViewById(R.id.moood);
        me = view.findViewById(R.id.moooe);
        mf = view.findViewById(R.id.mooof);

        if(getArguments() != null)
        {
            Bundle ggg = getArguments();
            uuui(ggg.getString("a"));
        }

    }
    private void uuui(String iiio)
    {
        mlaa.setText(iiio.split("º")[0]);
        ma.setText(iiio.split("º")[1]);
        mb.setText(iiio.split("º")[2]);
        mc.setText(iiio.split("º")[3]);
        md.setText(iiio.split("º")[4]);
        me.setText(iiio.split("º")[5]);
        mf.setText(iiio.split("º")[6]);
    }
}