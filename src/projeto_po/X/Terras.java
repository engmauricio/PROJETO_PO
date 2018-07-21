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
public class Terras extends Negocio {
    
     public Terras(){
        
    }
    public Terras(Double Qnt, Double Preco){
        super(Qnt, Preco);
        
    } 

    /**
     *
     * @return
     */
    public Double ValorTerras(){
        return getQnt()*getPreco();
          
    }
}
