package menu;

import java.util.Scanner;

public class Validador2 implements  ValidadorTamanho{
     Scanner x = new Scanner(System.in);
   
     @Override
    public String valida2(String tamanho){
    int flag = 0;
                do{
                    if (tamanho.equalsIgnoreCase("p") || tamanho.equalsIgnoreCase("m")
                    || tamanho.equalsIgnoreCase("g")  || tamanho.equalsIgnoreCase("gg")
                    ){
                    
                    flag = 1;
                    }
              
                    else{
                        System.out.println("Tamanho invalido, os tamanhos são: P, M, G, GG");
                    tamanho = x.next();
                    }
                }while(flag ==0);
    return tamanho;
    }
}


