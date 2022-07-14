package ru.homedev.animalsandhabitats.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.homedev.animalsandhabitats.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
