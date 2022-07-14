package ru.homedev.animalsandhabitats.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
@ApiModel(value = "Animal - Сущность 'Животное', отвечает отображение")
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name")
  @ApiModelProperty("animalName - Animal name property")
  private String animalName;

  @OneToOne
  @JoinColumn(name = "kind_id", referencedColumnName = "id", nullable = false)
  @ApiModelProperty("Animai kind. Object.")
  private AnimalKind kind;

  @OneToOne
  @JoinColumn(name = "skin_color_id", referencedColumnName = "id", nullable = false)
  private SkinColor skinColor;

  @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
  @JoinTable(
      name = "animal_region",
      joinColumns = {@JoinColumn(name = "animal_id")},
      inverseJoinColumns = {@JoinColumn(name = "region_id")}
  )
  private Set<Region> regions = new HashSet<>();


  public Animal() {
  }

  public void addRegionToAnimal(Region region) {
    if (regions == null) {
      regions = new HashSet<>();
    } else {
      regions.add(region);
    }

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnimalName() {
    return animalName;
  }

  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

  public AnimalKind getKind() {
    return kind;
  }

  public void setKind(AnimalKind kind) {
    this.kind = kind;
  }

  public SkinColor getSkinColor() {
    return skinColor;
  }

  public void setSkinColor(SkinColor skinColor) {
    this.skinColor = skinColor;
  }

  public Set<Region> getRegions() {
    return regions;
  }

  public void setRegions(Set<Region> regions) {
    this.regions = regions;
  }
}
