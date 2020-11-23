/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Run Lertjitthamrong
 * <h1>Class MenuBuy</h1>
 */
public class MenuBuy {
    
    VendingMachine obj =  new VendingMachine();
    /**this is menuBuy attribute**/
    private String menuBuy = "1. Buy Soda \n"
            + "2. Leave Menu";
    Scanner sc = new Scanner(System.in);  

/**
 * <p>Used to control the menu for the purchase.</p>
 * @see VendingMachine
 * @see TestVending
 */

    public void menuSystem() {
        int src, numcost = 0, costInput = 0;
        do {
            System.out.println("\n" + menuBuy);
            System.out.print("Select Menu : ");
            src = sc.nextInt();
            sc.nextLine();
            switch (src) {
                case 1:
                    do {
                        obj.MenuSoda();
                        System.out.println("0.Exit");
                        System.out.print("Enter Your choice: ");
                        src = sc.nextInt();
                        sc.nextLine();
                        switch (src) {
                            case 1:
                                if (obj.CheckStock(0) == false) {
                                    obj.Buysoda(0);
                                }
                                break;
                            case 2:
                                if (obj.CheckStock(1) == false) {
                                    obj.Buysoda(1);
                                }
                                break;
                            case 3:
                                if (obj.CheckStock(2) == false) {
                                    obj.Buysoda(2);
                                }
                                break;
                            case 4:
                                if (obj.CheckStock(3) == false) {
                                    obj.Buysoda(3);
                                }
                                break;
                            case 5:
                                if (obj.CheckStock(4) == false) {
                                    obj.Buysoda(4);
                                }
                                break;
                            case 6:
                                if (obj.CheckStock(5) == false) {
                                    obj.Buysoda(5);
                                }
                                break;
                        }
                    } while (src != 0);
                    break;
            }

        } while (src != 2);

        System.out.println("\n-----------------------------");
        System.out.println("Thank you for that.");
        System.out.println("-----------------------------");
    }
   
    
}
