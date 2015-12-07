/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvs_are_fun;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuraipanzer
 */
public class CSVs_are_fun {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	
	File file = new File("button_file.csv");
	PrintWriter pWriter = null;
	FileWriter fWriter = null;
	try {
	  pWriter = new PrintWriter(file);
	} catch (FileNotFoundException ex) {
	  Logger.getLogger(CSVs_are_fun.class.getName()).log(Level.SEVERE, null, ex);
	  System.exit(1);
	}
	
	PrintWriter ps = pWriter;
	
	try {
	  fWriter = new FileWriter(file, false);
	} catch (FileNotFoundException ex) {
	  Logger.getLogger(CSVs_are_fun.class.getName()).log(Level.SEVERE, null, ex);
	  System.exit(1);
	} catch (IOException ex) {
	  Logger.getLogger(CSVs_are_fun.class.getName()).log(Level.SEVERE, null, ex);
	  System.exit(1);
	}
	
	pWriter.println("HEY");
	
	try {
	  fWriter.append("YO");
	  fWriter.close();
	} catch (IOException ex) {
	  Logger.getLogger(CSVs_are_fun.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	ps.println("Files are not TOO hard!");
	ps.println("but they are very abstract");
	pWriter.close();
	
  }
  
}
