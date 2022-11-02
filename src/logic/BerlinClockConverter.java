package logic;

import models.SecondsLamp;
import models.SingleMinutesRow;

public class BerlinClockConverter {

    private final SecondsLamp secondsLamp;
    private final SingleMinutesRow singleMinutesRow;

    public BerlinClockConverter(SecondsLamp secondsLamp, SingleMinutesRow singleMinutesRow) {
        this.secondsLamp = secondsLamp;
        this.singleMinutesRow = singleMinutesRow;
    }

    public String convertToBerlinClock(String time){
        SecondsLampCalc secondsLampCalc = new SecondsLampCalc(secondsLamp);
        ParseToOneMinuteLamp parse = new ParseToOneMinuteLamp(singleMinutesRow);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds(time);
        secondsLampCalc.setColorSecondLamp(seconds);
        parse.setColorOneMinuteLamp(seconds);
        return null;
    }

}
