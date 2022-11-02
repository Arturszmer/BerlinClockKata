package tests;

import logic.ParseStringTimeToSeconds;
import logic.SecondsLampCalc;
import models.SecondsLamp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondsLampCalcTest {

    @Test
    public void shouldSecondsLampLight() {
        // given
        SecondsLamp secondsLamp = new SecondsLamp();
        SecondsLampCalc converter = new SecondsLampCalc(secondsLamp);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("02:02:22");
        // when
        converter.setColorSecondLamp(seconds);
        String secondColour = secondsLamp.getSecondColour();

        // then
        assertEquals("Y", secondColour);
    }

    @Test
    public void shoudSecondsLampLightAtMidnight() {
        // given
        SecondsLamp secondsLamp = new SecondsLamp();
        SecondsLampCalc converter = new SecondsLampCalc(secondsLamp);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("00:00:00");

        // when
        converter.setColorSecondLamp(seconds);
        String secondColour = secondsLamp.getSecondColour();

        // then
        assertEquals("Y", secondColour);
    }

    @Test
    public void shoudSecondsLampOffOneSecondAfterMidnight() {
        // given
        SecondsLamp secondsLamp = new SecondsLamp();
        SecondsLampCalc converter = new SecondsLampCalc(secondsLamp);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("00:00:01");

        // when
        converter.setColorSecondLamp(seconds);
        String secondColour = secondsLamp.getSecondColour();

        // then
        assertEquals("0", secondColour);
    }

}