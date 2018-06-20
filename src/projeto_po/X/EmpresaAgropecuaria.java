/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_po.X;

import java.util.ArrayList;

/**
 *
 * @author EngMauricio
 */
public class EmpresaAgropecuaria {

    private String nome;
    private String endereco;
    private String dono;
    private ArrayList<Funcionarios> funcionairios = new ArrayList<>();
    private ArrayList<Negocio> negocio = new ArrayList<>(); 
    private ArrayList<Financeiro> financeiro = new ArrayList<>();
     
    
    public EmpresaAgropecuaria(){
    
    }
    public EmpresaAgropecuaria(String nome, String endereco, String dono){
         
         this.nome = nome;
         this.endereco = endereco;
         this.dono = dono;
    
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}






