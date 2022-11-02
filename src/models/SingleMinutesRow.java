package models;

public class SingleMinutesRow implements Minutes {

    private String singleMinuteColor;

    public SingleMinutesRow() {
    }

    public String getSingleMinuteColor() {
        return singleMinuteColor;
    }

    public void setSingleMinuteColor(String singleMinuteColor) {
        this.singleMinuteColor = singleMinuteColor;
    }


    @Override
    public String toString() {
        return "SingleMinutesRow{" +
                "oneMinuteColor='" + singleMinuteColor + '\'' +
                '}';
    }
}
