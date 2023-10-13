
/** Class Fraction */
class Fraction
{
   //  instance variables
   private int numerator;
   private int denominator;

   // constructor: set instance variables to default values
   public Fraction()
   {
      int d = 1;
      numerator = d;
      denominator = d;
   }

   // constructor: set instance variables to init parameters
   public Fraction(int initNumerator, int initDenominator)
   {
      numerator = initNumerator;
      denominator = initDenominator;
   }

   public String toString()
   {
     // if the denominator is 1, then just return the numerator
     if (denominator == d) {
        int newNumerator = 1;
     }
     return newNumerator + "/" + denominator;
   }
}
