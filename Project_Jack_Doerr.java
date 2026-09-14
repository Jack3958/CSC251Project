import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Jack_Doerr
{
   public static void main(String[] args) throws IOException
   {
      //variables to store input.
      int polNumber;
      String proName;
      String firstNm;
      String lastNm;
      int age;
      String smokeStat;
      double h;
      double w;
      int counter = 0;
      int smokeCount = 0;
      int nonSmokeCount = 0;
      int x = 0;
      
      //ArrayList to store policy objects.
      var policyList = new ArrayList<Policy>();
      
      //File and Scanner objects needed to read data from a file.
      File fileOne = new File("PolicyInformation.txt");
      Scanner fileReader = new Scanner(fileOne);
      
      //do-while loop to collect data from .txt file and use the data to create a Policy object inside of the policyList arrayList.
      do
      {
         polNumber = fileReader.nextInt();
         fileReader.nextLine();
         
         proName = fileReader.nextLine();
         
         firstNm = fileReader.nextLine();
         
         lastNm = fileReader.nextLine();
         
         age = fileReader.nextInt();
         fileReader.nextLine();
         
         smokeStat = fileReader.nextLine();
         
         h = fileReader.nextInt();
         fileReader.nextLine();
         
         w = fileReader.nextInt();
         fileReader.nextLine();
         
         if (fileReader.hasNext())
            fileReader.nextLine();
         
         policyList.add(new Policy(polNumber, proName, firstNm, lastNm, age, smokeStat, h, w));
         counter++;
      }
      while (fileReader.hasNext());
      
      //closes file.
      fileReader.close();
      
      //Output of the program.
      System.out.println();
      while (x < counter)
      {
         Policy demo = policyList.get(x);
         
         smokeStat = demo.getPolicyholderSmokingStatus();
         if (smokeStat.equals("smoker"))
         {
            smokeCount++;
         }
         else
         {
            nonSmokeCount++;
         }
         
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
         System.out.println();
         
         x++;
      }
      
      System.out.println("The number of policies with a smoker is: " + smokeCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokeCount);
   }
}