package com.ptroaapp.gali.ptroaapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.ptroaapp.gali.ptroaapp.DM.LawDetails;

/**
 * Created by Roey on 15/07/2016.
 */
public class ListAdapter extends ArrayAdapter<LawDetails> {
    private Activity context;

    private OnSelectedLawListener _callback;

    // Container Activity must implement this interface
    public interface OnSelectedLawListener {
        public void onLawSelected(LawDetails law);
    }

    public ListAdapter(Activity context) {
        super(context, R.layout.custom_list_view);
        this.context = context;
    }

    public void onAttach(OnSelectedLawListener callback) {
        try {
            _callback = callback;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflaterObj = context.getLayoutInflater();
        View myView= layoutInflaterObj.inflate(R.layout.custom_list_view, null, true);

        LawDetails law = (LawDetails)this.getItem(position);
        myView.setTag(law);

        TextView bigTitle = (TextView)myView.findViewById(R.id.bigTitle);
        TextView smallTitle = (TextView)myView.findViewById(R.id.smallTitle);

        bigTitle.setText(law.get_title());
        smallTitle.setText(law.get_description());

        myView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LawDetails law = (LawDetails)v.getTag();

                //fire event
                _callback.onLawSelected(law);
            }
        });

        return myView;
    }
}