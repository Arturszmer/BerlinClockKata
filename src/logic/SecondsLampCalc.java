package logic;

import models.SecondsLamp;

public class SecondsLampCalc {

    private final SecondsLamp secondsLamp;

    public SecondsLampCalc(SecondsLamp secondsLamp) {
        this.secondsLamp = secondsLamp;
    }

    public void setColorSecondLamp(long time){
        secondsLamp.setNumberOfSeconds(time);
        if (secondsLamp.getNumberOfSeconds() %2 == 0){
            secondsLamp.setSecondColour("Y");
        } else {
            secondsLamp.setSecondColour("0");
        }
    }
}
