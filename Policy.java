public class Policy
{
   int policyNum;
   String providerName;
   String policyholderFstNm;
   String policyholderLstNm;
   int policyholderAge;
   String policyholderSmokingStatus;
   double policyholderHeight;
   double policyholderWeight;
   
   //no args Constructor
   public Policy()
   {
      //initializing variables for the Policy class when no arguments are given
      policyNum = 0;
      providerName = "";
      policyholderFstNm = "";
      policyholderLstNm = "";
      policyholderAge = 0;
      policyholderSmokingStatus = "";
      policyholderHeight = 0;
      policyholderWeight = 0;
   }
   
   /*
      Args Constructor for the Policy class
      
      @param polNum The policy number.
      @param proNm The policy provider's name.
      @param polholderFstNm The policyholders first name.
      @param polholderLstNm The policyholders last name.
      @param polholderAge The policyholders age.
      @param polholderSmkStat The policyholders smoking status.
      @param polholderWght The policyholders weight.
      @param polholderHght The policy holders height.
   */
   public Policy(int polNum, String proNm, String polholderFstNm, String polholderLstNm, int polholderAge, String polholderSmkStat, double polholderHght, double polholderWght)
   {
      //initializing variables for the policy class according to the constructors fields
      policyNum = polNum;
      providerName = proNm;
      policyholderFstNm = polholderFstNm;
      policyholderLstNm = polholderLstNm;
      policyholderAge = polholderAge;
      policyholderSmokingStatus = polholderSmkStat;
      policyholderHeight = polholderHght;
      policyholderWeight = polholderWght;
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
      
      @param polFstNm The policyholder's first name.
      @return Returns void.
   */
   public void setPolicyholderFirstName(String polFstNm)
   {
      policyholderFstNm = polFstNm;
   }
   
   /*
      Method for changing the policyholder's last name.
      
      @param polLstNm The policyholder's last name.
      @return Returns void.
   */
   public void setPolicyholderLstNm(String polLstNm)
   {
      policyholderLstNm = polLstNm;
   }
   
   /*
      Method for changing the policyholder's age.
      
      @param polAge The policyholder's age.
      @return Returns void.
   */
   public void setPolicyholderAge(int polAge)
   {
      policyholderAge = polAge;
   }
   
   /*
      Method for changing the policyholder's smoking status.
      
      @param polSmkStat The policyholder's smoking status.
      @return Returns void.
   */
   public void setSmokingStaus(String polSmkStat)
   {
      policyholderSmokingStatus = polSmkStat;
   }
   
   /*
      Method for changing the policyholder's height.
      
      @param polHght The policyholder's height.
      @return Returns void.
   */
   public void setPolicyholderHeight(double polHght)
   {
      policyholderHeight = polHght;
   }
   
   /*
      Method for changing the policyholder's weight.
      
      @param polWght The policyholder's weight.
      @return Returns void.
   */
   public void setPolicyholderWeight(double polWght)
   {
      policyholderWeight = polWght;
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
      return policyholderFstNm;
   }
   
   /*
      Method for returning the policyholder's last name.
      
      @return Returns the policyholder's last name.
   */
   public String getPolicyholderLastName()
   {
      return policyholderLstNm;
   }
   
   /*
      Method for returning the policyholder's age.
      
      @return Returns the policyholder's age.
   */   public int getPolicyholderAge()
   {
      return policyholderAge;
   }
   
   /*
      Method for returning the policyholder's smoking status.
      
      @return Returns the policyholder's smoking status.
   */
   public String getPolicyholderSmokingStatus()
   {
      return policyholderSmokingStatus;
   }
   
   /*
      Method for returning the policyholder's height.
      
      @return Returns the policyholder's height.
   */
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }
   
   /*
      Method for returning the policyholder's weight.
      
      @return Returns the policyholder's weight.
   */
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }
   
   /*
      Method for calculating and returning the policyholder's BMI.
      
      @return Returns the policyholder's BMI.
   */
   public double getPolicyholderBMI()
   {
      return ((policyholderWeight*703)/(policyholderHeight*policyholderHeight));
   }
   
      /*
      Method for calculating and returning the policy price.
      
      @return Returns the policy price.
   */
   public double getPolicyPrice()
   {
      double policyPrice = 600;
      if (policyholderAge > 50)
      {
         policyPrice += 75;
      }
      if (policyholderSmokingStatus.equalsIgnoreCase("smoker"))
      {
         policyPrice += 100;
      }
      if (((policyholderWeight*703)/(policyholderHeight*policyholderHeight)) > 35)
      {
         policyPrice += ((((policyholderWeight*703)/(policyholderHeight*policyholderHeight))-35)*20);
      }
      return policyPrice;
   } 
}