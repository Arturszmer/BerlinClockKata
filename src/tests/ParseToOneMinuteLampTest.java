package tests;

import logic.ParseStringTimeToSeconds;
import logic.ParseToOneMinuteLamp;
import models.SingleMinutesRow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseToOneMinuteLampTest {

    @Test
    public void shouldLightFourLamps() {
        // given
        SingleMinutesRow singleMinutesRow = new SingleMinutesRow();
        ParseToOneMinuteLamp parse = new ParseToOneMinuteLamp(singleMinutesRow);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("23:59:59");

        // when
        parse.setColorOneMinuteLamp(seconds);
        String minutesColor = singleMinutesRow.getSingleMinuteColor();

        // then
        assertEquals("YYYY", minutesColor);
    }

    @Test
    public void shouldNotLightAllLamps() {
        // given
        SingleMinutesRow singleMinutesRow = new SingleMinutesRow();
        ParseToOneMinuteLamp parse = new ParseToOneMinuteLamp(singleMinutesRow);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("00:00:00");

        // when
        parse.setColorOneMinuteLamp(seconds);
        String minutesColor = singleMinutesRow.getSingleMinuteColor();

        // then
        assertEquals("0000", minutesColor);
    }

    @Test
    public void shouldLightTwoLamps() {
        // given
        SingleMinutesRow singleMinutesRow = new SingleMinutesRow();
        ParseToOneMinuteLamp parse = new ParseToOneMinuteLamp(singleMinutesRow);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("12:32:00");

        // when
        parse.setColorOneMinuteLamp(seconds);
        String minutesColor = singleMinutesRow.getSingleMinuteColor();

        // then
        assertEquals("YY00", minutesColor);
    }

    @Test
    public void shouldLightAllLampsOnNoon() {
        // given
        SingleMinutesRow singleMinutesRow = new SingleMinutesRow();
        ParseToOneMinuteLamp parse = new ParseToOneMinuteLamp(singleMinutesRow);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("12:34:00");

        // when
        parse.setColorOneMinuteLamp(seconds);
        String minutesColor = singleMinutesRow.getSingleMinuteColor();

        // then
        assertEquals("YYYY", minutesColor);
    }

    @Test
    public void shouldNotLightLampsOnNoon() {
        // given
        SingleMinutesRow singleMinutesRow = new SingleMinutesRow();
        ParseToOneMinuteLamp parse = new ParseToOneMinuteLamp(singleMinutesRow);
        long seconds = ParseStringTimeToSeconds.ParseStringToSeconds("12:35:00");

        // when
        parse.setColorOneMinuteLamp(seconds);
        String minutesColor = singleMinutesRow.getSingleMinuteColor();

        // then
        assertEquals("0000", minutesColor);
    }
}