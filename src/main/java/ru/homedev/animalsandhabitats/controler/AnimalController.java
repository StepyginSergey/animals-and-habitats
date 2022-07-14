package ru.homedev.animalsandhabitats.controler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.homedev.animalsandhabitats.entity.Animal;
import ru.homedev.animalsandhabitats.entity.Region;
import ru.homedev.animalsandhabitats.service.AnimalService;

@RestController
@RequestMapping("/ah")
@Api(tags = {"animal-controller"})
@Tag(name = "animal-controller", description = "animal data API")
public class AnimalController {

  @Autowired
  private AnimalService animalService;

  @ApiOperation(value = "Получить сведения о всех животных", notes = "Получить сведения о всех животных в соответствии с идентификатором URL-адреса")
  @GetMapping("/animals")
  public List<Animal> showAllAnimals() {
    return animalService.getAllAnimals();
  }

  @ApiOperation(value = "Добавление нового животного", notes = "Добавить нового животного в приложение")
  @PostMapping("/animals")
  public Animal addNewAnimal(@RequestBody Animal animal) {
    animalService.saveAnimal(animal);
    return animal;
  }


}
