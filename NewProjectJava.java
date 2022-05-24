/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// En java con "//" o "/*".


/**
 *
 * @author Acer
 */
public class NewProjectJava {
    
    
    public static void main(String args[]){
        
        String nombre = "Carlos";
        String apellido = "Gatica";
        
        //Existen diversos caracteres especiales en java:
        System.out.println(nombre + " " + apellido);
        
        //para crear nueva linea se introduce \n.
        System.out.print(nombre + "\n" + apellido);
        
        //tabulador agrega un espacio \t.
        System.out.println("tabulador" + "\t" + nombre);
        
        //retroceso \b, retrocede un espacio, quitando lo que haya ahí.
        System.out.println("retroceso" + "\b" + nombre);
        
        /*retorno de carro \r (similar a "\b", pero no iguales.
        con el codigo "System.lineSeparator()" nos devuelve el caracter
        indicado, ya sea "\b o \r"
        */ 
        System.out.println("retorno: " + "\r" + nombre);
        
        /*comillas simples \' agrega ' a nuestra variable
        dependiendo donde se utilice, delante, atras o ambos lados
        */
        System.out.println("\'" + nombre + "\'");
        
        /*comillas dobles \" agrega " a nuestra variable
        */
        System.out.println("\"" + nombre + "\"");
        
        //System.out.println() para empezar a escribir en una nueva linea
        System.out.println(nombre + apellido);
        
        
        
        
    }
    
}
