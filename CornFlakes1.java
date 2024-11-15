
public class CornFlakes1 {

    /*
    PseudoCode For divideBy5 Method
    first i take in a number of int data type
    second i put a condition that if its divisible by 5
    it should return its square root
     */
    public double divideBy5(int number) {
        if (number % 5 == 0) {
            System.out.println(Math.sqrt(number));
        }
        return Math.sqrt(number);
    }



    /*
    PseudoCode For investmentAccount Method
    first i took 3 input which are the investmentAmount, MonthlyInterestRate, Years
    Second to calculate the future investment amount, fist calculated the interest
    third by adding the monthly interest by 1 first
    then multiply it by the years and then multiply it by the investment amount
    to get the futureInvestmentAmount
     */
    public double investmentAccount(double investmentAmount, double monthlyInterest, int years) {
        return investmentAmount * (1 +  monthlyInterest) * years;
    }



    /*
    PseudoCode For onlyFloat Method
    I took input in the same data type
    to determine if it's a float there has to be a remainder
    so i used a logic that says if the input divided by 2 leaves a remainder
    then that means it's a float
     */
    public int onlyFloats (double a, double b) {
        if (a % 2 != 0  && b % 2 != 0.1) {
            return 2;
        }
        else if (a % 2 != 0  || b % 2 != 0) {
            return 1;
        }
        else {
            return 0;
        }
    }


    /*
    PseudoCode For myDiscount Method
    So first I took input, price and discount
    to determine the discount amount i multiplied the discount by the price then divided by 100
    then i subtracted my discount from the price the get the discounted price
     */
    public double myDiscount(double price, double discount) {
        double priceAfterDiscount = (discount * price) / 100;
        double finalPrice = price - priceAfterDiscount;
        return finalPrice;
    }

    
    public static void main(String[] args) {

        


    }
}
