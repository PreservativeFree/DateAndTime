public class TimeOverload {
    private int hour;
    private int minute;
    private int second;

    public TimeOverload() {
        this(0, 0, 0);
    }

    public TimeOverload(int h) {
        this(h, 0, 0);
    }

    public TimeOverload(int h, int m) {
        this(h, m, 0);
    }

    public TimeOverload(int h, int m, int s) {
        setTime(h, m, s);
    }

    public TimeOverload(TimeOverload tm) {
        this(tm.getHour(), tm.getMinute(), tm.getSecond());
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    //set data to zero in case invalid data is sent
    public void setHour(int h) { hour = (( h >= 0 && h < 24) ? h: 0); } //make sure # 23 or less
    public void setMinute(int m) { minute = (( m >= 0 && m < 60) ? m : 0);}
    public void setSecond(int s) { second = (( s >= 0 && s < 60) ? s : 0);}
    public int getHour() {return hour;}
    public int getMinute() {return minute;}
    public int getSecond() {return second;}
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    //ternary inside a String.format function call
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

}
