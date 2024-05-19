import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public String insert(String first, String second, int index)
  {
    String left = first.substring(0, index);
    String leftover = first.substring(index + second.length() );
    return left + second + first.substring;
  }
}
