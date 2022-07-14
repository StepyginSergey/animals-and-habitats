package ru.homedev.animalsandhabitats.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="animal_kind")
public class AnimalKind {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "kind_name")
  private String kindName;


  public AnimalKind() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getKindName() {
    return kindName;
  }

  public void setKindName(String kindName) {
    this.kindName = kindName;
  }
}
