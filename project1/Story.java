package project1;

import java.util.Scanner;

public class Story {
    private static boolean power = false;
    private static Player player = null;
    
    public static int Narrate(int score){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        player = new Player(input.nextLine());
        int choice;
        System.out.println("You had a wild ans crazy night with you friends and you cant even remember hope with someones phone number");
        System.out.println("and a bottle of interesting looking water.");
        do{
            System.out.println("1. Go to the bathroom");
            System.out.println("2. Go in the kitchen");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter1a(score);
        }
        else{
            score = Chapter1b(score);
            power = true;
        }
        System.out.println("All of a sudden, your roomate saw you twitching on the floor and said WTH!!!!!! relax boss it was just a dream!!!!!!");
        System.out.println("NOW WHAT?");
        do
        {
            System.out.println("1. Try to get some rest? ");
            System.out.println("2. Drink the weird looking water");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter2a(score);
        }
        else{
            score = Chapter2b(score);
        
        }
        System.out.println("You now figured out that the water is whats been giving you visions and nightmares. A side of you wants to throw the bottle"); 
        System.out.println("straight at the wall but also makes you think about facing your fears");
        do
        {
            System.out.println("1.Take another sip");
            System.out.println("2.Throw the bottle like a football");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter3a(score);
        }
        else{
            score = Chapter3b(score);
        
        }
        System.out.println("Now you convinced your friend that whether you get rid of it or not, you have to face whos playing");
        System.out.println("with your head");
         do
        {
            System.out.println("1.Think it through");
            System.out.println("2.Chugg the bottle straight up!!!!!!");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            if(power){   
                score = Chapter4a(score); 
                return score;
            }
            else{
                score = Chapter4aa(score); 
                return score;
            }
        }
        else {
            if(power){     
               
                score = Chapter4b(score);
                player.addWeapon(new Weapon("Sword of Takashi","A sword engulfed in hellish flames",25));
                player.Battle(new MuscularMan());
                if(player.getHealth()<=0) return score;
            }
            else{
                score = Chapter4bb(score);
            }
        }
        System.out.println("Awesome");
        do{
            System.out.println("1.Take multiple enemiems at a time");
            System.out.println("2.Face only one ");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter5a(score);
            if(player.getHealth()<=0) return score;
        }
        else{
            score = Chapter5b(score);
        }
        System.out.println("!!!!!!!!!!ITS NOW OR NEVER!!!!!!!!!!!!!!!!!!!!!!!!!!");
 
        do{
            System.out.println("1.Face The Final Boss");
            System.out.println("2.Give yourself up to him and surrender");
            choice = input.nextInt();
            if(choice < 1 || choice > 2) System.out.println("Invalid choice. Try again.");
        }while(choice < 1 || choice > 2);
        if(choice == 1){
            score = Chapter6a(score);
        }
        else{
            score = Chapter6b(score);
        }       
        System.out.println("ITS FINALLY DONE!!!!!! You stopped the enemy and you bestfriend thinks youre an absolute lunitic.");
        System.out.println("Thanks for playing now lets get DRUNK enjoy your weekend");
		return choice;
    }
    
    private static int Chapter1a(int score){
        System.out.println("You lean down to wash your face and for some reason right when you rise back up you have a ");
        System.out.println("vision facing a random creature named Ratchet from the woods");
        for(int i=0; i<2; i++){
            player.Battle(new Ratchet());
            if(player.getHealth()<=0) return score;
        }
        
        return score;
    }
    
    private static int Chapter1b(int score){
        System.out.println("You find nothing in the fridge so you decide to run to the store and grab a quick sandwich but you keep hearing voices in your head ");
        score+=3;
        return score;
    }


    private static int Chapter2a(int score){
        score+=6;
        return score;
    }
     
    private static int Chapter2b(int score){
    	System.out.println("Random Enemy: Drink it and i swear theres no turning BAAAAACCKKKKKKKK!!!!!!!!");  
        score+=7;
        return score;
    }
    
    private static int Chapter3a(int score){
    	System.out.println("Random Enemy: You have been warned HAHAHAHAHAHAHAHA!!!!!!!");
        score+=6;
        return score;
    }
     
    private static int Chapter3b(int score){
    	System.out.println("TOUCHDOWN You decided that this is for the weak and asked your friend to sue the water company");
        score+=3;
        return score;
    }
    
    private static int Chapter4a(int score){
        System.out.println("TOO LATE!! Man you took long now your enemy is living in you head RENT  FREE FOREVER!!!!! GOOD JOB!!!!!");
        System.out.println("--GAME OVER--");
        score+=5;
        
        return score;
    }
    
    private static int Chapter4aa(int score){
        System.out.println("Sorry to say this but you thought too long. Now you're the enemies pawn");
        System.out.println("--GAME OVER--");
        score+=3;
        return score;
        
    }
       private static int Chapter4b(int score){
        System.out.println("You drank the bottle and now your in it all the way!. A muscular man is attacked by your friend and he drops his sword. You pick it up.");
        
        score+=5;
        
        return score;
    }
    
    private static int Chapter4bb(int score){
        System.out.println("Looks like you wanted to go all the way");
        score+=3;
        return score;
    }
 private static int Chapter5a(int score){
             
        System.out.println("You decided to take down the enemies right hand man and this is not going to easy LETS GO!!!! ");
        for(int i=0; i<3; i++){
            player.Battle(new BloodHound());
            if(player.getHealth()<=0) return score;
        }
        score+=5;
        
        return score;
    }
    
    private static int Chapter5b(int score){
        System.out.println("Dont give up its time to end this once and for all");
        for(int i=0; i<5; i++){
            player.Battle(new MuscularMan());
            if(player.getHealth()<=0) return score;
        }
        score+=6;
        return score;
    }

    private static int Chapter6a(int score){
        System.out.print("You actually think you can stop me now? You FOOL!!!!!!!!");     
    	player.Battle(new Boss());
    	if(player.getHealth()<=0) return score;
    	player.Battle(new BossJr());
    	if(player.getHealth()<=0) return score;
    	System.out.println("");
    	score+=100;
    	return score;
        
    }
    
    private static int Chapter6b(int score){
    	System.out.println("You are crushed  to death swifly ,your feeble attempt at overtaking the king ending in vain");
        System.out.println("–-GAME OVER--");
        score+=0;
        return score;
    }



}
