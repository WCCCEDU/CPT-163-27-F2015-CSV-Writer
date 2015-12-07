/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvs_are_fun;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuraipanzer
 */
public class catchthatexception {
  public static void main(String[] args){
	try {
	  ThrowSomething ts = new ThrowSomething();
	} catch (Exception ex) {
	  Logger.getLogger(catchthatexception.class.getName()).log(Level.SEVERE, null, ex);
	  System.out.println("caught that exception");
	}
  }
}
