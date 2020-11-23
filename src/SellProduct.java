/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;


/**
 *
 * @author Naravit Prajaksanon
 * <h1>Class SellProduct</h1>
 * @see VendingMachine
 */

public class SellProduct {

    Scanner sc = new Scanner(System.in);
    /**this is product attribute**/
    private String product;
    /**this is Money attribute**/
    private int Money=0;
    /**this is cost attribute**/
    private int cost;   
/**
 *<p>For changing the name of the product list and the price of the product</p>
 *@param product For receiving product list names.
 *@param cost For receiving product list cost.
 */
    public SellProduct(String product,int cost) {
        this.product = product;
        this.cost = cost;
    }

/**
 *<p>For check money that is entered for and exchange products</p>
 *@param money For receiving money.
 *@return If the amount is enough for the product, it will be true. If cancel the product, it will be false and refund.
 */
    public boolean checkMoney(int money) {
        
        int sum;
         if (money == cost && money != 0) {
            System.out.println("\n-----------------------------");
            System.out.println("Thank you for buy " + product);
            sum = money - cost;
            System.out.println(product + " : " + cost + " Bath " + "\nYour Money : " + money + " Bath\n" + "Change : " + sum + " Bath");
            System.out.println("-----------------------------");
            return true;
        } else if (money > cost && money != 0) {
            System.out.println("\n-----------------------------");
            System.out.println("Thank you for buy " + product);
            sum = money - cost;
            System.out.println(product + " : " + cost + " Bath " + "\nYour Money : " + money + " Bath\n" + "Change : " + sum + " Bath");
            System.out.println("-----------------------------");
            return true;
        } else if(money < cost){
            if(notEnough(money) == true){
            return true;}
            else{return false;}
        }else {return false;}   
    }

/**
 *<p>For check money that is entered for and exchange products</p>
 *@param money For receiving money.
 *@return true If the money is enough or too much for the drink, it will be cheap and there will be change if the amount is greater than the drink.
 *@return flase If the amount is less than the product price, it will be put in money, or if you press cancel, it will refund the money entered.
 */
    public boolean notEnough(int money) {
        int src=0, curMoney = money, add;
            do {
                add = cost - curMoney;
                System.out.println("\n-----------------------------");
                System.out.println("Your money is not enough ");
                System.out.println("Your Money : " + curMoney + " Bath\n" + product + " : " + cost + " Bath \nPlease add : " + add + " Bath\n0.cancel");
                System.out.println("-----------------------------");
                System.out.print("Enter Your Money: ");
                src = sc.nextInt();
                curMoney = curMoney + src;                
            } while (src != 0 && curMoney < cost);

            if (src != 0) {        
                checkMoney(curMoney);
                return true;
               
            } else {
                System.out.println("\n-----------------------------");
                System.out.println("Your Money : " + curMoney + " Bath\nChange : " + curMoney + " Bath");
                System.out.println("-----------------------------");
                return false;                
            }
              
    }
   

}
