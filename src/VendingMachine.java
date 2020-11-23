/**
 *
 * @author Wasin Sukeesup
 * <h1>Class VendingMachine</h1>
 */

import java.util.Scanner;

public class VendingMachine {
    /**this is num attribute**/ 
    private int num = -1;
    /**this is numBrand attribute**/
    private final int numBrand = 6;
    /**this is brand attribute**/
    private static String[] brand = {"Coke","IceTea","Pepsi","Coffee","Water","Orange"};
    /**this is inStock attribute**/
    private static int[] inStock = {20,0,20,20,20,0};
    /**this is price attribute**/
    private static int[] price = {10,15,12,20,7,15};

    Scanner sc = new Scanner(System.in);

    public void VendingMachine() {
        this.brand = new String[numBrand];
        this.price = new int[numBrand];
        this.inStock = new int[numBrand];
    }
/**
 *<p>For showing the menu that is shown in the manage</p>
 */
    public void ShowBrand() {
        int a = 1;
        System.out.println("\n-------Drink Type Stock------");
        for (int i = 0; i < brand.length; i++) {
            System.out.println(a + ". " + brand[i]);
            a++;
        }
        System.out.println("-----------------------------");
    }
/**
 *<p>For showing the menu that is shown in the sale</p>
 */
    public void MenuSoda() {
        int a = 1, i = 0;        
        System.out.println("\n----------------Menu--------------------");
        System.out.println("Brand\t\t\tAmount\tPrice");
        while (i < brand.length) {
            System.out.print(a + ". " + brand[i] + "            \t" + inStock[i] + "\t" + price[i] + " Bath\n");
            a++;
            i++;
        }
        System.out.println("----------------------------------------");
    }
/**
 *<p>For checking the remaining stock for manage</p>
 */
    public void CheckInStock(int stock) {
        int a = inStock[stock];
        if (a != 0) {
            System.out.println("\n-----------------------------");
            System.out.println(brand[stock] + " in Stock " + inStock[stock]);
            System.out.println("-----------------------------");
        } else if (a == 0) {
            System.out.println("\n-----------------------------");
            System.out.println("No " + brand[stock] + " in Stock.");
            System.out.println("-----------------------------");
        }
    }
/**
 *<p>For changing products and prices in VendingMachine for manage</p>
 *@param numstock For receiving value to check which product you want to change.
 *@param newBrand For receiving value to rename the product list.
 *@param cost For receiving the value to change the price of the product.
 *@return The name and price of the newly assigned drink.
 */
    public String ReplacesInStocked(int numstock, String newBrand, int cost) {
        String name = newBrand;
        if (numstock < brand.length) {
            inStock[numstock] = 20;
            price[numstock] = cost;
            System.out.println("\n-------Replaces in Stocked------");
            System.out.println(name + " replaces " + brand[numstock] + " and is stocked with 20 cans.");
            System.out.println("In price " + price[numstock] + " Bath");
            System.out.println("-----------------------------");
            brand[numstock] = name;
        }
        return brand[numstock];
    }
/**
 *<p>For Restock products that are defined by manage</p>
 *@param numstock For receiving value to check which product you want to restock.
 *@return inStock back to Method.
 */

    public int ReStock(int numstock) {
        int num = inStock[numstock];
        if (numstock < brand.length) {
            if (num < 20) {
                System.out.println("\n-------Restocked in Stocked------");
                System.out.println(brand[numstock] + " is Restocked with 20 cans from " + inStock[numstock] + " cans of " + brand[numstock]);
                System.out.println("-----------------------------");
            } else if (num == 20) {
                System.out.println("-----------------------------");
                System.out.println(brand[numstock] + " is max.");
                System.out.println("-----------------------------");
            }
        }
        inStock[numstock] = 20;
        return inStock[numstock];

    }

/**
 *<p>For shopping within the VendingMachine.</p>
 *@param numstock For receiving value to check which product you want to purchase.
 *@return inStock in numStock
 */

    public int Buysoda(int numstock) {

        int src;
        System.out.println("\n-----------------------------");
        System.out.println(brand[numstock] + " : " + price[numstock] + " Bath");
        System.out.println("-----------------------------");
        System.out.println("0.cancel");
        System.out.print("Enter Your Money: ");
        src = sc.nextInt();
        SellProduct obj = new SellProduct(brand[numstock], price[numstock]);
        if (obj.checkMoney(src)) {
            inStock[numstock] = inStock[numstock] - 1;
        }
        return inStock[numstock];

    }

/**
 *<p>For CheckStock in the VendingMachine.</p>
 *@param numstock For receiving value to check which product you want to CheckStock.
 *@return inStock in numStock
 */

    public boolean CheckStock(int numstock) {
        if (inStock[numstock] <= 0) {
            System.out.println("\n-----------------------------");
            System.out.println("Sorry!!\nThere are 0 cans " + brand[numstock] + " in stock");
            System.out.println("-----------------------------");
            return true;
        } else {
            return false;
        }
    }
/**
 *<p>For CheckStock total in the VendingMachine.</p>
 */

    public void Total() {
        int num = 0;
        for (int i = 0; i < inStock.length; i++) {
            num = num + inStock[i];
        }
        System.out.println("\n-----------------------------");
        System.out.println("\nDrink All Type in Stock " + num + " cans");

    }

}
