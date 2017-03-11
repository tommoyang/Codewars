package sixkyu;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/rectangle-into-squares
 */

public class SqInRect {

  public static void main(String[] args) {
    System.out.println(sqInRect(5, 3));
    System.out.println(sqInRect(5, 5));
  }

  public static List<Integer> sqInRect(int lng, int wdth) {
    if (lng == wdth) {
      return null;
    }

    List<Integer> squares = new ArrayList<>();
    while (true) {
      if (lng == wdth) {
        squares.add(lng);
        return squares;
      } else if (lng < wdth) {
        squares.add(lng);
        wdth = wdth - lng;
      } else if (wdth < lng) {
        squares.add(wdth);
        lng = lng - wdth;
      }
    }
  }
}