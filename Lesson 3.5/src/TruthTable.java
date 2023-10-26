public class TruthTable
{
   public static void main(String[] args)
   {
       // Test multiple values for these variables
       boolean sunny = false;
       int temperature = 90;
       boolean raining = false;


       if (sunny && !raining) {
    	   if (temperature > 85) {
    		   System.out.println("It's Sunny outside with a temperature of " + temperature + ". Bring some sunscreen!");
    	   } else if (temperature > 60 && temperature <=85) {
    		   System.out.println("It's Sunny outside with a temperature of " + temperature + ". Perfect weather.");   
    	   } else {
    		   System.out.println("It's Sunny outside with a temperature of " + temperature + ". Wear a coat!");
    	   }
       } else if (raining && !sunny) {
    	   System.out.println("It's Raining outside with a temperature of " + temperature + ". Bring an umbrella!");
       } else if (raining && sunny) {
    	   System.out.println("It's Raining outside with a temperature of " + temperature + ". Look out for Rainbows!");
       } else {
    	   System.out.println("It's Partly Cloudy outside with a temperature of " + temperature + ".");
       }



       // Write an if statement for: If it's sunny,
       //  OR if the temperature is greater than 80
       //     and it's not raining, "Go to the beach!"


   }
}

