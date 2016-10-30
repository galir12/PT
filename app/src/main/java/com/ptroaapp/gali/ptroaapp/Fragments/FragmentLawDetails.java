package com.ptroaapp.gali.ptroaapp.Fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.ptroaapp.gali.ptroaapp.DM.LawDetails;
import com.ptroaapp.gali.ptroaapp.DM.LawSection;
import com.ptroaapp.gali.ptroaapp.ExpandableListAdapter;
import com.ptroaapp.gali.ptroaapp.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FragmentLawDetails extends Fragment {

    private ExpandableListView expListView;
    private LawDetails _law;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listDataChild;
    private ExpandableListAdapter listAdapter;
    private View view;


    public FragmentLawDetails() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_fragment_law_details, container, false);

        _law = (LawDetails)this.getArguments().getSerializable("LawDetails");
        // get the listview
        expListView = (ExpandableListView) view.findViewById(R.id.lvExp);

        prepareListData();
        ExpandableListAdapter listAdapter = new ExpandableListAdapter(view.getContext(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Inflate the layout for this fragment
        return view;
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        List<String> lst;
        for (LawSection sec : _law.get_sections()) {
            lst = new ArrayList<String>();
            lst.add(sec.get_description());
            listDataHeader.add(sec.get_title());
            listDataChild.put(sec.get_title(), lst);
        }
    }

    @Override
    public void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("law", (Serializable) _law);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            //probably orientation change
            _law = (LawDetails) savedInstanceState.getSerializable("law");
        } else {

        }
    }
}
