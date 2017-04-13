/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class Hour implements ValidClass {

    private int hour;
    private boolean validhour = false;

    public Hour() {//no arg for hour
        validhour = false;
        hour = 0;
    }

    public Hour(int hourinput) {//int for hour
        setHour(hourinput);

    }

    public Hour(double hourinput) {//double typecast for hour
        setHour((int) hourinput);

    }

    public Hour(String hourinput) {//no arg for hour
        String hlatch = hourinput.replaceAll("[\\s\\-() ]", "");
        if (hlatch.matches("[0-9]+")) {
            setHour(Integer.parseInt(hourinput));
            //validhour=true;
        } else {
            hour = 1111;
            validhour = false;
        }

    }

    public void setHour(int hourinput) {
        if (hourinput <= 24 && hourinput >= 0) {
            validhour = true;

            hour = hourinput;
        } else {
            hour = 1111;
            validhour = false;
        }
    }

    public int getHour() {
        return hour;
    }

    public String getHourString() {
        String hourdisplay = "";
        if (hour <= 9) {
            hourdisplay = ("0" + Integer.toString(hour));
        } else {
            hourdisplay = (Integer.toString(hour));
        }

        return hourdisplay;
    }

    @Override
    public boolean isValid() {

        return validhour;
    }
}
