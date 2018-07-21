/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_po;

import java.util.Scanner;
import projeto_po.X.Cacau;
import projeto_po.X.EmpServ;
import projeto_po.X.EmpresaAgropecuaria;
import projeto_po.X.Financeiro;
import projeto_po.X.Funcionarios;
import projeto_po.X.Gado;
import projeto_po.X.Gerente;
import projeto_po.X.Negocio;
import projeto_po.X.Secretario;
import projeto_po.X.SubGerente;
import projeto_po.X.Terras;

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
        double novosalario;
       
        
        do{          //MENU DO SISTEMA
            
                    System.out.println("\t MENU - DIGITE: ");
                    System.out.println("1- Adicionar Funcionario");
                    System.out.println("2- Pagamento de Funcionarios ");
                    System.out.println("3- Financeiro ");
                    System.out.println("4- Relações de Negócio ");
                    System.out.println("5- Sair ");
                    System.out.println(">");  

                    opc = Integer.parseInt(in.nextLine()); // variavel de controle para opcao
                    Funcionarios a = new Funcionarios();
                    
        switch(opc){
            case 1: 
                    {
                      
                       
                            System.out.println("DIGITE: 1- Gerente | 2- Subgerente | 3- Secretario | 4- Empregados de servicos gerais ");
                           
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
                            String RG = in.nextLine();
                            a.setRG(RG);
                            
                            System.out.println("Informe o Salario atual: ");
                            Double salario =  Double.parseDouble(in.nextLine());
                            a.setSalario(salario);
                            
                        switch (opc) {
                            case 1:
                                Gerente gerente = new Gerente(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                                break;
                            case 2:
                                SubGerente subgerente = new SubGerente(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                                break;
                            case 3:
                                Secretario secretario = new Secretario(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                                break;
                            case 4:
                                EmpServ empserv = new EmpServ(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                                break;
                            default:
                                break;
                                      }
                       
                    }
                    break;
            case 2: 
                do{
                System.out.println("Digite: 1- Gerente | 2 - Subgerente | 3- Secretário | 4- Empregados de Serviços gerais | 5- Sair");
                opc = Integer.parseInt(in.nextLine());
                System.out.println("Informe o valor do salario pago mais horas extras R$ ");
                novosalario = Double.parseDouble(in.nextLine());
                a.setSalario(novosalario);
                    if(opc == 1 ){
                        Gerente gerente = new Gerente(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                            
                    }else if(opc == 2){
                        SubGerente subgerente = new SubGerente(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                    }else if(opc == 3){
                        Secretario secretario = new Secretario(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                    }else if(opc == 4){
                        EmpServ empserv = new EmpServ(a.getNome(),a.getCpf(),a.getNumCTB(),a.getRG(),a.getSalario());
                    }
                }while(opc!=5);
                break;
                
            case 3: 
                Financeiro f = new Financeiro();
               
                do{
                System.out.println("Digite: 1- Entrada de capital | 2- Saída de capital | 3- Relatorio | 4- Sair ");
                opc = Integer.parseInt(in.nextLine());
                    
                        switch (opc) {
                            case 1:
                                System.out.println("Digite o valor da entrada de capital : ");
                                Double Ent = Double.parseDouble(in.nextLine());
                                f.setEntCapital(Ent);
                                break;
                            case 2:
                                System.out.println("Digite o valor para saida de capital: ");
                                Double Sai = Double.parseDouble(in.nextLine());
                                f.setSaiCapital(Sai);
                                
                                break;
                            case 3:
                                if(f.getEntCapital() == null || f.getSaiCapital() == null){
                                    System.out.println("Nao temos entradas ou saidas de capital");
                                    break;
                                }else{
                                    System.out.println("Relatorio: ");
                                    System.out.println(f.GerarSaldoCapital());
                                    break;
                                }       default:
                                break;
                        }
                }while(opc!=4);
                               
                break;
                
            case 4: 
                Double resultado,g2,t2,c2;
                Negocio n = new Negocio();
                do{
                System.out.println("Digite: 1- Gado | 2- Cacau | 3- Terras | 4- Balanço | 5- SAIR");
                opc = Integer.parseInt(in.nextLine());
                               
                        switch (opc) {
                            case 1:
                                System.out.println("Digite o numero de animais: ");
                                Double qntGado = Double.parseDouble(in.nextLine());
                                n.setQnt(qntGado);
                                System.out.println("Digite o valor por arroba de animais R$");
                                Double precGado = Double.parseDouble(in.nextLine());
                                n.setPreco(precGado);
                                Gado g = new Gado(n.getQnt(), n.getPreco());
                                g2 = g.getPreco()*g.getQnt();
                                n.setA(g2);
                                // VALOR_EM_ANIMAIS = VALOR_UNITARIO*QUANTIDADE
                                break;
                            case 2:
                                System.out.println("Digite a arroba de Cacau: ");
                                Double qntcacau = Double.parseDouble(in.nextLine());
                                n.setQnt(qntcacau);
                                System.out.println("Digite o valor da arroba de cacau R$");
                                Double precCacau = Double.parseDouble(in.nextLine());
                                n.setPreco(precCacau);
                                Cacau c = new Cacau(n.getQnt(), n.getPreco());
                                c2 = c.getQnt()*c.getPreco();
                                n.setB(c2);
                                // VALOR_EM_CACAU = VALOR_UNITARIO*QUANTIDADE
                                break;
                            case 3:
                                System.out.println("Digite o numero de hectares de terras: ");
                                Double qntTerras = Double.parseDouble(in.nextLine());
                                n.setQnt(qntTerras);
                                System.out.println("Digite o valor por arroba de animais R$");
                                Double precTerras = Double.parseDouble(in.nextLine());
                                n.setPreco(precTerras);
                                Terras t = new Terras(n.getQnt(), n.getPreco());
                                t2 = t.getPreco()*t.getQnt();
                                n.setC(t2);
                                //VALOR_EM_TERRAS = VALOR_UNITARIO*QUANTIDADE
                                break;
                            case 4:
                                System.out.println("O valor em em reais de gado,cacau e terras é R$ ");
                                System.out.println(n.GerarBalanco());
                                
                                break;
                            default:
                                break;
                        }
                }while(opc!=4);
                break;
                
        }            
        }while(opc!=5);
               
         
    
    }
    
    
}
