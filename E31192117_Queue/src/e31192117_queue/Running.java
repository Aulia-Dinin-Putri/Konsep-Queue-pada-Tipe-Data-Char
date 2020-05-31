/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192117_queue;

/**
 *
 * @author AULIA DININ
 */
public class Running {
    public static void main(String[] args) {
        Queue q=new Queue();
        //q.enQueue(5);
        //q.enQueue(2);
        //q.enQueue(7);
        //q.enQueue(3);
        //
        q.deQueue();
        q.deQueue();
        
        q.enQueue(9);
        q.enQueue(1);
        
        //q.enQueue(19);
        //q.enQueue(15);
        
        System.out.println(q.isFull());
        
        System.out.println("Size"+q.getSize());
        q.show();
    }
}
