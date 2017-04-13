/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class Time implements ValidClass {

    private Hour hour;
    private Minute min;
    private final java.text.DecimalFormat df = new java.text.DecimalFormat("00");

    public Time(int hour, int min) {
        this.hour = new Hour();
        this.min = new Minute();
        this.hour.setHour(hour);
        this.min.setMin(min);
    }

    public void setHour(int hour) {
        this.hour.setHour(hour);
    }

    public void setMin(int min) {
        this.min.setMin(min);
    }

    public int getHour() {
        return this.hour.getHour();
    }

    public int getMin() {
        return this.min.getMin();
    }

    @Override
    public String toString() {
        return getHour() + ":" + df.format(getMin());
    }
    
    @Override
    public boolean isValid() {
	hour.setHour(hour.getHour());
	return hour.isValid()&&min.isValid();
}
}
