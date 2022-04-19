/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semafori2;

/**
 *
 * @author Simona
 */
public class Contatore {
    int valore;
    int passo;
    
    public Contatore(int valore,int passo){
        this.valore=valore;
        this.passo=passo;
        
        System.out.println("il contatore vale:"+this.getValore());
        
    }

    public int getValore() {
        return valore;
    }


    public int getPasso() {
        return passo;
    }

  public void incrementa(){
      valore=valore+passo;
  }
  public void decrementa(){
      valore=valore-passo;
  }
}
