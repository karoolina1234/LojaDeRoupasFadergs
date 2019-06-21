/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author karoo
 */
public class ValidadorInvern implements ValidadorInverno {
     Scanner x = new Scanner(System.in);

 
     @Override
    public String valida(String modelo){
    int flag = 0;
                do{
                    if(modelo.equalsIgnoreCase("calca") || modelo.equalsIgnoreCase("casaco")
                    || modelo.equalsIgnoreCase("moletom")  || modelo.equalsIgnoreCase("camisa")
                    || modelo.equalsIgnoreCase("blusao") || modelo.equalsIgnoreCase("cachecol")
                    || modelo.equalsIgnoreCase("touca")){
                    
                    flag = 1;
                    }
              
                    else{
                        System.out.println("Modelo invalido, os modelos validos são: calca, casaco,moletom, camisa, blusao, cachecol, touca");
                    modelo = x.next();
                    }
                }while(flag ==0);
    return modelo;
    }
}
