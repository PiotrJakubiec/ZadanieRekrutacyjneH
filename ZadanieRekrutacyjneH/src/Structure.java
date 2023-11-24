import java.util.List;
import java.util.Optional;

// Interfejs reprezentujący strukturę, która zawiera bloki
public interface Structure {
    // Znajduje blok o podanym kolorze
    Optional<Block> findBlockByColor(String color);

    // Znajduje wszystkie bloki z danego materiału
    List<Block> findBlocksByMaterial(String material);

    // Zwraca liczbę wszystkich bloków w strukturze
    int count();
}
