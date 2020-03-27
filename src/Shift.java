public class Shift {


    int weekNumber;
    String day;
    int startOfShift;
    int endOfShift;

    public Shift(int weekNumber, String day, int startOfShift, int endOfShift) {
        this.weekNumber = weekNumber;
        this.day = day;
        this.startOfShift = startOfShift;
        this.endOfShift = endOfShift;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getStartOfShift() {
        return startOfShift;
    }

    public void setStartOfShift(int startOfShift) {
        this.startOfShift = startOfShift;
    }

    public int getEndOfShift() {
        return endOfShift;
    }

    public void setEndOfShift(int endOfShift) {
        this.endOfShift = endOfShift;
    }

    @Override
    public String toString() {
        return day + ", week " + weekNumber + ", " + startOfShift + "-" + endOfShift;
    }
}
