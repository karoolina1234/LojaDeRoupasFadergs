/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;



/**
 *
 * @author karoo
 */
abstract class Roupa { 
    private int tipo;
    private int codigo;
    private String tamanho; // p, m , g
   private String modelo; //Vestido, blusa, calça

    public Roupa(int codigo, String tamanho, String modelo ) {
        this.codigo = codigo;
        this.tamanho = tamanho;
        this.modelo = modelo;
  
    }


    public Roupa(int tipo, int codigo, String tamanho, String modelo) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.tamanho = tamanho;
        this.modelo = modelo;
       
    }
    
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
 

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
}
