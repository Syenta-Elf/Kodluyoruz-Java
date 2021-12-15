/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Hüseyin", 10, 120, 125,60);
        Fighter f2 = new Fighter("Arhan", 10, 120, 125,60);
        
        Match m1 = new Match(f1, f2, 80, 130);
        m1.run();
    }
}