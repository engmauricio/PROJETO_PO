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
public class Financeiro {
    
    private Double EntCapital;
    private Double SaiCapital;
    private Double Relatorio;
   // public Double GerarSaldoCapital;
    
    public Financeiro(){
        
    }

//    public Financeiro(Double EntCapital, Double SaiCapital, Double Relatorio){
//        
//        this.EntCapital = EntCapital;
//        this.SaiCapital = SaiCapital;
//        this.Relatorio = Relatorio;
//        
//    }
    
        
    public Double getEntCapital() {
        return EntCapital;
    }

    public void setEntCapital(Double EntCapital) {
        this.EntCapital = EntCapital;
    }

    public Double getSaiCapital() {
        return SaiCapital;
    }

    public void setSaiCapital(Double SaiCapital) {
        this.SaiCapital = SaiCapital;
    }

    public Double getRelatorio() {
        return Relatorio;
    
    }

    public void setRelatorio(Double Relatorio) {
        this.Relatorio = Relatorio;
   
    }
       
   public Double GerarSaldoCapital(){
       
       return  getEntCapital() - getSaiCapital();
          
    }
}
