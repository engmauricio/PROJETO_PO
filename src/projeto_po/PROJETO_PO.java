/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_po;

import java.util.Scanner;
import projeto_po.X.EmpresaAgropecuaria;
import projeto_po.X.Funcionarios;

/**
 *
 * @author EngMauricio
 */
public class PROJETO_PO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner in = new Scanner(System.in);		
	EmpresaAgropecuaria e = new EmpresaAgropecuaria("FAZENDA REUNIDAS SOMAR", "Itamari - Bahia","Dr. Nilson Ramos de Almeida");
        System.out.println(e.getNome());
        System.out.println(e.getDono());
        System.out.println(e.getEndereco());
        System.out.println(" Empresa Agropecuaria ");
                
        int opc;
        
       
        
        do{
                    System.out.println("\t MENU - DIGITE: ");
                    System.out.println("1- Adicionar Funcionario");
                    System.out.println("2- Pagamento de FuncionarioS: 1- Gerente / 2 - Subgerente / 3- Secretário / 4- Empregados de Serviços gerais ");
                    System.out.println("3- Financeiro: 1- Entrada de capital / 2- Saída de capital/ 3- Lucro");
                    System.out.println("4- Relações de Negócio: 1- Gado/ 2- Cacau/ 3- Terras ocupadas com gado ");
                    System.out.println("5- Sair ");
                    System.out.println(">");  

                    opc = Integer.parseInt(in.nextLine());
                    Funcionarios a = new Funcionarios();
                    
        switch(opc){
            case 1: 
                
                    System.out.println("DIGITE: 1- Gerente | 2- Subgerente | 3- Secretario | 4- Empregados de servicos gerais");
                    opc = Integer.parseInt(in.nextLine());
                    
                    System.out.println("Informe o nome: ");
                    String nome = in.nextLine();
                    a.setNome(nome);
                    
                    System.out.println("Informe o cpf ");
                    String cpf = in.nextLine();
                    a.setCpf(cpf);
                                        
                    System.out.println("Informe o numero da carteira de trabalho: ");
                    String numCTB = in.nextLine();
                    a.setNumCTB(numCTB);
                    
                    System.out.println("Informe o RG: ");
                    
                    System.out.println("Informe o salário: ");
                    
                    if(opc == 1 ){
                        System.out.println(a.getNome());
                        
                    }
            
        }            
        }while(opc!=5);
               
         
    
    }
    
    
}
