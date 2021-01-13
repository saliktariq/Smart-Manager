package app.smartmanager.helper;

public class DateTime {
    private int dayOfTheMonth;
    private int month;
    private int year;
    private int hour;
    private int minute;

    public DateTime(int minute, int hour, int dayOfTheMonth, int month, int year) {
        this.dayOfTheMonth = dayOfTheMonth;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public int getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    public void setDayOfTheMonth(int dayOfTheMonth) {
        this.dayOfTheMonth = dayOfTheMonth;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
