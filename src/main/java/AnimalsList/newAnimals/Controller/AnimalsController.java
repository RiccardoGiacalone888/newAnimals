package AnimalsList.newAnimals.Controller;


import AnimalsList.newAnimals.Models.Animals;
import AnimalsList.newAnimals.Service.AnimalsServiceDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class AnimalsController {
    @Autowired
    private AnimalsServiceDB animalsServiceDB;

    @GetMapping("/animals")
    public List<Animals> getAllAnimals() {
        return animalsServiceDB.getAllAnimals();
    }

    @GetMapping("/animals/id")
    public Animals getAnimals(@PathVariable Long id){
        return animalsServiceDB.getAnimals(id);
    }

    @PostMapping("/animals")
    public void addAnimals(@RequestBody Animals animals){
        animalsServiceDB.addAnimals(animals);
    }
    @RequestMapping(value = "/animals/{id}", method = RequestMethod.PUT)
    public void updateAnimals (@PathVariable Long id, @RequestBody Animals animals){
        animalsServiceDB.updateAnimals(id,animals);
    }

    @RequestMapping(value = "/animals/{id}", method = RequestMethod.DELETE)
    public void deleteAnimals (@PathVariable Long id){
        animalsServiceDB.deleteAnimals(id);
    }

}
