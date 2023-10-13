public class ChallengeUnicode
{
   public static void main(String[] args)
   {
     System.out.println("A in ASCII and Unicode is the decimal number 65: " + (char)65);
     System.out.println("You can typecast a decimal number to char for the Chinese character for sun: " + (char)11932);
     System.out.println("Or you can print out the Chinese character for moon using unicode hex: \u2E9D");


   }
}