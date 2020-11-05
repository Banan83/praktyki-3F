class Opony{
    String marka;
    double tarcie;
}

//Schemat według którego tworzymy obiekt klasy Auto
public class Auto {
    //Wartości jakie obiekt będzie przechowywał (możemy ustawić na sztywno jak color, albo wprowadzić za pomocą setterów)
    String color = "Czarny";
    int liczba_miejsc;
    int pojemnosc_silnika;
    double velocity = 10;
    Opony opony;

    //Od tego miejsca w dół są metody jakie obiekt będzie posiadał

    //Metody zwane getterami - służą do pobierania wartości z obiektu
    Opony get_opony(){
        return opony;
    }

    double getVelocity() {
        return velocity;
    }

    void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    private Opony getOpony() {
        return opony;
    }

    //Metoda którą ustawiamy wszystkie wartości obiektu (NOTE: Analogicznie do powyżej ta metoda powinna być rozbita jak gettery i nazywamy je setterami)
    void set_all(String color, int liczba_miejsc, int pojemnosc_silnika, double velocity) {
        this.color = color;
        this.liczba_miejsc = liczba_miejsc;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.velocity = velocity;
    }

    void jedz(){
        System.out.println("brum brum");
    }

}
