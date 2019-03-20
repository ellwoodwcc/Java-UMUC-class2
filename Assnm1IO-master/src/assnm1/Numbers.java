package assnm1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* wk2disc
*/
public class Numbers {
  public static void main(String[] args) throws IOException {
    // Variables to be asked for input
    String season;
    final String winter = "winter";
    final String summer = "summer";
    final String spring = "spring";
    final String fall = "fall";
    
    // define Scanner based on input (System.in)
    Scanner reader = new Scanner(System.in);
    
    // Prompt user for season
    System.out.println ("Type in a season: \n");
    season = reader.next();

    switch (season) {
      case winter: season = "winter";
      System.out.println("good chance for snow make sure you're ready?");
      break;
      case summer: season = "summer";
      System.out.println("BEach season baybay hope you ate healthy");
      break;
      case spring: season = "spring";
      System.out.println("YOu should stop to smell the flowers");
      break;
      case fall: season = "fall";
      System.out.println("Coffe and sweater wheather, mmmmmm");
      break;
  }
}}