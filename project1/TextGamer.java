package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class TextGamer {

    private static ArrayList<User> users = new ArrayList();
    
    public static User Login(){
        if(users.isEmpty())
        {
            System.out.println("There are no registered users yet.");
            return null;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String uname=input.nextLine();
        System.out.print("Enter your password: ");
        String pass=input.nextLine();
        for (int i = 0; i < users.size();i++) {
            if(users.get(i).getUsername().equals(uname) && users.get(i).getPassword().equals(pass))
            {
                return users.get(i);
            }
        }
        System.out.println("Wrong username/password combination.");
        return null;
    }
    
    public static void Register()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String uname=input.nextLine();
        System.out.print("Enter your password: ");
        String pass=input.nextLine();
        users.add(new User(uname,pass));
        System.out.println("You registered successfully.You may now log in");
    }
    
    public static void main(String[] args) {
        int key;
        users.add(new User("user","pass"));  
        User user = null;
        do{
            Scanner input = new Scanner(System.in);
            do{
                System.out.println("1.Log In");
                System.out.println("2.Register");
                System.out.println("3.Exit");
                System.out.print("Select your action: ");
                key=input.nextInt();
                if(key!=1 && key!=2 && key!=3)
                    System.out.println("Wrong choice, try again!");
            }while(key!=1 && key!=2 && key!=3);
            if(key==1)
            {
                user = Login();
                if(user instanceof User){
                    user.Menu();
                }
            }
            else if(key == 2)
            {
                Register();
            }
        }while(key!=3);
    }
    
    
}
