package sixkyu;

import java.util.Stack;

/**
 * https://www.codewars.com/kata/checking-groups
 */

public class Groups {

  public static void main(String[] args) {
    System.out.println(groupCheck("()"));
    System.out.println(groupCheck("({"));
  }

  public static boolean groupCheck(String s){
    String[] split = s.split("");

    Stack<String> stack = new Stack<>();
    for (String s1 : split) {
      switch (s1) {
        case "(":
        case "{":
        case "[":
          stack.push(s1); break;
        case ")":
          if (!stack.pop().equals("(")) return false; break;
        case "}":
          if (!stack.pop().equals("{")) return false; break;
        case "]":
          if (!stack.pop().equals("[")) return false; break;
      }
    }

    if (!stack.empty()) return false;

    return true;
  }
}