package com.ptroaapp.gali.ptroaapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ptroaapp.gali.ptroaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LegalClarificationFragment extends Fragment {
    private TextView aboutText;

    public LegalClarificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_legal_clarification, container, false);

        TextView aboutText= (TextView)view.findViewById(R.id.aboutText);


        return view;
    }

}
