package com.ptroaapp.gali.ptroaapp.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ptroaapp.gali.ptroaapp.DM.LawDetails;
import com.ptroaapp.gali.ptroaapp.ListAdapter;
import com.ptroaapp.gali.ptroaapp.Logic.LawManager;
import com.ptroaapp.gali.ptroaapp.R;

public class FragmentHome extends Fragment {

    private ListAdapter.OnSelectedLawListener callback;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callback = (ListAdapter.OnSelectedLawListener)context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_home, container, false);
        //get the list object (casting via find by id)
        ListView lawList = (ListView)view.findViewById(R.id.lawList);
        ListAdapter adapter = new ListAdapter(getActivity());
        adapter.onAttach(callback);
        adapter.addAll(LawManager.GetLaws());
        lawList.setAdapter(adapter);
        //adapter = LawManager.GetLaws()
        // Inflate the layout for this fragment
        return view;
    }
}
