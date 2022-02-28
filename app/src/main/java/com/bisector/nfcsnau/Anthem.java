package com.bisector.nfcsnau;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Anthem#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Anthem extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Anthem() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Anthem.
     */
    // TODO: Rename and change types and number of parameters
    public static Anthem newInstance(String param1, String param2) {
        Anthem fragment = new Anthem();
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
        //return inflater.inflate(R.layout.fragment_anthem, container, false);
        View view = inflater.inflate(R.layout.fragment_anthem,container,false);
        TextView textView=view.findViewById(R.id.Item_Text);
        textView.setText("NFCS, Nigeria Federation of Catholic Students \n" +
                "Is living the faith\n" +
                "We are the hope of our faith to blossom \n" +
                "The dreams of the Church Hail NFCS \n" +
                "With the strength of our youth,\n" +
                "We'll move our faith forward\n" +
                "And defend it whatever be the case\n" +
                "When the roll is called on the last day\n" +
                "A joyful song we'll raise \n" +
                "Hail NFCS\n" +
                "\n" +
                "Let's spread the good news of the kingdom \n" +
                "to all people on earth through NFCS \n" +
                "And join hands with groups of like mind \n" +
                "to evangelize the world through NFCS \n" +
                "Let the message be brought to every living soul \n" +
                "by the lives that we live as students \n" +
                "when the roll is called on the last day \n" +
                "a joyful song we'll raise \n" +
                "Hail NFCS\n" +
                "\n" +
                "We say no to corruption and greed, \n" +
                "sectionalism and violence in NFCS. \n" +
                "And chant down the agents of bribery, \n" +
                "ethnicism and war in NFCS, \n" +
                "IDY with Jesus Prince of love and peace \n" +
                "we will pitch our tent, \n" +
                "yes the enemy will forever be shamed \n" +
                "when the roll is called on the last day \n" +
                "A joyful song we'll raise \n" +
                "Hail NFCS! Hail NFCS! Hail NFCS!");
        return view;
    }
}