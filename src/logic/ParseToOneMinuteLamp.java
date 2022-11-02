package logic;

import models.SingleMinutesRow;

public class ParseToOneMinuteLamp {

    private final SingleMinutesRow singleMinutesRow;

    public ParseToOneMinuteLamp(SingleMinutesRow singleMinutesRow) {
        this.singleMinutesRow = singleMinutesRow;
    }

    public void setColorOneMinuteLamp(long seconds){
        long sec = seconds / 60;
        if (sec % 5 == 0 || sec < 1){
            singleMinutesRow.setSingleMinuteColor("0000");
        } else if (sec % 5 == 1) {
            singleMinutesRow.setSingleMinuteColor("Y000");
        } else if (sec % 5 == 2) {
            singleMinutesRow.setSingleMinuteColor("YY00");
        } else if (sec % 5 == 3) {
            singleMinutesRow.setSingleMinuteColor("YYY0");
        } else {
            singleMinutesRow.setSingleMinuteColor("YYYY");
        }
    }
}
