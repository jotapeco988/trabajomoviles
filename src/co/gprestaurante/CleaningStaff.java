package co.gprestaurante;
public class CleaningStaff  extends Person{
    public String getDayOff() {
        return DayOff;
    }

    public void setDayOff(String dayOff) {
        DayOff = dayOff;
    }

    private String DayOff;

}
