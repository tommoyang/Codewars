public class PrimeDecomp {

  public static void main(String[] args) {
    System.out.println(factors(7775460)); // (2**2)(3**3)(5)(7)(11**2)(17)
  }

  public static String factors(int n) {
    int number = 1;
    String result = "";
    while (true) {
      number++;

      if (!isPrime(number)) continue;

      int count = 0;
      for (int i = 0; i < n; i++) {
        if (n % number > 0) break;

        n = n / number;
        count++;
      }

      if (count > 0) {
        result += "(" + number + ((count > 1) ? "**" + count : "") + ")";
      }

      if (n <= 1) return result;
    }
  }

  public static boolean isPrime(int number) {
    if (number <= 3) return true;
    if (number % 2 == 0 || number % 3 == 0) return false;

    // Calculate if number is prime
    int w = 2;
    for (int i = 5; i < number; i += w) {
      if (number % i == 0) return false;

      w = 6 - w;
    }

    return true;
  }
}