/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SymphonyManagement;

public class Date {

    private Year year;
    private Month month;
    private Day day;
    private Time time;

    Date(int year, int month, int day, Time time) {
        this.year = new Year();
        this.month = new Month();
        this.day = new Day();
        setYear(year);
        setMonth(month);
        setDay(day);
        this.time = time;
    }

    void setYear(int year) {
        this.year.setYear(year);
    }

    void setMonth(int month) {
        this.month.setMonth(month);
    }

    void setDay(int day) {
        this.day.setDay(day);
    }

    int getYear() {
        return this.year.getYear();
    }

    int getMonth() {
        return this.month.getMonth();
    }

    int getDay() {
        return this.day.getDay();
    }
    
    void setTime(Time time) {
        this.time.getHour();
        this.time.getMin();
    }
    
    Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return getMonth() + "/" + getDay() + "/" + getYear() + " - " + getTime();
    }
}
