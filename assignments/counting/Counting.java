import java.util.ArrayList;

public class Counting {

  // You'll need to use this method
  public boolean isVowel(String c) {
    return "aeiou".indexOf(c) != -1;
  }
  public int countLetter(String str1, String str2)
  {
int counter = 0 ; 
for (int i = 0 ; i < str1.length(); i++)
{
  if (str1.substring(i,i+1).equals(str2))
  counter ++;
  
}

return counter; 


  }

}
