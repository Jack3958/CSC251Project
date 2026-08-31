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
   
   //Constructor for the policy class with args
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
   
   //method for changing the policy number
   public void setPolicyNumber(int polNum)
   {
      policyNum = polNum;
   }
   
   //method for changing the provider name
   public void setProviderName(String proNm)
   {
      providerName = proNm;
   }
   
   //method for changing the policyholder's first name
   public void setPolicyholderFirstName(String polFstNm)
   {
      policyholderFstNm = polFstNm;
   }
   
   //method for changing the policyholder's last name
   public void setPolicyholderLstNm(String polLstNm)
   {
      policyholderLstNm = polLstNm;
   }
   
   //method for changing the policyholder's age
   public void setPolicyholderAge(int polAge)
   {
      policyholderAge = polAge;
   }
   
   //method for changing the policyholder's smoking status
   public void setSmokingStaus(String polSmkStat)
   {
      policyholderSmokingStatus = polSmkStat;
   }
   
   //method for changing the policyholder's height
   public void setPolicyholderHeight(double polHght)
   {
      policyholderHeight = polHght;
   }
   
   //method for changing the policyholder's weight
   public void setPolicyholderWeight(double polWght)
   {
      policyholderWeight = polWght;
   }
   
   //method for returning the policy number
   public int getPolicyNumber()
   {
      return policyNum;
   }
   
   //method for returning the provider name
   public String getProviderName()
   {
      return providerName;
   }
   
   //method for returning the policyholder's first name
   public String getPolicyholderFirstName()
   {
      return policyholderFstNm;
   }
   
   //method for returning the policyholder's last name
   public String getPolicyholderLastName()
   {
      return policyholderLstNm;
   }
   
   //method for returning the policyholder's age
   public int getPolicyholderAge()
   {
      return policyholderAge;
   }
   
   //method for returning the policyholder's smoking status
   public String getPolicyholderSmokingStatus()
   {
      return policyholderSmokingStatus;
   }
   
   //method for returning the policyholder's height
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }
   
   //method for returning the policyholder's weight
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }
   
   //method for returning the policyholder's BMI
   public double getPolicyholderBMI()
   {
      return ((policyholderWeight*703)/(policyholderHeight*policyholderHeight));
   }
   
   //method for returning the policy price
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