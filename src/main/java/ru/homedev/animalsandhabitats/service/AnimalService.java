package ru.homedev.animalsandhabitats.service;

import java.util.List;
import ru.homedev.animalsandhabitats.entity.Animal;

public interface AnimalService {

  public List<Animal> getAllAnimals();

  public void saveAnimal(Animal employee);

//  public Animal getAnimal(int id);
//
//  public void deleteAnimal(int id);
//
//  public List<Animal> findAllBName(String name);

}
