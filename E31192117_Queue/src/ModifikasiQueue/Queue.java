/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModifikasiQueue;
import java.util.Scanner;
/**
 *
 * @author AULIA DININ PUTRI A
 */
public class Queue {
    int id;
    String nama,perlu;
    Queue next;
    static Scanner in=new Scanner(System.in);
    static Scanner str=new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id        : ");
        id=in.nextInt();
        System.out.print("Masukkan nama      : ");
        nama=str.nextLine();
        System.out.print("Masukkan keperluan : ");
        perlu=str.nextLine();
        next=null;
    }
    public void read(){
        System.out.println("|| "+id+" \t|| "+nama+" \t|| "+perlu+" \t||");
    }
    public static void main(String[] args){
        int menu=0;
        linked que=new linked();
        while(menu!=4){
            System.out.println("SELAMAT DATANG, SILAHKAN PILIH MENU BERIKUT!!!!");
            System.out.print("1.Enqueue\n2.Dequeue\n3.View\n4.Exit\n Masukkan pilihan Menu: ");
            System.out.print(" ");
            menu=in.nextInt();
            if(menu==1)que.enque();
            else if(menu==2)que.deque();
            else if(menu==3)que.view();
            else if(menu==4)System.out.println("TERIMA KASIH");
            else System.out.println("MAAF, ADA KESALAHAN DATA");
            System.out.println("");
        }
    }
}
class linked{
    Queue head,tail;
    public linked(){
        head=null;
        tail=null;
    }
    public void enque(){
        Queue baru=new Queue();
        baru.input();
        if(head==null)head=baru;
        else tail.next=baru;
        tail=baru;
    }
    public void deque(){
        if(head==null)System.out.println("DATA KOSONG");
        else{
            System.out.println("Keluar Data Dengan Id : "+head.id);
            head=head.next;
        }
    }
    public void view(){ //Untuk menampilkan data
        if(head==null)System.out.println("DATA KOSONG");
        else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for(Queue a=head; a!=null; a=a.next) a.read();
        }
    }
}
