public class SpinWords {
  public static void main(String[] args) {
    spinWords( "Hey fellow warriors" ); // "Hey wollef sroirraw"
    spinWords( "This is a test"); // "This is a test"
    spinWords( "This is another test" ); // "This is rehtona test"
  }

  private static String spinWords(String sentence) {
    String newStr = "";
    for (String word : sentence.split(" ")) {
      if (word.length() <= 4) {
        newStr += word + " ";
        continue;
      }

      String newWord = "";

      for (int i = word.length(); i > 0; i--) {
        newWord += word.charAt(i - 1);
      }

      newStr += newWord + " ";
    }

    newStr = newStr.substring(0, newStr.length() - 1);

    System.out.println(newStr);

    return newStr;
  }
}