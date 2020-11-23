/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Run Lertjitthamrong
 * <h1>Class MenuManage</h1>
 * @see VendingMachine
 * @see TestVending
 */
public class MenuManage {

    VendingMachine obj = new VendingMachine();
    /**this is menuList attribute**/
    String menuList = "1. Check Stock Drink \n"
            + "2. Change Drink Brand\n"
            + "3. Restock Drink\n"
            + "4. Leave Menu";
    /**this is Password attribute**/
    private int Password;

    Scanner sc = new Scanner(System.in);
/**
 *@param password Used to set Manager Password.
 */
    public MenuManage(int password) {
        this.Password = password;
    }
/**
 *@param password Used to check Manager Password
 *@return If password correct, it will return to be true. If password incorrect, it will return to be false.
 */

    public boolean ManagerPass(int password) {
        if (password == this.Password) {
            System.out.println("\n-----------------------------");
            System.out.println(" Password is correct ");
            System.out.println("-----------------------------");
            return true;
        } else {
            System.out.println("\n-----------------------------");
            System.out.println(" Password is incorrect ");
            System.out.println("-----------------------------");
            return false;
        }
    }
/**
 *<p>Used to control the Manage menu.</p>
 */
    public void manageDrinkStock() {
        String st;
        int src;
        do {
            System.out.println("\n" + menuList);
            System.out.print("Select Menu : ");
            src = sc.nextInt();
            sc.nextLine();
            switch (src) {
                case 1:
                    do {
                        obj.ShowBrand();
                        System.out.println("0.Exit");
                        System.out.print("Enter Your choice: ");
                        src = sc.nextInt();
                        switch (src) {
                            case 1:
                                obj.CheckInStock(0);
                                break;
                            case 2:
                                obj.CheckInStock(1);
                                break;
                            case 3:
                                obj.CheckInStock(2);
                                break;
                            case 4:
                                obj.CheckInStock(3);
                                break;
                            case 5:
                                obj.CheckInStock(4);
                                break;
                            case 6:
                                obj.CheckInStock(5);
                                break;
                        }
                    } while (src != 0);
                    break;
                case 2:
                    do {
                        obj.ShowBrand();
                        System.out.println("0.Exit");
                        System.out.print("Enter Your choice: ");
                        src = sc.nextInt();
                        sc.nextLine();
                        switch (src) {
                            case 1:
                                obj.ReplacesInStocked(0, newBrand(sc), newPrice(sc));
                                break;
                            case 2:
                                obj.ReplacesInStocked(1, newBrand(sc), newPrice(sc));
                                break;
                            case 3:
                                obj.ReplacesInStocked(2, newBrand(sc), newPrice(sc));
                                break;
                            case 4:
                                obj.ReplacesInStocked(3, newBrand(sc), newPrice(sc));
                                break;
                            case 5:
                                obj.ReplacesInStocked(4, newBrand(sc), newPrice(sc));
                                break;
                            case 6:
                                obj.ReplacesInStocked(5, newBrand(sc), newPrice(sc));
                                break;
                        }
                    } while (src != 0);
                    break;
                case 3:
                    do {
                        obj.ShowBrand();
                        System.out.println("0.Exit");
                        System.out.print("Enter Your choice: ");
                        src = sc.nextInt();
                        switch (src) {
                            case 1:
                                obj.ReStock(0);
                                break;
                            case 2:
                                obj.ReStock(1);
                                break;
                            case 3:
                                obj.ReStock(2);
                                break;
                            case 4:
                                obj.ReStock(3);
                                break;
                            case 5:
                                obj.ReStock(4);
                                break;
                            case 6:
                                obj.ReStock(5);
                                break;
                        }
                    } while (src != 0);
                    break;
            }

        } while (src != 4);

        obj.Total();
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("Leave StockVendingMachine.");
        System.out.println("-----------------------------");

    }

   
/**
 *<p>Used to get the value from the keyboard that is a character.</p>
 *@param Input get the value from the keyboard that is a character.
 *@return character from the keyboard.
 */
    public static String newBrand(Scanner Input) {
        System.out.print("Enter the change name: ");
        return Input.nextLine();

    }

/**
 *<p>Used to get the value from the keyboard that is a Integer.</p>
 *@param Input get the value from the keyboard that is a Integer.
 *@return Integer from the keyboard.
 */
    public static int newPrice(Scanner Input) {
        System.out.print("Enter your price ");
        return Input.nextInt();

    }

}
