public class Policy
{
   private int policyNum;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyTracker = 0;
     
   //no args Constructor
   public Policy()
   {
      //initializing variables for the Policy class when no arguments are given
      policyNum = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
      policyTracker++;
   }
   
   /*
      Args Constructor for the Policy class
      
      @param polNum The policy number.
      @param proNm The policy provider's name.
      @param policyHolder an instance of the PolicyHolder class containt all of the policyholders information.
   */
   public Policy(int policyNum, String providerName, PolicyHolder policyHolder)
   {
      //initializing variables for the policy class according to the constructors fields
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
      policyTracker++;
   }
   
   /*
      Method for changing the policy number.
      
      @param polNum The policy number.
      @return Returns void.
   */
   public void setPolicyNumber(int polNum)
   {
      policyNum = polNum;
   }
   
   /*
      Method for changing the proider name.
      
      @param proNm The policy provider name.
      @return Returns void.
   */   
   public void setProviderName(String proNm)
   {
      providerName = proNm;
   }
   
   /*
      Method for changing the policyholder's first name.
      
      @param firstName The policyholder's first name.
      @return Returns void.
   */
   public void setPolicyholderFirstName(String firstName)
   {
      policyHolder.setPolicyHolderFirstName(firstName);
   }
   
   /*
      Method for changing the policyholder's last name.
      
      @param lastName The policyholder's last name.
      @return Returns void.
   */
   public void setPolicyholderLstNm(String lastName)
   {
      policyHolder.setPolicyHolderLastName(lastName);
   }
   
   /*
      Method for changing the policyholder's age.
      
      @param age The policyholder's age.
      @return Returns void.
   */
   public void setPolicyholderAge(int age)
   {
      policyHolder.setPolicyHolderAge(age);
   }
   
   /*
      Method for changing the policyholder's smoking status.
      
      @param smokingStatus The policyholder's smoking status.
      @return Returns void.
   */
   public void setSmokingStaus(String smokingStatus)
   {
      policyHolder.setPolicyHolderSmokingStatus(smokingStatus);
   }
   
   /*
      Method for changing the policyholder's height.
      
      @param height The policyholder's height.
      @return Returns void.
   */
   public void setPolicyholderHeight(double height)
   {
      policyHolder.setPolicyHolderHeight(height);
   }
   
   /*
      Method for changing the policyholder's weight.
      
      @param weight The policyholder's weight.
      @return Returns void.
   */
   public void setPolicyholderWeight(double weight)
   {
      policyHolder.setPolicyHolderWeight(weight);
   }
   
   /*
      Method for returning the policy number.
      
      @return Returns the policy number.
   */
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   /*
      Method for returning the provider name.
      
      @return Returns the provider name.
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /*
      Method for returning the policyholder's first name.
      
      @return Returns the policyholder's first name.
   */
   public String getPolicyholderFirstName()
   {
      return policyHolder.getPolicyHolderFirstName();
   }
   
   /*
      Method for returning the policyholder's last name.
      
      @return Returns the policyholder's last name.
   */
   public String getPolicyholderLastName()
   {
      return policyHolder.getPolicyHolderLastName();
   }
   
   /*
      Method for returning the policyholder's age.
      
      @return Returns the policyholder's age.
   */   public int getPolicyholderAge()
   {
      return policyHolder.getPolicyHolderAge();
   }
   
   /*
      Method for returning the policyholder's smoking status.
      
      @return Returns the policyholder's smoking status.
   */
   public String getPolicyholderSmokingStatus()
   {
      return policyHolder.getPolicyHolderSmokingStatus();
   }
   
   /*
      Method for returning the policyholder's height.
      
      @return Returns the policyholder's height.
   */
   public double getPolicyholderHeight()
   {
      return policyHolder.getPolicyHolderHeight();
   }
   
   /*
      Method for returning the policyholder's weight.
      
      @return Returns the policyholder's weight.
   */
   public double getPolicyholderWeight()
   {
      return policyHolder.getPolicyHolderWeight();
   }
   
   /*
      Method for calculating and returning the policyholder's BMI.
      
      @return Returns the policyholder's BMI.
   */
   public double getPolicyholderBMI()
   {
      return policyHolder.getPolicyHolderBMI();
   }
   
      /*
      Method for calculating and returning the policy price.
      
      @return Returns the policy price.
   */
   public double getPolicyPrice()
   {
      double policyPrice = 600;
      if (policyHolder.getPolicyHolderAge() > 50)
      {
         policyPrice += 75;
      }
      if (policyHolder.getPolicyHolderSmokingStatus().equalsIgnoreCase("smoker"))
      {
         policyPrice += 100;
      }
      if (policyHolder.getPolicyHolderBMI() > 35)
      {
         policyPrice += ((policyHolder.getPolicyHolderBMI()-35)*20);
      }
      return policyPrice;
   } 
   
    /*
      Method for converting the contents of the object into a string
      
      @return Returns the object's contents as a String
   */
   public String toString()
   {
      String str = "Policy Number: " + policyNum +
                   "\nProvider Name: " + providerName +
                   "\n" + policyHolder +
                   String.format("\nPolicy Price: %.2f%n", this.getPolicyPrice());
      
      return str;
   }
   
   public int getPolicyCount()
   {
      return policyTracker;
   }
}