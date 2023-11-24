// Klasa reprezentująca prosty blok, implementuje interfejs Block
public class SimpleBlock implements Block {
    private String color; // Kolor bloku
    private String material; // Materiał bloku

    // Konstruktor, inicjalizuje kolor i materiał bloku
    public SimpleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    // Implementacja metody interfejsu, zwraca kolor bloku
    @Override
    public String getColor() {
        return color;
    }

    // Implementacja metody interfejsu, zwraca materiał bloku
    @Override
    public String getMaterial() {
        return material;
    }

    // Przesłonięta metoda toString, zwraca tekstową reprezentację bloku
    @Override
    public String toString() {
        return "SimpleBlock{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
