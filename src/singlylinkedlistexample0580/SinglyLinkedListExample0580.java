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
public class SinglyLinkedListExample0580 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person("Enubs", "Ron", "Ibo", 38, "Samal City");
        Person p2 = new Person("Li", "Jet", "Chua", 56, "Hollywood");
        Person p3 = new Person("Chan", "Jackie", "Sy", 60, "China");
        SList<Person> personsList = new SList<>();
        
        personsList.addFirst(p1);
        personsList.addFirst(p2);
        personsList.addLast(p3);
        
        System.out.print("BEFORE REMOVE FIRST: ");
        personsList.displayList(personsList);
        
        personsList.removeFirst();
        System.out.print("\nAFTER REMOVE FIRST: ");
        personsList.displayList(personsList);
    }

}
