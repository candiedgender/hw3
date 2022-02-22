/**
This class creates a hero object and gives it a default name/abilities.
It also determines all of its abilities such as attack and train.
@author cproenza3
@version 1
*/
public class Hero {
    private String name;
    private String power;
    private Sidekick sidekick;
    private int strength;
    private int defense;
    private int health;

    /**
    This constructor creates default settings for the hero object if no
    parameters are pased into the battle class.
    */
    public Hero() {
        this("Mighty Fist", "Super-strength", new Sidekick(), 10, 10, 50);
    }

    /**
    This constructor creates default settings for the hero object if only two
    parameters are pased into the battle class.
    @param name is the name of the hero
    @param power is the power of the hero
    */
    public Hero(String name, String power) {
        this(name, power, new Sidekick(), 10, 10, 50);
    }

    /**
    This constructor creates the hero object if all six parameters are
    given in the battle class.
    @param name is the name of the hero
    @param power is the power of the hero
    @param sidekick is the sidekick that helps the hero
    @param strength is the integer strength of the hero
    @param defense is the integer defense of the hero
    @param health is the integer health of the hero
    */
    public Hero(String name, String power, Sidekick sidekick, int strength,
                int defense, int health) {
        this.name = name;
        this.power = power;
        this.sidekick = sidekick;
        this.strength = strength;
        setStrength(strength);
        this.defense = defense;
        setDefense(defense);
        this.health = health;
        setHealth(health);
    }

    /**
    Setter for the name
    @param name is the name of the hero
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    Getter for the name
    @return this.name returns the name of the hero
    */
    public String getName() {
        return this.name;
    }

    /**
    Setter for the power
    @param power is the power the hero wields
    */
    public void setPower(String power) {
        this.power = power;
    }

    /**
    Getter for the power
    @return this.power returns the power the hero wields
    */
    public String getPower() {
        return this.power;
    }

    /**
    Setter for the sidekick
    @param sidekick is an object that contains all the details about
    the sidekick
    */
    public void setSidekick(Sidekick sidekick) {
        this.sidekick = sidekick;
    }

    /**
    Getter for the sidekick
    @return this.sidekick returns the sidekick object
    */
    public Sidekick getSidekick() {
        return this.sidekick;
    }

    /**
    Setter for the strength. This method also ensures that the strength
    is never less than 0; if it is it sets it to 0.
    @param strength is the integer strength of the hero
    */
    public void setStrength(int strength) {
        this.strength = strength;
        if (strength <= 0) {
            this.strength = 0;
        }
    }

    /**
    Getter for the strength
    @return this.strength returns the strength of the hero
    */
    public int getStrength() {
        return this.strength;
    }

    /**
    Setter for the defense. This method also ensures that the defense is
    never less than 0; if it is it sets it to 0.
    @param defense is the integer defense of the hero.
    */
    public void setDefense(int defense) {
        this.defense = defense;
        if (defense <= 0) {
            this.defense = 0;
        }
    }

    /**
    Getter for the defense
    @return this.defense returns the defense of the hero
    */
    public int getDefense() {
        return this.defense;
    }

    /**
    Setter for the health. This method also ensures that the health is
    never less than 0; if it is it sets it to 0
    @param health is the integer health of the hero.
    */
    public void setHealth(int health) {
        this.health = health;
        if (health <= 0) {
            this.health = 0;
        }
    }

    /**
    Getter for the health
    @return this.health returns the health of the hero
    */
    public int getHealth() {
        return this.health;
    }

    /**
    This method returns the defeat statement if the villain is defeated
    @return returns a String stating that the villain lost
    */
    public String defeat() {
        return "The villain has been defeated!";
    }

    /**
    This method allows the hero to attack the villain. It prints
    the attack statement and decreases the villain's health by the hero's
    strength minus the villain's defense. If the hero's strength is less than
    the villain's defense, the the villain's helath doesn't change. If the
    villain's helath hits 0, it calls defeat
    @param v is the villain's object
    */
    public void attack(Villain v) {
        System.out.println("Take that villain!");
        if (strength >= v.getDefense()) {
            v.setHealth(v.getHealth() - strength + v.getDefense());
        }
        if (v.getHealth() == 0) {
            System.out.println(defeat());
        } else if (v.getHealth() < 0) {
            v.setHealth(0);
            System.out.println(defeat());
        }
    }

    /**
    This method prints the train statement and increases the hero's strength
    by 5 and the defense by 1.
    */
    public void train() {
        System.out.println("I am ready for battle!");
        strength += 5;
        defense += 1;
    }

    /**
    This method returns the hero statement which states all of the
    hero's attributes as well as calling the sidekick from the Sidekick
    class.
    @return returns the hero statment
    */
    public String toString() {
        return String.format("A hero named " + getName() + " with " + getPower()
         + " powers and " + getStrength() + " strength, " + getDefense()
         + " defense, and " + getHealth() + " health with " + sidekick);
    }
}