/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */    
package virtualpet;
import java.util.Scanner;
import java.util.Random;

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
        Random random = new Random();
        // TODO code application logic here
          System.out.println(" (\\__/)");
          System.out.println("(=0.0=)");
          System.out.println(" (\")(\")__/");
          System.out.println("____________");
          System.out.println("Mel's Pet Adoption Stimulator");
          
          //login system
          final int maxAttempts = 3;
          boolean attemptLogin = false;
          System.out.println("------------------------------------------------------");
          for (int attempt = 1; attempt <= maxAttempts; attempt++){
          System.out.println("\nUsername: ");
          String username = kb.nextLine();
          System.out.println("\nPassword: ");
          String password = kb.nextLine();
          System.out.println("\n------------------------------------------------------");
          if (username.equals("snoopy") && password.equals("toto")){
              attemptLogin=true;
              break;
          }
          else{
              System.out.println("Incorrect username or password. Attempt "+attempt+" of " + maxAttempts);
          }
          }
          if (!attemptLogin){
              System.out.println("Too many failed attempts. Exiting the program.");
              System.exit(0);
          }
          
          
          //if correct
            boolean petCreated = false;
            while (true){
                if (petCreated=true){
                    System.out.println("\nMENU");
                    System.out.println("1. Play / Interact");
                    System.out.println("2. Instructions");
                    System.out.println("3. Exit");
                }else if (petCreated = false){
                    System.out.println("\nMENU");
                    System.out.println("1. Start");
                    System.out.println("2. Instructions");
                    System.out.println("3. Exit");
                
            }
            
            System.out.println("\n------------------------------------------------------");
            System.out.println("\nPlease select an option from the menu");
            String menuInput = kb.nextLine().toLowerCase();
            System.out.println("\n------------------------------------------------------");
            
            
            switch (menuInput){
           //game
              //print animals and asks user for choice of adoption
                case "1":
                case "start":
                case "play":
                case "interact":
                    if (petCreated = false){
                 System.out.println("\nPlease select the pet you'd like to adopt: ");
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
                 System.out.println("\n------------------------------------------------------");
                 System.out.println("\n    OPTION 1      "+"                       OPTION 2      ");
                 System.out.println("    BUNNY    "+"                                DEER");
                 System.out.println("\n------------------------------------------------------");
              
                 String animalChoice = kb.nextLine();
                 
                 String petName = "";
                  StringBuilder name = new StringBuilder();
                 System.out.println("Choose a name for your pet! Enter 1 if you'd like to name your pet. Enter 2 if you'd like a randomly generated pet name");
                 int petNameChoice = kb.nextInt();
                 if (petNameChoice == 1){
                     System.out.println("Choose your pet name!");
                     petName = kb.nextLine();
                 }
                 else if(petNameChoice == 2){ 
                 char[] vowels = {'a', 'e', 'i', 'o', 'u'};
                 char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
                 
                 
                     int nameLength = random.nextInt(5)+4;
                     boolean useVowel = random.nextBoolean();
                     for(int i = 0; i<nameLength; i++){
                         if (useVowel){
                             char vowel = vowels[random.nextInt(vowels.length)];
                             name.append(vowel);
                             if(i>0 && random.nextBoolean()){
                                 name.append(vowel);
                                 i++;
                                 }
                         }
                             else{
                                 char consonant = consonants[random.nextInt(consonants.length)];
                                 name.append(consonant);
                                 if (i>0&&random.nextBoolean()){
                                     name.append(consonant);
                                     i++;
                                 }
                             }
                         useVowel = !useVowel;
                     }
                   System.out.println(name.toString());
                     
                 }
                 
                 final int statPoints = 20;
                 int health = random.nextInt(statPoints +1);
                 int remainingStatPoints = statPoints - health;
                 int food = random.nextInt(remainingStatPoints+1);
                 int energy = remainingStatPoints - food;
                 
                    if (animalChoice.equals ("1")|| animalChoice.equalsIgnoreCase("bunny")){
                    System.out.println("------------------------------------------------------");
                    System.out.println("You have chosen to adopt a bunny! Congradulations!");
                    System.out.println("         ,");
                    System.out.println("             /|      __");
                    System.out.println("            / |   ,-~ /");
                    System.out.println("           Y :|  //  /");
                    System.out.println("           | jj /( .^");
                    System.out.println("           >-\"~\"-v\"");
                    System.out.println("          /       Y");
                    System.out.println("         jo  o    |");
                    System.out.println("        ( ~t~     j");
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
                    System.out.println("------------------------------------------------------");

                    System.out.println("Your pet, named "+ petName+ name + " , has been born!");
                    System.out.println("Health: "+ health);
                    System.out.println("Food: "+ food);
                    System.out.println("Energy: "+ energy);
                    petCreated = true;
                    System.out.println("------------------------------------------------------");
                    }
                    else if (animalChoice.equals ("2")|| animalChoice.equalsIgnoreCase("deer")){
                    System.out.println("------------------------------------------------------");
                    System.out.println("You have chosen to adopt a deer! Congradulations!");
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
                    System.out.println("Your pet, named "+ petName+ name +" , has been born!");
                    System.out.println("Health: "+ health);
                    System.out.println("Food: "+ food);
                    System.out.println("Energy: "+ energy);
                    petCreated = true;
                    System.out.println("------------------------------------------------------");
                    }
                    }
                    else if (petCreated = true){
                        // mini games
                        System.out.println("Which game would you like to play? Enter 1 for number guessing game. Enter 2 for matching game: ");
                        int gameChosen = kb.nextInt();
                        //number guessing game
                        if (gameChosen==1){
                            int secretNum = random.nextInt(100)+1;
                            int maxGuess = 5;
                            int guessLeft = maxGuess;
                            int score = 100;
                            System.out.println("Welcome tot he number guessing game!");
                            System.out.println("Please guess a number from 1-100");
                            
                            while (guessLeft >0){
                                System.out.println("Enter your guess (1-100): ");
                                int guess = kb.nextInt();
                                kb.nextLine();
                                
                                if (guess<1||guess>100){
                                    System.out.println("Please enter a number between 1 and 100.");
                                    continue;
                                }
                                
                                if (guess == secretNum){
                                    System.out.println("Wow, congradulations! You guessed the correct number!");
                                    System.out.println("Your final score is: "+ score);
                                    break;
                                }
                                else if (guess < secretNum){
                                    System.out.println("Too low!");
                                }
                                else if (guess > secretNum){
                                    System.out.println("Too high!");
                                }
                                guessLeft--;
                                score-=20;
                                System.out.println("Guesses left: "+guessLeft);
                            }
                            if (guessLeft == 0){
                                System.out.println("Sorry, you've run out of guesses.");
                                System.out.println("The correct number was: " + secretNum);
                            }
                            
                            break;
                        }
                        else if(gameChosen ==2){
                       //matching game
                            StringBuilder pairBuilder=new StringBuilder();
                            String alphabet = "abcdedefghijklmnopqrstuvwxyz";
                            for (int i = 0; i<10; i++){
                                char letter = alphabet.charAt(random.nextInt(alphabet.length()));
                                pairBuilder.append(letter).append(letter);
                            }
                            String pairs = pairBuilder.toString();
                            String shufflePairs = shuffleString(pairs);
                            int totalPairs = pairs.length()/2;
                            int pairsFound = 0;
                            int guesses = 0;
                            int score = 100;
                            System.out.println("Welcome to the matching game!");
                            System.out.println("Find all the pairs of letters");
                       
                       break;
                        }
                        else{
                            System.out.println("Invalid input.");
                            break;
                        }
                    }
                    
                    else{
                    System.out.println("Invalid input.");
                    }
                   
                    break;   
              
             
                    //instructions
                case "2":
                case "instructions":
                System.out.println("Choose a pet, it takes money to keep your pet healthy, full, and angaged. To do this, you'll need to earn that money so you can purchase toys and food.");
                    break;   
            
                    //exit
                case "3":
                case "exit":
                    System.exit(0);
                    break;   
            
                    //invalid input
                default:
                  System.out.println("Invalid input");
              
                    break;   
            }
    }
}
}
    
      
            

         
   