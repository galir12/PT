package com.ptroaapp.gali.ptroaapp.DM;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Roey on 15/07/2016.
 */
public class LawDetails extends LawSection implements Serializable  {

    public ArrayList<LawSection> get_sections() {
        return _sections;
    }

    private ArrayList<LawSection> _sections;

    public LawDetails() {
        _sections = new ArrayList<LawSection>();
    }
}
