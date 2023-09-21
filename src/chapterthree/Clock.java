package chapterthree;

public class Clock {
    private int second;
    private int minute;
    private int hour;


    public Clock(int hour, int minute, int second) {
        this.minute = minute;
        this.second = second;
        this.hour = hour;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setMinute(int minute) {
        if (minute <= 60) {
            this.minute = minute;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setHour(int hour) {
        if (hour <= 24){
            this.hour = hour;
        }
    }

    public int getHour() {
        return hour;
    }
    public String display() {
        return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
    }
}
