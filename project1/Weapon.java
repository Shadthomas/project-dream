package project1;

public class Weapon extends Supplies {
    private int dmg;
    
    public Weapon(String name, String description,int dmg) {
        super(name, description);
        this.dmg=dmg;
    }

    public int getDmg() {
        return dmg;
    } 
}
