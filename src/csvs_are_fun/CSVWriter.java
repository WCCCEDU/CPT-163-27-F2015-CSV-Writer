/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvs_are_fun;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author samuraipanzer
 */
public class CSVWriter {
  FileWriter fWriter = null;

  public CSVWriter(String filePath) throws IOException  {
	File file = new File(filePath);
	fWriter = new FileWriter(file);
  }
  
  public void writeRow(List<String> values) throws IOException{
	this.fWriter.append(join(values));
	this.fWriter.append("\n");
  }
  
  public void close() throws IOException{
	this.fWriter.close();
  }
  
  private String join(List<String> values){
	StringBuilder string = new StringBuilder();
	List<String> hasCommas = values.subList(0, values.size() - 1);
	for(String item : hasCommas){
	  string.append(item);
	  string.append(",");
	}
	string.append(values.get(values.size()-1));
	
	return string.toString();
  }
  
}
