/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textrpg;
import java.util.Scanner;
/**
 *
 * @author gsiqueira
 */
public class Gamelogic {
    static Scanner scanner = new Scanner(System.in);

public static int readInt(String prompt, int userChoice){
    int input;
   
    
    do{
       System.out.println(prompt);
       try{
           input = Integer .parseInt(scanner.next());
    }catch(Exception e){
        input = -1;
        System.out.println("Por favor preencha o campo!");
    }
    
    }while(input < 1 || input  > userChoice);
    return input;
    }
  
  public static void Clearconsole(){
      for(int i = 0; i < 100; i++)
          System.out.println();
  }

  public static void PrintSeparetor(int n){
      for(int i = 0; i < n; i++)
          System.out.print("-");
      System.out.println();
  }
  
  public static void PrintHeading(String title){
      PrintSeparetor(30);
      System.out.println(title);
      PrintSeparetor(30);
  }
  
  public static void anythingToContinue(){
      System.out.println("\nEnter anything to continue...");
       scanner.next();
      
  }
  
}


