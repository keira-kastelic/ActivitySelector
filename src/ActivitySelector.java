import java.util.Scanner;

public class ActivitySelector {
    public static void main(String[] args) {
        System.out.println("Welcome to the Activity Selector! Would you like to enter a temperature in Fahrenheit or Celsius? Enter f or c:"); // prompting the user
        Scanner user = new Scanner(System.in); // creating a scanner
        String unit = user.nextLine(); // reading in the users input
        System.out.println("Please enter the temperature in Fahrenheit:"); // prompting the user
        Scanner user2 = new Scanner(System.in); // creating a new scanner
        double temp = user2.nextInt(); // reading in the entered temperature

        System.out.print(temp + " degrees in "); // printing out the temperature entered
        if (unit.equals("f")) { // creating an if statement to see if the unit is fahrenheit
            System.out.print("Fahrenheit"); // printing out part of the response
            System.out.print(" is "); // printing out part of the response
            double conversion = (temp - 32) * (5.0 / 9); // converting fahrenheit to celsius
            System.out.print(conversion); // printing out the conversion
            System.out.print(" degrees in Celsius."); // printing out part of the answer
            if (temp >= 85) { // creating an if statement to see which activity you should do based off the weather
                System.out.print(" You should go swimming."); // creating the swimming bound and printing it out
            } else if (temp >= 70 && temp < 85) { // creating the tennis bound
                System.out.print(" You should lay tennis."); // printing it out
            } else if (temp >= 40 && temp < 70) { // creating the running bounds
                System.out.print(" You should go for a run."); // printing it out
            } else if (temp >= 0 && temp < 40) { // creating the skiing bound
                System.out.print(" You should go skiing."); // printing it out
            } else if (temp < 0) { // creating the gym bounds
                System.out.println(" You should go to the gym."); // pringint it out
            }

        }
        if (unit.equals("c")) { // creating an if statement for if the unit is celsius
            System.out.print("Celsius"); // printing out part of the sentence
            System.out.print(" is "); // printing out part of the sentence
            double conversion = (temp * (9 / 5.0)) + 32; // converting celsius to fahrenheit
            System.out.print(conversion); // printing out the conversion
            System.out.print(" degrees in Fahrenheit."); // printing out part of the sentence
            if (conversion >= 85) { // printing the activities to do based on the weather
                System.out.print(" You should go swimming."); // same as above
            } else if (conversion >= 70 && temp < 85) {
                System.out.print(" You should lay tennis.");
            } else if (conversion >= 40 && temp < 70) {
                System.out.print(" You should go for a run.");
            } else if (conversion >= 0 && temp < 40) {
                System.out.print(" You should go skiing.");
            } else if (conversion < 0) {
                System.out.println(" You should go to the gym.");
            }


        }

    }
}
