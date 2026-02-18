
// Abstract Prototype
abstract class GameCharacter implements Cloneable {
    protected String type;
    protected String weapon;
    protected int health;
    protected int attackPower;

    public GameCharacter(String type, String weapon, int health, int attackPower) {
        this.type = type;
        this.weapon = weapon;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    // Abstract method to clone
    public abstract GameCharacter clone();

    // Getters and Setters for modification
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    
    public void setHealth(int health) {
         this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
   }

    public void displayInfo() {
        System.out.println("Character [Type=" + type + ", Weapon=" + weapon + ", Health=" + health + ", Attack=" + attackPower + "]");
    }
}

// Concrete Prototypes
class Warrior extends GameCharacter {
    public Warrior() {
        super("Warrior", "Sword", 150, 20);
    }
    
    // Constructor for cloning/customization
    private Warrior(Warrior target) {
        super(target.type, target.weapon, target.health, target.attackPower);
    }

    @Override
    public GameCharacter clone() {
        return new Warrior(this); 
    }
}

class Archer extends GameCharacter {
     public Archer() {
        super("Archer", "Bow", 100, 25);
    }

    private Archer(Archer target) {
        super(target.type, target.weapon, target.health, target.attackPower);
    }

    @Override
    public GameCharacter clone() {
        return new Archer(this);
    }
}

class Mage extends GameCharacter {
     public Mage() {
        super("Mage", "Staff", 80, 30);
    }

    private Mage(Mage target) {
        super(target.type, target.weapon, target.health, target.attackPower);
    }

    @Override
    public GameCharacter clone() {
        return new Mage(this);
    }
}

// Client
public class GameClientPrototype {
    public static void main(String[] args) {
        System.out.println("--- Prototype Pattern: Game Character Creation ---");

        // Create base characters (prototypes)
        GameCharacter warriorPrototype = new Warrior();
        GameCharacter archerPrototype = new Archer();
        GameCharacter magePrototype = new Mage();

        // 1. Clone Warrior and customize
        GameCharacter warrior1 = warriorPrototype.clone();
        warrior1.setWeapon("Great Axe");
        warrior1.setAttackPower(25); // Customized

        // 2. Clone another Warrior and customize differently
        GameCharacter warrior2 = warriorPrototype.clone();
        warrior2.setWeapon("Shield & Sword");
        warrior2.setHealth(160);

        // 3. Clone Mage
        GameCharacter mage1 = magePrototype.clone();
        mage1.setWeapon("Dark Staff");

        System.out.println("\n--- Created Characters ---");
        System.out.print("Original Warrior: "); warriorPrototype.displayInfo();
        System.out.print("Custom Warrior 1: "); warrior1.displayInfo();
        System.out.print("Custom Warrior 2: "); warrior2.displayInfo();
        
        System.out.println();
        System.out.print("Original Mage:    "); magePrototype.displayInfo();
        System.out.print("Custom Mage 1:    "); mage1.displayInfo();
    }
}
