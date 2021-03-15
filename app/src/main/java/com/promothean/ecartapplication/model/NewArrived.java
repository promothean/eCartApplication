package com.promothean.ecartapplication.model;

public class NewArrived {
    private int resID;
    private String txtTitle;
    private String txtPrice;

    public NewArrived(int resID, String txtTitle, String txtPrice) {
        this.resID = resID;
        this.txtTitle = txtTitle;
        this.txtPrice = txtPrice;
    }

    public int getResID() {
        return resID;
    }

    public void setResID(int resID) {
        this.resID = resID;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(String txtPrice) {
        this.txtPrice = txtPrice;
    }
}