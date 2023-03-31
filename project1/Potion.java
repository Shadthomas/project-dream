package project1;

import java.util.Random;

public class Potion extends Supplies {
    
    private int healamount;
    
    public Potion() {
        super("","");
        DefinePotion();
    }
    
    private void DefinePotion(){
        Random rand = new Random();
        int type=rand.nextInt(100);
        String name,description;
        if(type<50){
            this.name="Lesser Potion";
            this.description="The weakest healing potion you can acquire.";
            this.healamount=30;
        }
        else if(type<80){
            this.name="Normal Potion";
            this.description="The standard healing potion, in terms of healing prowess.";
            this.healamount=50;
        }
        else{
            this.name="Greater Potion";
            this.description="This potion heals for the largest amount possible. It is very rare , CONGRATS!";
            this.healamount=70;
        }
    }    

    public int getHealamount() {
        return healamount;
    }
}
