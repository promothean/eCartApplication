package com.promothean.ecartapplication.model;

public class Trending {
    private int resID;
    private String txtTitle;

    public Trending(int resID, String txtTitle) {
        this.resID = resID;
        this.txtTitle = txtTitle;
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
}