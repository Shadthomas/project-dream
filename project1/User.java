package project1;

import java.util.Scanner;

public class User {
    
    private String username;
    private String password;
    private int highscores[];

    public User(String username,String password) {
        this.username = username;
        this.password = password;
        this.highscores = new int[3];
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    private void Highscores(){
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + highscores[i]);
        }
    }
    
    public void Menu()
    {
         do{
            Scanner input = new Scanner(System.in);
            int key;
            do{
                System.out.println("1.New Game");
                System.out.println("2.View Highscores");
                System.out.println("3.Log out");
                System.out.print("Select your action: ");
                key=input.nextInt();
                if(key!=1 && key!=2 && key!=3)
                    System.out.println("Wrong choice, try again!");
            }while(key!=1 && key!=2 && key!=3);
            
            if(key==1)
            {
                SetHighScore(NewGame());
            }
            else if(key==2)
            {
               Highscores(); 
            }
            else
                return;    
        }while(true);
    }
    
    private int NewGame(){
        int score=0;
        score = Story.Narrate(score);
        return score;  
    }
    
    private void SetHighScore(int score)
    {
        if(score>highscores[0])
        {
            highscores[2] = highscores[1];
            highscores[1] = highscores[0];
            highscores[0]=score;
            System.out.println("New Highscore");
        }
        else if(score>highscores[1])
        {
            highscores[2] = highscores[1];
            highscores[1]=score;
            System.out.println("New Highscore");     
        }
        else if(score>highscores[2])
        {
            highscores[2]=score;
            System.out.println("New Highscore");
        }
                
    }
    
}
