import java.util.Scanner;

public class Project_Jack_Doerr
{
   public static void main(String[] args)
   {
      //variables to store user input
      int polNumber;
      String proName;
      String firstNm;
      String lastNm;
      int age;
      String smokeStat;
      double h;
      double w;
      
      //scanner object that will collect user input
      Scanner keyboard = new Scanner(System.in);
      
      //collects all of the user's input
      System.out.print("Please enter the Policy Number: ");
      polNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      proName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstNm = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastNm = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStat = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      h = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      w = keyboard.nextDouble();
      
      //Policy object with all of the user's info added through the args
      Policy demo = new Policy(polNumber, proName, firstNm, lastNm, age, smokeStat, h, w);
      
      System.out.println();
      System.out.println("Policy Number: " + demo.getPolicyNumber());
      System.out.println("Provider Name: " + demo.getProviderName());
      System.out.println("Policyholder's First Name: " + demo.getPolicyholderFirstName());
      System.out.println("Policyholder's Last Name: " + demo.getPolicyholderLastName());
      System.out.println("Policyholder's Age: " + demo.getPolicyholderAge());
      System.out.println("Policyholder's Smoking Status: " + demo.getPolicyholderSmokingStatus());
      System.out.println("Policyholder's Height: " + demo.getPolicyholderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + demo.getPolicyholderWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f%n", demo.getPolicyholderBMI());
      System.out.printf("Policy Price: %.2f%n", demo.getPolicyPrice());
   }
}