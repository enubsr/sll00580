/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistexample0580;

/**
 *
 * @author Enubs
 */
public class EmptyListException extends NullPointerException{
    public EmptyListException(){
        super("The list has no elements.");
    }
}
