/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textrpg;

/**
 *
 * @author gsiqueira
 */
public class Textrpg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gamelogic.PrintHeading("Olá!");
        Gamelogic.anythingToContinue();
        Gamelogic.Clearconsole();
        int input = Gamelogic.readInt("Enter 1,2 or 3: ",3);
        System.out.println("You chose nunber " + input);
    }
    
}
