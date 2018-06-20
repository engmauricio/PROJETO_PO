/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_po.X;

/**
 *
 * @author EngMauricio
 */
public class Negocio {
  
    private int Qnt; 
    private Double Precporkg;
    //private 
    
    public Negocio(){
        
    }
    public Negocio(int Qnt, Double Precporkg){
        
        this.Precporkg = Precporkg;
        this.Qnt = Qnt;        
    }

    public int getQnt() {
        return Qnt;
    }

    public void setQnt(int Qnt) {
        this.Qnt = Qnt;
    }

    public Double getPrecporkg() {
        return Precporkg;
    }

    public void setPrecporkg(Double Precporkg) {
        this.Precporkg = Precporkg;
    }
        
}
