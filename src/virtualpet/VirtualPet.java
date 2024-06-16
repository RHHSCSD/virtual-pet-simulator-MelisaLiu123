/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */    
package virtualpet;
import java.io.*;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Melisa Liu
 */
public class VirtualPet {
    public static int money = 100;
    public static int energy = 0;
    public static int food = 0;
    public static int health = 0;
    public static int maxEnergy = 20;
    public static int maxFood = 20;
    public static int maxHealth = 20;
    public static String petName;
    public static String username;
    public static String password;
    public static int[] maxStats = new int[3];
    public static int[] currentStats = new int[3]; 
    public static int[] actionHistory = new int[3]; // 0: play, 1: feed, 2: groom
    public static boolean petCreated = false;
    public static Scanner kb = new Scanner(System.in);
    public static Random random = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
          username = kb.nextLine();
          System.out.println("\nPassword: ");
          password = kb.nextLine();
          
          File userFile = new File(username+".txt");
          petCreated = true;
          if(userFile.exists()){
              loadUserInfo(userFile);
          }
          else{
              System.out.println("New user detected. Creating a new pet: ");
              petCreated = false;
              saveUserInfo(userFile);
          }
          
          
          
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
          
          
            
            while (true){
                if (petCreated){
                    System.out.println("\nMENU");
                    System.out.println("1. Play / Interact");
                    System.out.println("2. Instructions");
                    System.out.println("3. Exit");
                }else{
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
                case "1":
                case "start":
                case "play":
                case "interact":
                    
                    
                    //minigames
                    if (petCreated){
                            //create new menu:
                            System.out.println("\nPlay or interact with your pet");
                            System.out.println("1. Earn money");
                            System.out.println("2. Play with pet");
                            System.out.println("3. Feed your pet");
                            System.out.println("4. Groom your pet");
                            String newMenuInput = kb.nextLine().toLowerCase();
                            if (newMenuInput.equals("1")||newMenuInput.equals("earn money")){
                            
                           System.out.println("Which game would you like to play? Enter 1 for number guessing game. Enter 2 for matching game: ");
                        int gameChosen = kb.nextInt();
                        //number guessing game
                        if (gameChosen==1){
                            int secretNum = random.nextInt(100)+1;
                            int maxGuess = 5;
                            int guessLeft = maxGuess;
                            int score = 100;
                            System.out.println("Welcome to the number guessing game!");
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
                                    money += score;
                                    System.out.println("You currently have $"+money);
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
                            StringBuilder pairsBuilder=new StringBuilder();
                            String alphabet = "abcdedefghijklmnopqrstuvwxyz";
                            for (int i = 0; i<10; i++){
                                char letter = alphabet.charAt(random.nextInt(alphabet.length()));
                                pairsBuilder.append(letter).append(letter);
                            }
                            String pairs = pairsBuilder.toString();
                            String shufflePairs = shuffleString(pairs);
                            int totalPairs = pairs.length()/2;
                            int pairsFound = 0;
                            int guesses = 0;
                            int score = 100;
                            System.out.println("Welcome to the matching game!");
                            System.out.println("Find all the pairs of letters!");
                            
                            StringBuilder hiddenPairsBuilder = new StringBuilder();
                            for(int i=0; i<shufflePairs.length(); i++){
                                hiddenPairsBuilder.append('X');
                            }
                            String hiddenPair = hiddenPairsBuilder.toString();
                            
                            while (pairsFound<totalPairs){
                                System.out.println("Hidden sequence: "+hiddenPair);
                                System.out.println("Enter 2 positions 0-1"+(pairs.length()-2)+") to reveal, (for example: 0 1): ");
                                String input = kb.nextLine();
                                String[] positions = input.split(" ");
                                
                                if (positions.length !=2){
                                    System.out.println("Invalid input. Please enter only 2 positions");
                                    continue;
                                }
                                int position1, position2;
                                try{
                                    position1= Integer.parseInt(positions[0]);
                                    position2= Integer.parseInt(positions[1]);
                                }catch(NumberFormatException e){
                                System.out.println("Invalid input. Please enter a valid number.");
                                continue;
                            }
                                if (position1<0||position1>=pairs.length()||position2<0||position2>=pairs.length()){
                                    System.out.println("Number are out of range, please enter a different number within the range: ");
                                    continue;
                                }
                                char char1 = hiddenPair.charAt(position1);
                                char char2 = hiddenPair.charAt(position2);
                                
                                if (char1 != 'X'|| char2 !='X'){
                                    System.out.println("One or both positions have been revealed. Choose another pair of positions");
                                    continue;
                                }
                                char origChar1 = pairs.charAt(position1);
                                char origChar2 = pairs.charAt(position2);
                                hiddenPair = revealPairs(hiddenPair, position1, origChar1);
                                hiddenPair = revealPairs(hiddenPair, position2, origChar2);
                                
                                if(origChar1==origChar2){
                                    System.out.println("You found a pair! "+origChar1+origChar2);
                                    pairsFound++;
                                            score+=20;
                                }
                                else{
                                    System.out.println("Not a match, try again!");
                                    score-=5;
                                }
                                guesses++;
                            }
                            System.out.println("Congradulations, you have successfully found all the pairs!");
                            System.out.println("Total guesses: "+guesses);
                            System.out.println("Final score "+score);
                            money += score;
                                    System.out.println("You currently have $"+money);
                        }
                        else if (newMenuInput.equals("2")||newMenuInput.equals("play with pet")){
                            playWithPet();
                        } 
                        else if (newMenuInput.equals("3")||newMenuInput.equals("feed your pet")){
                            feedYourPet();
                        }
                        else if (newMenuInput.equals("4")||newMenuInput.equals("groom your pet")){
                            groomYourPet();
                        }
                            
                            
                       
                            break;
                        }
                        else{
                            System.out.println("Invalid input.");
                            break;
                        }
                 
                    }
                    else{
                        // start game
                        createNewPet(random);
                    break;   
                    }
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
    private static String shuffleString(String input){
        char[] characters=input.toCharArray();
        Random random = new Random();
        
        for (int i = characters.length-1;i>0;i--){
            int index=random.nextInt(i+1);
            char temp = characters[index];
            characters[index]=characters[i];
            characters[i]=temp;
        }
        return new String(characters);
    }
    private static String revealPairs(String hiddenPairs, int pos, char origChar){
        StringBuilder revealed = new StringBuilder(hiddenPairs);
        revealed.setCharAt(pos, origChar);
        return revealed.toString();
    }
    private static void playWithPet(){
        int cost=20;
        if (money>=cost){
            money-=cost;
            currentStats[energy] = Math.min(currentStats[energy] + 3, maxStats[energy]);
            System.out.println("You played with your pet! Energy increased. Energy: " + currentStats[energy] + "/" + maxStats[energy]);
            actionHistory[0]++;
        }
        else{
            System.out.println("Insufficient funds, not enough money to buy a toy to play with your pet.");
        }
    }
    private static void feedYourPet(){
        int cost=15;
        if (money>=cost){
            money-=cost;
             currentStats[food] = Math.min(currentStats[food] + 3, maxStats[food]);
            System.out.println("You fed your pet! Food increased. Food: " + currentStats[food] + "/" + maxStats[food]);
            actionHistory[0]++;
        }
        else{
            System.out.println("Insufficient funds, not enough money to buy food for your pet.");
        }
    }
    private static void groomYourPet(){
        int cost=30;
        if (money>=cost){
            money-=cost;
            currentStats[health] = Math.min(currentStats[health] + 3, maxStats[health]);
            System.out.println("You groomed your pet! Health increased. Health: " + currentStats[health] + "/" + maxStats[health]);
            actionHistory[0]++;
        }
        else{
            System.out.println("Insufficient funds, not enough money to groom your pet.");
        }
    }
    private static void createNewPet(Random random){
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
                 
                   int statPoints = 20;
                   health = random.nextInt(statPoints +1);
                   int remainingStatPoints = statPoints - health;
                   food = random.nextInt(remainingStatPoints+1);
                   energy = remainingStatPoints - food;
                 
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
    private static void loadUserInfo(File userFile){
            try (BufferedReader reader = new BufferedReader(new FileReader(userFile))) {
            username = reader.readLine();
            password = reader.readLine();
            petName = reader.readLine();
            maxStats[health] = Integer.parseInt(reader.readLine());
            currentStats[health] = Integer.parseInt(reader.readLine());
            maxStats[food] = Integer.parseInt(reader.readLine());
            currentStats[food] = Integer.parseInt(reader.readLine());
            maxStats[energy] = Integer.parseInt(reader.readLine());
            currentStats[energy] = Integer.parseInt(reader.readLine());
            money = Integer.parseInt(reader.readLine());
            System.out.println("Welcome back, " + username + "! Pet " + petName + " loaded successfully.");
        } catch (IOException e) {
            System.out.println("Error loading user information: " + e.getMessage());
        }
    }

    private static void saveUserInfo(File userFile) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(userFile))) {
            writer.println(username);
            writer.println(password);
            writer.println(petName);
            writer.println(maxStats[health]);
            writer.println(currentStats[health]);
            writer.println(maxStats[food]);
            writer.println(currentStats[food]);
            writer.println(maxStats[energy]);
            writer.println(currentStats[energy]);
            writer.println(money);
            System.out.println("User information saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving user information: " + e.getMessage());
        }
    }

    private static void displayActionSummary() {
        System.out.println("Today's Summary:");
        System.out.println("You played with your pet " + actionHistory[0] + " times.");
        System.out.println("You fed your pet " + actionHistory[1] + " times.");
        System.out.println("You groomed your pet " + actionHistory[2] + " times.");

        if (actionHistory[0] > 10) {
            System.out.println("Congratulations! You have earned the Playful Award!");
        }
        if (actionHistory[1] > 10) {
            System.out.println("Congratulations! You have earned the Avid Eater Award!");
        }
        if (actionHistory[2] > 10) {
            System.out.println("Congratulations! You have earned the Well-Groomed Award!");
        }
    }
}
    
    

    

    
    

    
      
            

         
   