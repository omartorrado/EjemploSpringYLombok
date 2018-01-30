/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplospringylombok;

import lombok.Data;

/**
 *
 * @author otorradomiguez
 */

//Con @Data genera automaticamente, constructor, getters y setters y algun metodo mas
@Data 
public class EjemploPOJOClass {
    
    private int numero;
    private String texto;
    private double decimal;
    
}
