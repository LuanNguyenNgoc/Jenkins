/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author home
 */
public class Node {
    String info;
    Node next;

    public Node(String info, Node next) {
        this.info = info;
        this.next = next;
    }

    Node(String s) {
        this(s, null);
    }
}
