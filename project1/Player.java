package project1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Player {
    private String pname; 
    private int health;
    private ArrayList<Potion> Inventory = new ArrayList();
    private Weapon active= new Weapon("Bare Hands","Your two fists.",10); 
    

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public Player(String pname) {
        this.pname = pname;
        health=100;
    }
    
    public void addPotion(Potion pot){
        Inventory.add(pot);   
    }
    
    public void addWeapon(Weapon w){
        System.out.println("You dropped your " + active.name + " and you pick up " + w.name );
        active=w;
    }
    
    public void usePotion(){
        if(!Inventory.isEmpty()){
            Scanner input = new Scanner(System.in);
            int i=1;

            for(Potion potion: Inventory){
                System.out.println(i + ". " + potion.getName());
                i++;
            }
            int choice;
            Potion pot = null;
            do{  
                System.out.print("Select a potion by its number: ");
                choice = input.nextInt();
                if(choice < 1 || choice > i) System.out.println("Invalid choice. Try again.");
            }while(choice < 1 || choice > i);
            i=1;
            for(Potion potion: Inventory){
                if(i==choice){
                    pot=potion;
                    health += pot.getHealamount();
                    if(health>100) health=100;
                    Inventory.remove(pot);
                    break;
                }
                i++;
            }
            System.out.println("Your Health is now :" + health + " HP");
        }
        else{
            System.out.println("You have no potions left.");
        }
    }
    
     public void Battle (Enemies e){
        Scanner input = new Scanner(System.in);
        int choice;
        boolean run= false;
        System.out.println("You are battling a " + e.getName()+"... Begin!");
        while(e.getHealth()>0 && health>0 && !run){
            System.out.println("Your Health: " + health + " HP");
            System.out.println(e.getName() + "'s Health: " + e.getHealth() + " HP");
            
            do{
                System.out.println("1.Attack");
                System.out.println("2.Drink Potion");
                System.out.println("3.Run away");
                System.out.println("Make a choice:  ");
                choice = input.nextInt();
                if(choice < 1 || choice > 3) System.out.println("Invalid choice. Try again.");
            }while(choice < 1 || choice > 3);
                if(choice == 1){
                    System.out.println("You dealt " + active.getDmg() + " damage with your " + active.name + ".");
                    e.setHealth(e.getHealth() - active.getDmg());
                    System.out.println("You were dealt " + e.getDamage() + " damage in retaliation.");
                    setHealth(health - e.getDamage());
                    if(health<=0){
                        System.out.println("You were killed. GAME OVER");
                      
                    }
                }
                else if(choice == 2){
                    usePotion();
                }
                else{
                    Random rand = new Random();
                    int outcome=rand.nextInt(100);
                    if(outcome > 80){
                        System.out.println("You ran away successfully");
                        run=true;
                    }
                    else {
                        System.out.println("The enemy catches you and hits you for 5 damage");
                        setHealth(health - 5);
                        if(health<=0){
                            System.out.println("You were killed. GAME OVER");

                        }
                    }   
                }
        }
        if(run==false){
            System.out.println("You defeated the " + e.getName());
            Random rand = new Random();
            int outcome=rand.nextInt(100);
            if(outcome > 50){
                addPotion(new Potion());
                System.out.println("You found a new " + Inventory.get(Inventory.size()-1).name + " from " + e.getName() + "'s corpse");
            }
        }
    } 
}
