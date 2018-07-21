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
  
    private Double Qnt; 
    private Double Preco;  
    private Double a;
    private Double b;
    private Double c;
    //private 
    
    public Negocio(){
        
    }

      
    public Double GerarBalanco(){
    
        return getA() + getB() + getC();
   
    }    
    public Negocio(Double Qnt, Double Preco){
        
        this.Preco = Preco;
        this.Qnt = Qnt;        
    }

    public Double getQnt() {
        return Qnt;
    }

    public void setQnt(Double Qnt) {
        this.Qnt = Qnt;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }
    
        
}
