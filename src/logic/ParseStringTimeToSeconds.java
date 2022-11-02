package logic;

import java.time.Duration;

public class ParseStringTimeToSeconds {

    public static long ParseStringToSeconds(String time) {
        String durationStr = time.replaceAll("(\\d+):(\\d+):(\\d+)", "PT$1H$2M$3S");
        return Duration.parse(durationStr).toSeconds();
    }
}
