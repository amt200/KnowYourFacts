package com.example.android.knowyourfacts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPrevious#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPrevious extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private FrameLayout frameLayout;
    private static final String[] colors = new String[]{"#ebe831","#b631eb","#eb31d5","#74B8ED"};

    public FragmentPrevious() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPrevious.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPrevious newInstance(String param1, String param2) {
        FragmentPrevious fragment = new FragmentPrevious();
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
        View view = inflater.inflate(R.layout.fragment_previous, container, false);
        Button btnChange = view.findViewById(R.id.btnColourFragPrev);
        frameLayout = view.findViewById(R.id.fragPrev);

        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randIndex = random.nextInt(colors.length);
                String color = colors[randIndex];
                frameLayout.setBackgroundColor(Color.parseColor(color));
            }
        });
        return view;
    }
}