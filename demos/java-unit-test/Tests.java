/*
 * Just add test methods like the one shown below. (Oh, and maybe fix the bug in
 * subtract.) All numbers are double.
 */

public class Tests {

  public double add(double x, double y) { return x + y; }

  public double subtract(double a, double b)
   { 
    return (a - b);
    }

  public double multiply(double a, double b) { return a * b; }

public double divide(double n, double d)
{
  return n/d; 
}
public double manhattanDistance(double x1, double y1 , double x2 , double y2)
{
  return (x2-x1) + (y2-y1);
}
}
