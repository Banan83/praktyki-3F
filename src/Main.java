import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int a = 7;
        String s = new String("hello");

        //Tworzymy dwa obiekty typu Auto
        Auto BMW = new Auto();
        Auto MERC = new Auto();

        //Wypisywanie poszczególnych wartości z obiektów
        System.out.println(BMW.color);
        System.out.println(MERC.color);
        System.out.println(MERC.liczba_miejsc);
        System.out.println(MERC.velocity);

        //Ustawianie wartości wewnątrz obiektów
        BMW.set_all("Biały", 5, 12, 220);
        MERC.set_all("Złoty", 10, 120, 2200);

        //Tym możecie podać wartości do obiektów z konsoli
        //Tworzymy obiekt skaner do wczytywania wartości
        Scanner scanner = new Scanner(System.in);

        //Wyświetlamy użytkownikowi odpowiedni komunikat oraz pobieramy wartość wpisaną
        System.out.println("Podaj color Bety");
        String color = scanner.next();

        //Wpisujemy wartośc wprowadzoną do wartości przechowywanych przez obiekt
        BMW.set_all(color, 5, 12, 220);

        //Sprawdzamy czy się udało
        System.out.println(BMW.color);
    }
}