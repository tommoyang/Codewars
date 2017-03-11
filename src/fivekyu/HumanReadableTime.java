package fivekyu;

/**
 * https://www.codewars.com/kata/human-readable-time
 */

public class HumanReadableTime {
  public static String makeReadable(int seconds) {
    int minutes = seconds / 60;
    int hours = minutes / 60;

    seconds = (seconds - (minutes * 60)) % 60;
    minutes = (minutes - (hours * 60)) % 60;

    return String.format("%02d:%02d:%02d", hours, minutes, seconds);
  }

}