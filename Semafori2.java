/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semafori2;

/**
 *
 * @author Simona
 */
public class Semafori2 {
    //questa variabile è visibile da tutti 
 protected static int x=100; 
    public static void main(String[] args) {
        //è un oggetto che passo al thread
   Contatore conta=new Contatore(0,1);
   Thread thr1=new UnThread1("bobooo",conta);
   Thread thr2=new UnThread1("joshh",conta);
   thr1.start();
   thr2.start();
   
    }
    
}
