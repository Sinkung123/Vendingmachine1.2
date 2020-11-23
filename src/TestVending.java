/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *<h1>Main Class TestVending</h1>
 *<p>Is the controller of all functions. VendingMachine By calling from various methods</p>
 *@see VendingMachine
 *@see MenuBuy
 *@see MenuManage
 */
public class TestVending {

    public static void main(String[] args) {

        MenuManage obj = new MenuManage(1234);
        VendingMachine obj1 = new VendingMachine();
        MenuBuy obj2 = new MenuBuy();
        Scanner sc = new Scanner(System.in);

        int src;
        String menuList = "\n1. Manage VendingMachine\n"
                + "2. Buy Drink\n"
                + "3. Leave Machine";

        do {
            System.out.println(menuList);
            System.out.print("Enter Your choice: ");
            src = sc.nextInt();
            switch (src) {
                case 1:
                    System.out.print("Enter ManagerPassword : ");
                    src = sc.nextInt();
                    if (obj.ManagerPass(src) == true) {
                        obj.manageDrinkStock();
                    }
                    break;
                case 2:
                    obj2.menuSystem();
                    break;
            }
        } while (src != 3);
        
        System.out.println("\n-----------------------------");
        System.out.println("Thank you for that.");
        System.out.println("-----------------------------");
    }
}
