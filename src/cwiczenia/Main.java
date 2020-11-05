package cwiczenia;

public class Main {

    public static void main(String[] args) {

        Human kamil = new Human();
        Human kacper = new Human();
        Human andrzej = new Human();

        kamil.setCzy_lysy(false);
        kamil.setColor_wlosow("Blond");
        kamil.setPlec('m');
        kamil.setWzrost(170);

        andrzej.setColor_wlosow("czarne");
        andrzej.setPlec('m');
        andrzej.setWiek(22);
        andrzej.setRozmiar_buta(42.5);
        Human matka = new Human();
        Human ojciec = new Human();
//        Human brat = new Human();
//        Human listonosz = new Human();
//        andrzej.rodzice = new Human[]{matka, ojciec, brat, listonosz}; // to jest bebe

        andrzej.setRodzice(matka, ojciec);

    }
}