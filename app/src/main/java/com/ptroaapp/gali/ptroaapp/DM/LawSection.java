package com.ptroaapp.gali.ptroaapp.DM;

import java.io.Serializable;

/**
 * Created by Roey on 15/07/2016.
 */
public class LawSection implements Serializable {
    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    private String _title;
    private String _description;
}
