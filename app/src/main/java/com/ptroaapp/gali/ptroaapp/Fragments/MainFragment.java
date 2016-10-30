package com.ptroaapp.gali.ptroaapp.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.ptroaapp.gali.ptroaapp.ListAdapter;
import com.ptroaapp.gali.ptroaapp.Logic.LawManager;
import com.ptroaapp.gali.ptroaapp.R;


public class MainFragment extends Fragment {
    private OnHomeButtonListener callback;


    public interface OnHomeButtonListener{
        public void onHomeButtonSelected(int btn);
    }

    public MainFragment() {

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callback = (OnHomeButtonListener)context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button btnLaw = (Button)view.findViewById(R.id.btnLaw);
        Button btnAbout = (Button)view.findViewById(R.id.btnAbout);
        Button btnReport = (Button)view.findViewById(R.id.btnReport);

        btnLaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onHomeButtonSelected(0);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onHomeButtonSelected(1);
            }
        });

        btnReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onHomeButtonSelected(2);
            }
        });

        return view;

    }





}
