package models;

public class SecondsLamp {
    private String secondColour;
    private long numberOfSeconds;

    public SecondsLamp() {
    }

    public String getSecondColour() {
        return secondColour;
    }

    public void setSecondColour(String secondColour) {
        this.secondColour = secondColour;
    }

    public long getNumberOfSeconds() {
        return numberOfSeconds;
    }

    public void setNumberOfSeconds(long numberOfSeconds) {
        this.numberOfSeconds = numberOfSeconds;
    }

    @Override
    public String toString() {
        return "SecondsLamp{" +
                "secondColour='" + secondColour + '\'' +
                '}';
    }
}
