package Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * The main function
 */

public class Driver {
    
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.out.println("CS586 Spring 2017 Project - by Lin Zhuo");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        
        boolean main_flag = true;
        
        while(main_flag)
        {
            System.out.print("\nSelect a Gas Pump to start: ");
            System.out.println("1) Gas Pump 1; 2) Gas Pump 2; 3) Exit");
            System.out.println("\n\n");
            
            int choice = Integer.parseInt(br.readLine());
            
            switch(choice) {
            
            case 1: {
                System.out.println("GasPump 1 selected.");
                GasPump1 gp1 = new GasPump1();
                gp1.runPump();
                break;
            }
            
            case 2: {
                System.out.println("GasPump 2 selected.");
                GasPump2 gp2 = new GasPump2();
                gp2.runPump();
                break;
            }
            
            case 3: {
                main_flag = false;
                break;
            }
            
            default: {
                System.out.println("Wrong choice.");
                break;
            }
            
            }
            
        }
        
        br.close();
        sc.close();
        System.out.println("Project Exit.");
        
    }

}
