public class CLuke_P1
{

   public static void main (String[] args)
   {
      //Initialize Variables
      double foodBill = 150.00;
      double nonFoodBill = 50.00;
      double foodSalesTax = 0.03;
      double nonFoodSalesTax = 0.0675;
      double foodTaxNum = 0.00;
      double nonFoodTaxNum = 0.00;
      double taxTotal = 0.00;
      
      //Calculate tax for food bill
      foodTaxNum = foodBill * foodSalesTax;
      
      //Calculate tac for non-food bill
      nonFoodTaxNum = nonFoodBill * nonFoodSalesTax;
      
      //Add tax amounts together
      taxTotal = foodTaxNum + nonFoodTaxNum;
      
      //Output final results
      System.out.println("The total tax for your bill is: " + taxTotal);
   }

}