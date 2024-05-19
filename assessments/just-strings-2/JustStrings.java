import java.util.ArrayList;

public class JustStrings {

  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public String insert(String first, String second, int index)
  {
    String leftover = "";
    String left = first.substring(0, index);

     leftover = first.substring(index   );
    return left + second + leftover;
  }
}
