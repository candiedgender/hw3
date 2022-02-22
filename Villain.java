/**
This class creates a villain object and gives it a default name/abilities.
It also determines all of its abilities such as attack and evilLaugh.
@author cproenza3
@version 1
*/
public class Villain {
    private String name;
    private int strength;
    private int defense;
    private int health;

    /**
    This constructor creates default settings for the villain object if no
    parameters are pased into the battle class.
    */
    public Villain() {
        this("Dr. Evil", 15, 5, 50);
    }

    /**
    This constructor creates default settings for the villain object if all
    four parameters are pased into the battle class.
    @param name is the name of the villain
    @param strength is the integer strength of the villain
    @param defense is the integer defense of the villain
    @param health is the integer health of the villain
    */
    public Villain(String name, int strength, int defense, int health) {
        this.name = name;
        this.strength = strength;
        setStrength(strength);
        this.defense = defense;
        setDefense(defense);
        this.health = health;
        setHealth(health);
    }

    /**
    Setter for the name
    @param name is the name of the villain
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    Getter for the name
    @return name returns the name of the villain
    */
    public String getName() {
        return name;
    }

    /**
    Setter for the strength. This method also ensures that the strength
    is never less than 0; if it is it sets it to 0.
    @param strength is the integer strength of the villain
    */
    public void setStrength(int strength) {
        this.strength = strength;
        if (strength <= 0) {
            this.strength = 0;
        }
    }

    /**
    Getter for the strength
    @return this.strength returns the strength of the strength
    */
    public int getStrength() {
        return strength;
    }

    /**
    Setter for the defense. This method also ensures that the defense is
    never less than 0; if it is it sets it to 0.
    @param defense is the integer defense of the villain.
    */
    public void setDefense(int defense) {
        this.defense = defense;
        if (defense <= 0) {
            this.defense = 0;
        }
    }

    /**
    Getter for the defense
    @return this.defense returns the defense of the villain
    */
    public int getDefense() {
        return defense;
    }

    /**
    Setter for the health. This method also ensures that the health is
    never less than 0; if it is it sets it to 0
    @param health is the integer health of the villain
    */
    public void setHealth(int health) {
        this.health = health;
        if (health <= 0) {
            this.health = 0;
        }
    }

    /**
    Getter for the health
    @return this.health returns the health of the villain
    */
    public int getHealth() {
        return health;
    }

    /**
    This method returns the defeat statement if the hero is defeated
    @return returns a String stating that the hero lost
    */
    public String defeat() {
        return "The hero has been defeated!";
    }

    /**
    This method allows the villain to attack the hero. It prints
    the attack statement and decreases the hero's health by the villain's
    strength minus the hero's defense. If the villain's strength is less than
    the hero's defense, the the hero's helath doesn't change. If the
    hero's helath hits 0, it calls defeat
    @param h is the hero's object
    */
    public void attack(Hero h) {
        System.out.println("Perish, hero!");
        if (strength > h.getDefense()) {
            h.setHealth(h.getHealth() - strength + h.getDefense());
        }
        if (h.getHealth() == 0) {
            System.out.println(defeat());
        } else if (h.getHealth() < 0) {
            h.setHealth(0);
            System.out.println(defeat());
        }
    }

    /**
    This method prints the evilLaugh statement and then increases the
    villain's strength by 5
    */
    public void evilLaugh() {
        System.out.println("MWAHAHA!");
        strength += 5;
    }

    /**
    This method returns the villain statement which states all of the
    villain's attributes
    @return returns the sidekick statment
    */
    public String toString() {
        return String.format("A villain named " + getName() + " with "
            + getStrength() + " strength, " + getDefense() + " defense, and "
            + getHealth() + " health.");
    }
}