/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafori2;

/**
 *
 * @author Simona
 */
public class UnThread1 extends Thread {
    //variabili che poi passo al cosruttore 
    private int inizia=0;
    private int delta=1;
    private String mioNome="";
    Contatore conta;
    
    public UnThread1(String nomeThread,Contatore conta){
        this.mioNome=nomeThread;
        this.conta=conta;
    }
    public void run(){
        //questo è un ciclo che si ripete per sempre 
        for(;;){
           // System.out.println(mioNome+":inizia+", x="+Semafori2.x+",Contatore="+conta.getValore()};
           inizia=inizia+delta;
           Semafori2.x++;//modifica direttamente le varibili della classe che lo crea 
           conta.incrementa();
           try{ Thread.sleep(1500);}
           catch(InterruptedException e){
               System.out.println(e);}
           if(inizia>5)//termina dopo 5 ripetizioni
               return;
           }
        }
    }

