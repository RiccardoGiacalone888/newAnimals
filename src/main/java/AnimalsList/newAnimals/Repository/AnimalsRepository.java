package AnimalsList.newAnimals.Repository;

import AnimalsList.newAnimals.Models.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsRepository extends JpaRepository<Animals, Long> {
}
