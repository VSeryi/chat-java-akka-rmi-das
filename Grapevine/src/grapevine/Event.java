/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapevine;

import java.util.GregorianCalendar;
import java.io.Serializable;
/**
 *
 * @author Álvaro Parras
 */
public interface Event extends Serializable, Comparable {
    
public GregorianCalendar getSchedule();
@Override
public String toString();
}
