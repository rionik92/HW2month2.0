package com.company;

public class Wheel {

    //private String Свойства;
    //private String ПеременнаяУровняКласса;
    private int WheelSize;
    private String CompanyName;

    public Wheel(int WheelSize, String CompanyName) {
        this.setWheelSize(WheelSize);
        this.setCompanyName(CompanyName);
    }

    public int getWheelSize() {
        return WheelSize;
    }

    public void setWheelSize(int wheelSize) {
        WheelSize = wheelSize;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
}
