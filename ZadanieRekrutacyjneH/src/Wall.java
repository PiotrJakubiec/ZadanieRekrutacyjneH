import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Klasa reprezentująca ścianę, która implementuje interfejs Structure
public class Wall implements Structure {
    private List<Block> blocks; // Lista bloków w ścianie

    // Konstruktor, inicjalizuje listę bloków
    public Wall() {
        this.blocks = new ArrayList<>();
    }

    // Dodaje blok do ściany
    public void addBlock(Block block) {
        blocks.add(block);
    }

    // Implementacja metody interfejsu, znajduje blok o podanym kolorze
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> color.equals(block.getColor()))
                .findFirst();
    }

    // Implementacja metody interfejsu, znajduje bloki z danego materiału
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> result = new ArrayList<>();
        for (Block block : blocks) {
            if (material.equals(block.getMaterial())) {
                result.add(block);
            }
        }
        return result;
    }

    // Implementacja metody interfejsu, zwraca liczbę bloków w ścianie
    @Override
    public int count() {
        return blocks.size();
    }
}

