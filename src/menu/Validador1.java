
package menu;
import java.util.Scanner;

public class Validador1 implements ValidadorModelo{
    
    Scanner x = new Scanner(System.in);
    @Override
    public String valida(String modelo){
    int flag = 0;
                do{
                    if(modelo.equalsIgnoreCase("calca") || modelo.equalsIgnoreCase("maio")
                    || modelo.equalsIgnoreCase("saia")  || modelo.equalsIgnoreCase("vestido")
                    || modelo.equalsIgnoreCase("biquini") || modelo.equalsIgnoreCase("camiseta")
                    || modelo.equalsIgnoreCase("shorts")  || modelo.equalsIgnoreCase("regata")){
                    
                    flag = 1;
                    }
              
                    else{
                        System.out.println("Modelo invalido, os modelos validos são: calca, maio, saia, vestido, biquini, camiseta, shorts, regata");
                    modelo = x.next();
                    }
                }while(flag ==0);
    return modelo;
    }
}
