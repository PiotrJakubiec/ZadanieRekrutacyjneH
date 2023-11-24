import java.util.List;
import java.util.Optional;

// Klasa zawierajaca metode main do przetestowania funkcji
public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(); // Tworzy instancje sciany

        // Dodaje bloki do sciany
        Block block1 = new SimpleBlock("Red", "Brick");
        Block block2 = new SimpleBlock("Blue", "Concrete");
        Block block3 = new SimpleBlock("Green", "Wood");

        wall.addBlock(block1);
        wall.addBlock(block2);
        wall.addBlock(block3);

        // Testuje metody
        Optional<Block> foundBlock = wall.findBlockByColor("Red");
        if (foundBlock.isPresent()) {
            System.out.println("Znaleziono blok o kolorze Red: " + foundBlock.get());
        } else {
            System.out.println("Nie znaleziono bloku o kolorze Red");
        }

        List<Block> blocksByMaterial = wall.findBlocksByMaterial("Concrete");
        System.out.println("Bloki z materialu Concrete: " + blocksByMaterial);

        int numberOfBlocks = wall.count();
        System.out.println("Liczba blokow w scianie: " + numberOfBlocks);
    }
}
