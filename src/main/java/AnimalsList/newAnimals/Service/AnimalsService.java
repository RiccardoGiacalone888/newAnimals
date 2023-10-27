package AnimalsList.newAnimals.Service;

import AnimalsList.newAnimals.Models.Animals;

import java.util.List;

public interface AnimalsService {
    public List<Animals> getAllAnimals();
    public Animals getAnimals(Long id);
    public void addAnimals(Animals animals);
    public void updateAnimals(Long id, Animals animals);
    public void deleteAnimals(Long id);
}
