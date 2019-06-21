
package menu;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    
    public static void main(String[] args) {
        
        ArrayList<Roupa> roupas = new ArrayList();
        Scanner x = new Scanner(System.in);
        
        int op;
        do{
        System.out.println("\tGerenciamento de Estoque de roupas:");
        System.out.println("[1]Adicionar roupa\n");
        System.out.println("[2]Buscar roupa\n");
        System.out.println("[3]Excluir roupa\n");
        System.out.println("[4]Listar roupas\n");
        System.out.println("[0]Sair\n");
        System.out.println("Escolha a opção desejada:");
        op=x.nextInt();
        
        
        switch(op){
            case 1 :
                
                
              
                System.out.println("Deseja adicionar uma roupa de Verão ou Inverno? Verão = 1 , inverno = 2");
                 int tipo=x.nextInt();
                
                if(tipo==1){
                System.out.println("Informe o codigo:");
                int codigo = x.nextInt();
                
                for(Roupa r : roupas){
                    if(codigo==r.getCodigo()){
                        System.out.println("codigo ja foi cadastrado escolha outro codigo:");
                         codigo = x.nextInt();
                    }
                        
                }
              
                System.out.println("Informe o tamanho");
                System.out.println("Tamanhos validos: P, M , G, GG");
                String tamanho = x.next();
               
                ValidadorTamanho validador2 = new Validador2();
                tamanho = validador2.valida2(tamanho);
                
                System.out.println("Informe o modelo");
                System.out.println("os modelos validos são: calca, maio, saia, vestido, biquini, camiseta, shorts, regata");
                String modelo = x.next();
                
                ValidadorModelo validador = new Validador1();    			
                
                modelo = validador.valida(modelo);
                
                
                roupas.add(new Verao(tipo, codigo, tamanho, modelo));
                } else if(tipo==2){
                    System.out.println("Informe o codigo:");
                int codigo = x.nextInt();
                   
                for(Roupa r : roupas){
                    if(codigo==r.getCodigo()){
                        System.out.println("codigo ja foi cadastrado escolha outro codigo:");
                         codigo = x.nextInt();
                    }
                        
                }
              
                System.out.println("Informe o tamanho");
                System.out.println("Tamanhos validos: P, M , G, GG");
                String tamanho = x.next();
               
                
                ValidadorTamanho validador2 = new Validador2();
                tamanho = validador2.valida2(tamanho);
                
                
                
                System.out.println("Informe o modelo");
                 System.out.println(" os modelos validos são: calca, casaco, moletom, camisa, blusao, cachecol, touca");
                String modelo = x.next();
                
                ValidadorInverno vali = new ValidadorInvern();
                 			
                
                modelo = vali.valida(modelo);
                
                
                roupas.add(new Inverno(tipo, codigo, tamanho, modelo));
                } else if(tipo!=1 || tipo!=2){
                    System.out.println("Tipo de roupa invalido");
                    
                }
               
                break;
                
            case 2:
               int cod;
                System.out.println("Digite o codigo da roupa:");
                cod= x.nextInt();
              
                for(Roupa r : roupas){
                
                      if (r.getCodigo()==(cod)) {
                          System.out.println("Dados da roupa:");
                          if(r.getTipo() == 1){
                            System.out.println("Roupa de verão");
                          }else if(r.getTipo() == 2){
                            System.out.println("Roupa de inverno\n");
                          }
                          System.out.println("Codigo:\n"+r.getCodigo());
                          System.out.println("Modelo:\n"+r.getModelo());
                          System.out.println("Tamanho:\n"+r.getTamanho());
                          
                 
                          
                      
                      } else if(r.getCodigo()!=cod){    //Validação que faltava caso o codigo não for cadastrado!
                          System.out.println("Roupa não cadastrada!"); 
                      }
                
            }
                break;
            case 3:
                int codigoo;
                System.out.println("Digite o codigo:");
                codigoo=x.nextInt();
                
                for(Roupa r : roupas){
                    if(r.getCodigo()==codigoo){
                        roupas.remove(r);
                        System.out.println("Roupa removida");
                        break;
                    } else if(r.getCodigo()!=codigoo){ //Validação adicionada
                        System.out.println("Roupa não cadastrada.");
                    }
                    
                    
                }
                break;
             
            case 4:
                for(Roupa r : roupas){
                    if(r.getTipo() == 1){
                        System.out.println("Roupa de verão");      
                    }else if(r.getTipo() == 2){
                        System.out.println("Roupa de inverno");
                    }
                    System.out.println("Código: "+r.getCodigo()+"\t"+"Modelo: "+r.getModelo()+"\t"+"Tamanho"+r.getTamanho()+"\t");
                    
                }  
                 if(roupas.isEmpty()){
                     System.out.println("Nenhuma roupa foi cadastrada");//caso nenhuma roupa for cadastrada
                 }
                 break;
                 
            default:
                System.out.println("Opção invalida!!"); //Adicionado para caso o usuario escolha alguma opção invalida
                break;
              
        }
    
        }while(op!=0);
    }
}