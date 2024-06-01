/*
 * A number is prime if it is not divisible by any number other than 1 and
 * itself. 1 is not prime. Thus you can test whether a number greater than 1 is
 * prime by checking whether it is divisible by any smaller number greater than
 * one.
 */

public class Primes {
  public static void main(String args[])
  {

    isPrime(2);
  }
  public static boolean isPrime(int number)
  {
    for (int i = 2 ; i < number; i++)
    {
      if (number == 1)
      return false; 
      if (number == 2)
      return true; 
      if( number % i == 0)
      return false; 
    }
    return true; 
  }
}
