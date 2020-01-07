import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will convert temperatures");
        System.out.println("User can enter in Fahrenheit or celsius");
        String response = null;
        double temperature;
        do
            {
                System.out.println("please enter the temperature");
                temperature = keyboard.nextDouble();
                System.out.println("please enter C or F to convert the temperature to");
                char degree = keyboard.next().charAt(0);
                boolean isTrue = true;
                while ((degree == 'C')||(degree =='c')||(degree =='F')||(degree=='f')&& isTrue )
                {
                    if((degree == 'C')||(degree =='c'))
                    {
                        System.out.println("We will convert this temperature to Celsius: " + 5 * (temperature - 32) / 9.0);
                        isTrue = false;
                    }

                    else if((degree =='F')||(degree=='f'))
                    {
                        System.out.println("We will convert this temperature to Fahrenheit: " + (9 * temperature / 5.0) + 32);
                        isTrue = false;
                    }

                }
                System.out.println("do you wanna compute another temperature");
                System.out.println("please enter yes or no");
                response = keyboard.nextLine();
            }while (!(response.equalsIgnoreCase("Q")));
    }
}
