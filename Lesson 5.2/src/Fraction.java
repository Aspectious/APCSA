public class Fraction
{
   //  instance variables
   private int numerator;
   private int denominator;

   // constructor: set instance variables to default values
   public Fraction()
   {
      numerator = 1;
      denominator = 1;
   }

   // constructor: set instance variables to init parameters
   public Fraction(int initNumerator, int initDenominator)
   {
      numerator = initNumerator;
      denominator = initDenominator;
   }

   // Print fraction
   public void print()
   {
     System.out.println(numerator + "/" + denominator);
   }

   // main method for testing
   public static void main(String[] args)
   {
      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction(1,2);
      // What will these print out?
      f1.print();
      f2.print();
   }
}