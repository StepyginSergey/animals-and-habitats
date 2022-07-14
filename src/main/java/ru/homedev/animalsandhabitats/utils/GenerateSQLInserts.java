package ru.homedev.animalsandhabitats.utils;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateSQLInserts {

  public static void main(String[] args) {

    StringBuilder inserts = new StringBuilder();

    for(int i = 3; i<= 1_000_000; i++){
      inserts.append("INSERT INTO animal (id, name, kind_id, skin_color_id) VALUES (" + i + ", 'Животное" + i +"', 1, 1);");
      inserts.append("\n");
    }

   // System.out.println(inserts.toString());


    try {
      FileWriter myWriter = new FileWriter("filename.txt");

      myWriter.write(inserts.toString());

      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }


  }

}
