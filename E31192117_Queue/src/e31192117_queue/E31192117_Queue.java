/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31192117_queue;

/**
 *
 * @author AULIA DININ PUTRI A
 */
public class E31192117_Queue {

    char E31192117_Queue[]=new char[5];
    int size;
    int front;
    int rear;
    
    public void enQueue(char data) {
        if(!isFull()){
        E31192117_Queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;}
        else
            System.out.println("Queue is Full");
    }
    public int deQueue() {
        int data=E31192117_Queue[front];
        if(!isEmpty()){
        front=(front+1)%5;
        size='Z';
        }
        else
            System.out.println("Queue is Empty");
        return data;
    }
    public void show() {
        System.out.println("Elements: ");
        for (char c = 'A'; c < size; ++c) {
            System.out.print(E31192117_Queue[(front+c)%5]+" ");
        }
        System.out.println();
        for(char n:E31192117_Queue){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){ //batas minimal data yang diinput
        return getSize()==0;
    }
    public boolean isFull(){ //batas maksimal data yang diinput
        return getSize()==5;
    }

    public static void main(String[] args) {
        E31192117_Queue q=new E31192117_Queue();
        //q.enQueue('A');
        //q.enQueue('U');
        //q.enQueue('L');
        //q.enQueue('I');
        //q.enQueue('A');
        //
        q.deQueue();
        q.deQueue();
        
        q.enQueue('D');
        q.enQueue('I');
        q.enQueue('N');
        q.enQueue('I');
        q.enQueue('N');
        q.enQueue('N'); //Tidak muncul pada output karena melebihi batas data 
        
        System.out.println(q.isFull());
        
        System.out.println("Size"+" "+q.getSize());
        q.show();
    }
    
}
