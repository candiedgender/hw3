/**
This class creates a sidekick object and gives it a default name/abilities.
It also determines all of its abilities such as support and cheer.
@author cproenza3
@version 1
*/
public class Sidekick {
    private String name;
    private int support;

    /**
    This constructor creates default settings for the sidekick object if no
    parameters are pased into the battle class.
    */
    public Sidekick() {
        this("Underdog", 20);
    }

    /**
    This constructor creates default settings for the sidekick object if both
    parameters are pased into the battle class.
    @param name is the sidekick's name
    @param support is the integer support the sidekick can give to the hero
    */
    public Sidekick(String name, int support) {
        this.name = name;
        this.support = support;
        setSupport(support);
    }

    /**
    Setter for the name
    @param name is the name of the sidekick
    */
    public void setName(String name) {
        this.name = name;
    }

    /**
    Getter for the name
    @return this.name returns the name of the sidekick
    */
    public String getName() {
        return name;
    }

    /**
    Setter for the support. This method also ensures that the support
    is never less than 0; if it is it sets it to 0.
    @param support is the integer value of the support.
    */
    public void setSupport(int support) {
        this.support = support;
        if (support <= 0) {
            this.support = 0;
        }
    }

    /**
    Getter for the support
    @return this.support returns the integer value of the support
    */
    public int getSupport() {
        return support;
    }

    /**
    This method prints the heal statement and then increases the hero's
    health by the amount of support that the sidekick has
    @param h calls the hero's object
    */
    public void heal(Hero h) {
        System.out.println("I'm here for you.");
        h.setHealth(h.getHealth() + getSupport());
    }
    /**
    This method prints the cheer statement which calls the hero's name while
    increasing the sidekick's support by 10
    @param h calls the hero's object
    */
    public void cheer(Hero h) {
        System.out.println("We believe in you " + h.getName() + ".");
        support += 10;
    }

    /**
    This method prints the cheer statement which calls the villain's name while
    decreasing the villain's defense by 1.
    @param v calls the villain's object
    */
    public void cheer(Villain v) {
        System.out.println("You don't stand a chance " + v.getName());
        v.setDefense(v.getDefense() - 1);
    }

    /**
    This method returns the sidekick statement which states all of the
    sidekick's attributes
    @return returns the sidekick statment
    */
    public String toString() {
        return String.format("A sidekick named " + getName()
            + " that can heal " + getSupport() + " health.");
    }
}