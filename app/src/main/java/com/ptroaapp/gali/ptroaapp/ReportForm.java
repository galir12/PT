package com.ptroaapp.gali.ptroaapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.ptroaapp.gali.ptroaapp.Logic.UserMessage;
import com.ptroaapp.gali.ptroaapp.R;


public class ReportForm extends Fragment implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private String[] crimesList;
    private Button btnAddFile, btnSend;
    private EditText txtFullname, txtEmail,txtPhone,txtPlaceOfCrime,txtCrimeDescription,spinnerSelection;


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_form);

        crimesList = getResources().getStringArray(R.array.crimes_list);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,crimesList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }*/

    private View _view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        _view = inflater.inflate(R.layout.report_form, container, false);
        castingFileds();

        crimesList = getResources().getStringArray(R.array.crimes_list);
        spinner = (Spinner) _view.findViewById(R.id.spinner);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserMessage userMessage = new UserMessage(txtFullname.getText().toString(),txtEmail.getText().toString(),
                        txtPhone.getText().toString(),txtPlaceOfCrime.getText().toString()
                        ,txtCrimeDescription.getText().toString()
                        ,spinner.getSelectedItem().toString() );
            }
        });


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,crimesList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        return _view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String spinnerSelection = spinner.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void castingFileds(){
        btnSend =(Button)_view.findViewById(R.id.btnSend);
        btnAddFile=(Button)_view.findViewById(R.id.btnAddFile);
        txtFullname = (EditText) _view.findViewById(R.id.fullName);
        txtEmail = (EditText) _view.findViewById(R.id.txtEmail);
        txtPhone = (EditText) _view.findViewById(R.id.txtPhone);
        txtPlaceOfCrime = (EditText) _view.findViewById(R.id.txtPlaceOfCrime);
        txtCrimeDescription = (EditText) _view.findViewById(R.id.crimeDescription);
        //String spinnerSelection = spinner.getSelectedItem().toString();
    }

}
