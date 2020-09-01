/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlistexample0580;

/**
 *
 * @author Enubs
 * @param <E>
 */
public class SList<E> {

    private SNode<E> head, tail;
    private int size;

    public SList() {
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public E first() {
        return head.getElement();
    }

    public E last() {
        return tail.getElement();
    }

    public void addFirst(E element) {
        SNode<E> newNode = new SNode<>(element, null);

        if (size() == 0) {
            tail = newNode;
        }

        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(E element) {
        SNode<E> newNode = new SNode<>(element, null);
        if (size() == 0) {
            head = newNode;
        }

        tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public E removeFirst() throws EmptyListException {
        SNode<E> temp = head;
        head = head.getNext();

        if (head == null) {
            throw new EmptyListException();
        }

        temp.setNext(null);
        size--;

        return temp.getElement();
    }

    public void displayList(SList<Person> personsList) {
        SNode<Person> temp = (SNode<Person>) head;
//        System.out.print("[" + temp.getElement().getLastname() + "]");
//        temp = temp.getNext();
//        System.out.print("[" + temp.getElement().getLastname() + "]");
        for (int count = 0; count < personsList.size(); count++) {
            System.out.print("[" + temp.getElement().getLastname() + ", ");
            System.out.print(temp.getElement().getFirstname() + " ");
            System.out.print(temp.getElement().getMiddlename() + " ");
            System.out.print(temp.getElement().getAge() + " ");
            System.out.print(temp.getElement().getAddress() + "]");
            
            temp = temp.getNext();
        }
    }
}
