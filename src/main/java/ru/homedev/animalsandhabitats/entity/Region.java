package ru.homedev.animalsandhabitats.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "region")
public class Region {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

//  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//  @JoinTable(name = "animal_region", joinColumns = @JoinColumn(name = "region_id"),
//      inverseJoinColumns = @JoinColumn(name = "animal_id"))
//  @JsonIgnore
  @ManyToMany(mappedBy = "regions")
  @JsonIgnore
  private Set<Animal> animals = new HashSet<>();

  public Region() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Animal> getAnimals() {
    return animals;
  }

  public void setAnimals(Set<Animal> animals) {
    this.animals = animals;
  }
}
