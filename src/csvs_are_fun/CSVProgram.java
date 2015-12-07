/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvs_are_fun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuraipanzer
 */
public class CSVProgram {
  public static void main (String[] args){
	List<String> list = new ArrayList();
	list.add("how");
	list.add("now");
	list.add("brown");
	list.add("cow");
	try {
	  CSVWriter writer = new CSVWriter("csv_file.csv");
	  writer.writeRow(list);
	  writer.writeRow(list);
	  writer.writeRow(list);
	  writer.close();
	} catch (IOException ex) {
	  Logger.getLogger(CSVProgram.class.getName()).log(Level.SEVERE, null, ex);
	}
  }
}
