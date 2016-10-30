package com.ptroaapp.gali.ptroaapp.Logic;

/**
 * Created by Roey on 09/10/2016.
 */
public class UserMessage {

    private String txtFullName,txtEmail,txtPhone,txtPlaceOfCrime,txtCrimeDescription,SpinnerSelect;

    public UserMessage(String txtFullName,String txtEmail,String txtPhone,String txtPlaceOfCrime,String txtCrimeDescription,String spinnerSelect) {
        this.txtFullName = txtFullName;
        this.txtEmail = txtEmail;
        this.txtPhone = txtPhone;
        this.txtPlaceOfCrime = txtPlaceOfCrime;
        this.txtCrimeDescription = txtCrimeDescription;
        SpinnerSelect = spinnerSelect;
    }

    public String getTxtFullName() {
        return txtFullName;
    }

    public String getTxtEmail() {
        return txtEmail;
    }

    public String getTxtPhone() {
        return txtPhone;
    }

    public String getTxtPlaceOfCrime() {
        return txtPlaceOfCrime;
    }

    public String getTxtCrimeDescription() {
        return txtCrimeDescription;
    }

    public String getSpinnerSelect() {
        return SpinnerSelect;
    }


}
