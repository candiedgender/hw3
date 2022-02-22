/**
This class runs its main method with creates allows the user to pass in a
non-default sidekick, villain, or hero. In this submission, the default is
used for the villain while values are filled in for the sidekick and the
hero. It then runs many of the methods in hero.java, sidekick.java, and
villain.java and tells the story
@author cproenza3
@version 1
*/
public class Battle {
    /**
    This method runs everything
    @param args doesn't do anything
    */
    public static void main(String[] args) {
        Sidekick sidekick = new Sidekick("Bucky Barnes", 25);
        Hero h = new Hero("Captain America", "Shield", sidekick, 15,
                            10, 50);
        Villain v = new Villain();

        System.out.println(h);
        System.out.println(v);

        v.evilLaugh();

        h.train();

        v.attack(h);

        sidekick.cheer(v);

        h.attack(v);

        sidekick.cheer(h);

        for (int i = 0; i < 3; i++) {
            v.attack(h);
            h.attack(v);
        }
        sidekick.heal(h);

        System.out.println(h);
        System.out.println(v);
    }
}