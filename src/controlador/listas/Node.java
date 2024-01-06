/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.list;

/**
 *
 * @author Santiago
 */
public class Node<E> {
    private E info;
    private Node<E> next;
    public Node(E info){
        this.info=info;
        next=null;
    }
    public Node(E info, Node<E> next){
        this.info=info;
        this.next=next;
    }
    public Node(){
        info=null;
        next=null;
    }
    public E getInfo() {
        return info;
    }
    public void setInfo(E info) {
        this.info = info;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }

    
}
