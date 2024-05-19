import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public String insert(String first, String second, int index)
  {
    String leftover = "";
    String left = first.substring(0, index);
    if (index + second.length() < first.length())

     leftover = first.substring(index+1   );
    return left + second + leftover;
  }
}
