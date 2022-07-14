package ru.homedev.animalsandhabitats.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.homedev.animalsandhabitats.dao.AnimalRepository;
import ru.homedev.animalsandhabitats.entity.Animal;
import ru.homedev.animalsandhabitats.entity.Region;

@Service
public class AnimalServiceImpl implements AnimalService {

  @Autowired
  private AnimalRepository animalRepository;

  @Override
  public List<Animal> getAllAnimals(){
    return animalRepository.findAll();
  }

  @Override
  public void saveAnimal(Animal animal) {
    Animal newAnimal = new Animal();
    newAnimal.setAnimalName(animal.getAnimalName());
    newAnimal.setKind(animal.getKind());
    newAnimal.setSkinColor(animal.getSkinColor());

    for (Region r : animal.getRegions()) {
      newAnimal.addRegionToAnimal(r);
    }
    Animal an = animalRepository.saveAndFlush(newAnimal);
    animal.setId(an.getId());
  }

//
//  public Animal getAnimal(int id);
//
//  public void deleteAnimal(int id);
//
//  public List<Animal> findAllBName(String name);

}
