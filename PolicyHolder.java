public class PolicyHolder
{
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //no args Constructor
   public PolicyHolder()
   {
      //initializing variables for the Policy class when no arguments are given
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /*
      Args Constructor for the PolicyHolder class
      
      @param firstName The policyholders first name.
      @param lastName The policyholders last name.
      @param Age The policyholders age.
      @param smokingStatus The policyholders smoking status.
      @param weight The policyholders weight.
      @param height The policy holders height.
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      //initializing variables for the policy class according to the constructors fields
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /*
      Method for changing the policyholder's first name.
      
      @param firstName The policyholder's first name.
      @return Returns void.
   */
   public void setPolicyHolderFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   /*
      Method for changing the policyholder's last name.
      
      @param lastName The policyholder's last name.
      @return Returns void.
   */
   public void setPolicyHolderLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   /*
      Method for changing the policyholder's age.
      
      @param age The policyholder's age.
      @return Returns void.
   */
   public void setPolicyholderAge(int age)
   {
      this.age = age;
   }
   
   /*
      Method for changing the policyholder's smoking status.
      
      @param smokingStatus The policyholder's smoking status.
      @return Returns void.
   */
   public void setSmokingStaus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   /*
      Method for changing the policyholder's height.
      
      @param height The policyholder's height.
      @return Returns void.
   */
   public void setPolicyholderHeight(double height)
   {
      this.height = height;
   }
   
   /*
      Method for changing the policyholder's weight.
      
      @param weight The policyholder's weight.
      @return Returns void.
   */
   public void setPolicyholderWeight(double weight)
   {
      this.weight = weight;
   }
   
    /*
      Method for returning the policyholder's first name.
      
      @return Returns the policyholder's first name.
   */
   public String getPolicyHolderFirstName()
   {
      return firstName;
   }
   
   /*
      Method for returning the policyholder's last name.
      
      @return Returns the policyholder's last name.
   */
   public String getPolicyHolderLastName()
   {
      return lastName;
   }
   
   /*
      Method for returning the policyholder's age.
      
      @return Returns the policyholder's age.
   */   public int getPolicyHolderAge()
   {
      return age;
   }
   
   /*
      Method for returning the policyholder's smoking status.
      
      @return Returns the policyholder's smoking status.
   */
   public String getPolicyHolderSmokingStatus()
   {
      return smokingStatus;
   }
   
   /*
      Method for returning the policyholder's height.
      
      @return Returns the policyholder's height.
   */
   public double getPolicyHolderHeight()
   {
      return height;
   }
   
   /*
      Method for returning the policyholder's weight.
      
      @return Returns the policyholder's weight.
   */
   public double getPolicyHolderWeight()
   {
      return weight;
   }
   
   /*
      Method for calculating and returning the policyholder's BMI.
      
      @return Returns the policyholder's BMI.
   */
   public double getPolicyHolderBMI()
   {
      return ((weight*703)/(height*height));
   }
   
   /*
      Method for converting the contents of the object into a string
      
      @return Returns the object's contents as a String
   */
   public String toString()
   {
      String str = "Policyholder's First Name: " + firstName +
                   "\nPolicyholder's Last Name: " + lastName +
                   "\nPolicyholder's Age: " + age +`
                   "\nPolicyholder's Smoking Status: " + smokingStatus +
                   "\nPolicyholder's Height: " + height + " inches" +
                   "\nPolicyholder's Weight: " + weight + " pounds" +
                   String.format("\nPolicyholder's BMI: %.2f%n", this.getPolicyHolderBMI());
      
      return str;
   }
}