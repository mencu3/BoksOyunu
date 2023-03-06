public class Main {
    public static void main(String[] args) {
        Fighter Ahmet = new Fighter("Ahmet", 15, 100, 90, 0 );
        Fighter Mehmet = new Fighter("Mehmet", 18, 90, 90,0);
        Ring r = new Ring(Ahmet, Mehmet, 90, 100);
        r.run();
    }
}

