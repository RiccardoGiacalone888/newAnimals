package AnimalsList.newAnimals.Service;

import AnimalsList.newAnimals.Models.Animals;
import AnimalsList.newAnimals.Repository.AnimalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalsServiceDB implements AnimalsService{
    @Autowired
    public AnimalsRepository animalsRepository;
    public List<Animals> getAllAnimals(){
        return animalsRepository.findAll();
    }

    public Animals getAnimals(Long id){
        Optional<Animals> animals= this.animalsRepository.findById(id);
        if (animals.isPresent()){
            return animals.get();
        }else {
            return null;
        }
    }

    public void addAnimals(Animals animals){
        animalsRepository.save(animals);
    }

    public void updateAnimals(Long id, Animals animals){
        animalsRepository.save(animals);
    }

    public void deleteAnimals(Long id){
        animalsRepository.deleteById(id);
    }
}
