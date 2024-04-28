/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */    
package virtualpet;
import java.util.Scanner;
/**
 *
 * @author Melisa Liu
 */
public class VirtualPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        // TODO code application logic here
          System.out.println(" (\\__/)");
          System.out.println("(=0.0=)");
          System.out.println(" (\")(\")__/");
          System.out.println("____________");
          System.out.println("Mel's Pet Adoption Stimulator");
          
          //login system
          System.out.println("------------------------------------------------------");
          System.out.println("\nUsername: ");
          String username = kb.next();
          System.out.println("\nPassword: ");
          String password = kb.next();
          System.out.println("------------------------------------------------------\n");
          if (username.equals("snoopy") && password.equals("toto")){
          
          //if correct
            System.out.println("\nMENU");
            System.out.println("1. Start");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            System.out.println("Please select an option from the menu");
              String menuInput = kb.nextLine().toLowerCase();
            switch (menuInput){
           //game
              //print animals and asks user for choice of adoption
                case "1":
                case "start":
                 System.out.println("Please select the pet you'd like to adopt: ");
                 System.out.println("         ,");
                 System.out.println("        /|      __");
                 System.out.println("       / |   ,-~ /");
                 System.out.println("      Y :|  //  /");
                 System.out.println("      | jj /( .^"+"              "+"                  .\\     _,");
                 System.out.println("      >-\"~\"-v\""+"             "+"                     |`\\__/ /");
                 System.out.println("     /       Y"+"                "+"                  \\  - -(");
                 System.out.println("    jo  o    |"+"                "+"                   |   _T|");
                 System.out.println("   ( ~T~     j"+"                "+"                   /   |");
                 System.out.println("    >._-' _./"+"                 "+"      _.---======='    |");
                 System.out.println("   /   \"~\"  |"+"               "+"       //               {}");
                 System.out.println("  Y     _,  |"+"                 "+"    `|      ,   ,     {}");
                 System.out.println(" /| ;-\"~ _  l"+"                "+"      \\      /___;    ,'");
                 System.out.println("/ l/ ,-\"~    \\"+"              "+"       ) ,-;`    `\\  //");
                 System.out.println("\\//\\/      .- \\"+"            "+"       | / (        ;||");
                 System.out.println(" Y        /    Y"+"              "+"     ||`\\\\        |||");
                 System.out.println(" l       I     !"+"              "+"     ||  \\\\       |||");
                 System.out.println(" ]\\      _\\    /\"\\"+"        "+"         )\\   )\\      )||");
                 System.out.println("(\" ~----( ~   Y.  )"+"          "+"        `\"   `\"    `\"\"");
                 System.out.println("____________________________________________________________");
                 System.out.println("\n    OPTION 1      "+"                       OPTION 2      ");
                 System.out.println("    BUNNY    "+"                                DEER");
                 System.out.println("____________________________________________________________");
              
                 String animalChoice = kb.nextLine();
                    if (animalChoice.equals ("1")|| animalChoice.equalsIgnoreCase("bunny")){
                    System.out.println("You have chosen to adopt a bunny! Congradulations!");
                    System.out.println("         ,");
                    System.out.println("             /|      __");
                    System.out.println("            / |   ,-~ /");
                    System.out.println("           Y :|  //  /");
                    System.out.println("           | jj /( .^");
                    System.out.println("           >-\"~\"-v\"");
                    System.out.println("          /       Y");
                    System.out.println("         jo  o    |");
                    System.out.println("        ( ~T~     j");
                    System.out.println("         >._-' _./");
                    System.out.println("        /   \"~\"  |");
                    System.out.println("       Y     _,  |");
                    System.out.println("      /| ;-\"~ _  l");
                    System.out.println("     / l/ ,-\"~    \\");
                    System.out.println("     \\//\\/      .- \\");
                    System.out.println("      Y        /    Y");
                    System.out.println("      l       I     !");
                    System.out.println("      ]\\      _\\    /\"\\");
                    System.out.println("     (\" ~----( ~   Y.  )");
                     }
                    else if (animalChoice.equals ("2")|| animalChoice.equalsIgnoreCase("deer")){
                    System.out.println("You have chosen to adopt a deer! Congradulations!");
                    System.out.println("         ,");
                    System.out.println("                 .\\     _,");
                    System.out.println("                  |`\\__/ /");
                    System.out.println("                  \\  . .(");
                    System.out.println("                   |   _T|");
                    System.out.println("                   /   |");
                    System.out.println("      _.---======='    |");
                    System.out.println("     //                {}");
                    System.out.println("    `|       ,   ,     {}");
                    System.out.println("      \\    /___;      ,'");
                    System.out.println("       ) ,-;`    `\\  //");
                    System.out.println("      | / (        ;||");
                    System.out.println("      ||`\\\\        |||");
                    System.out.println("      ||  \\\\       |||");
                    System.out.println("      )\\   )\\      )||");
                    System.out.println("      `\"   `\"      `\"\"");
                    }
                    else{
                    System.out.println("Invalid input.");
                    }
                
                    break;   
              
             
                    //instructions
                case "2":
                case "instructions":
               
                    break;   
            
                    //exit
                case "3":
                case "exit":
  
                    break;   
            
                    //invalid input
                default:
                  System.out.println("Invalid input");
              
                    break;   
            }
          }
    }
}
         //else exit program
   