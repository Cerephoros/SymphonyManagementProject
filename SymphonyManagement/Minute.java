/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

/**
 *
 * @author Sony
 */
public class Minute implements ValidClass {

    private int min;
    private boolean validminute = false;

    /**
     *
     */
    public Minute() {
        validminute = false;
        min = 0;
    }

    /**
     *
     * @param minuteinput
     */
    public Minute(int minuteinput) {
        setMin(minuteinput);

    }

    public Minute(double minuteinput) {
        setMin((int) minuteinput);
    }

    public Minute(String minuteinput) {
        String mlatch = minuteinput.replaceAll("[\\s\\-() ]", "");
        if (mlatch.matches("[0-9]+")) {
            setMin(Integer.parseInt(minuteinput));
        } else {
            min = 1111;
            validminute = false;
        }

    }

    public void setMin(int mininput) {

        if (mininput <= 59 && mininput >= 0) {
            validminute = true;//could use dialog alerts and while loop

            min = mininput;
        } else {
            min = 1111;
            validminute = false;
        }

    }

    public int getMin() {
        return min;
    }

    public String getMinString() {
        String minutedisplay = "";
        if (min <= 9) {
            minutedisplay = ("0" + Integer.toString(min));
        } else {
            minutedisplay = (Integer.toString(min));
        }

        return minutedisplay;
    }

    @Override
    public boolean isValid() {

        return validminute;
    }
}
