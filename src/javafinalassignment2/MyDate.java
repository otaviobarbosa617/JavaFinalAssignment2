package javafinalassignment2;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MyDate {
    //Declarations
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        day = d;
    }

    public String getMonthLong() {
        String monthLong;
        monthLong = Month.of(month).getDisplayName(TextStyle.FULL_STANDALONE, Locale.CANADA);
        return monthLong;
    }

    public String getMonthShort() {
        String monthShort;
        monthShort = Month.of(month).getDisplayName(TextStyle.SHORT, Locale.CANADA);
        return monthShort;
    }

    public void setMonth(int m) {
        month = m;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        year = y;
    }

    @Override
    public String toString() {
        return "Date{" +
                "Day: " + day +
                ", Month:" + month +
                ", Year: " + year +
                '}';
    }
}
