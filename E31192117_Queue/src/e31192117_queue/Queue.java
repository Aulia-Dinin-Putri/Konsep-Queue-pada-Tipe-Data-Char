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
public class Queue {
    int queue[]=new int[5];
    int size;
    int front;
    int rear;
    
    public void enQueue(int data) {
        if(!isFull()){
        queue[rear]=data;
        rear=(rear+1)%5;
        size=size+1;}
        else
            System.out.println("Queue is Full");
    }
    public int deQueue() {
        int data=queue[front];
        if(!isEmpty()){
        front=(front+1)%5;
        size=size-1;
        }
        else
            System.out.println("Queue is Empty");
        return data;
    }
    public void show() {
        System.out.println("Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println();
        for(int n:queue){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public boolean isFull(){
        return getSize()==5;
    }
}
