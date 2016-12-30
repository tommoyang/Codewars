public class AvengersLine {
  public static String Tickets(int[] peopleInLine) {
    int twentyfive = 0;
    int fifty = 0;
    int hundred = 0;
    for (int person : peopleInLine) {
      int changeNeeded = 0;
      switch (person) {
        case 25:
          twentyfive++;
          break;
        case 50:
          fifty++;
          changeNeeded += 25;
          break;
        case 100:
          hundred++;
          changeNeeded += 75;
          break;
      }

      while (changeNeeded > 0) {
        if (hundred > 0 && changeNeeded - 100 > 0) {
          changeNeeded -= 100;
          hundred--;
        } else if (fifty > 0 && changeNeeded - 50 > 0) {
          changeNeeded -= 50;
          fifty--;
        } else if (twentyfive > 0 && changeNeeded - 25 > 0) {
          changeNeeded -= 25;
          twentyfive--;
        } else {
          return "NO";
        }
      }
    }

    return "YES";
  }
}