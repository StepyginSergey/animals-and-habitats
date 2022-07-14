package ru.homedev.animalsandhabitats.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skin_color")
public class SkinColor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name="color_name")
  private String colorName;

  public SkinColor() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getColorName() {
    return colorName;
  }

  public void setColorName(String colorName) {
    this.colorName = colorName;
  }
}
