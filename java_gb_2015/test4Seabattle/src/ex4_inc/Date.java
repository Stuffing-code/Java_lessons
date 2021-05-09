package ex4_inc;

public class Date {
    private int day;
    private int mount;
    private int year;


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        }
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
