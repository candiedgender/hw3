public class TestHW3 {

    public static void main(String[] args) {
        Sidekick sidekick = new Sidekick("Bucky Barnes", -25);
        Hero h = new Hero("Captain America", "Shield", sidekick, -15,
                            -10, -10);
        Villain v = new Villain("J", -10, -10, -10);

        System.out.println(h);
        System.out.println(v);
    }
}