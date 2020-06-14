package Enunciado1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    static Pilas pila;
    static Scanner entrada = new Scanner(System.in);
    public static void main (String  [] args){
        menu();
        
    }
    static void menu(){
        int opcion;
        do{
            System.out.println("\n\tmenu");
            System.out.println("[1] Crear pila");
            System.out.println("[2] Llenar Datos");
           System.out.println("[3] Mostrar Datos");
           System.out.println("[4] Eliminar Datos");
            System.out.print("Ingrese una opncion: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    crearPila();
                    break;
                case 2:
                   llenarDatos();
                    break;
                case 3:
                    pila.mostrar();
                    break;
                case 4: 
                    pila.eliminar();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null,"Opncion no valida");
            }
        }while(opcion !=0);
    }
    
    static void crearPila(){
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo"));
        pila = new Pilas(tam);
    }
   static int pos = 0;
    static void llenarDatos(){
            int nota1;
            int nota2;
            
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo"); 
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
            do{
            nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primera nota"));
            if (nota1>21 || nota1 <= 0 ){
                JOptionPane.showMessageDialog(null,"**Error al ingresar dotas***");
            }
            }while(nota1>21 || nota1 <= 0 );
            
            do{
            nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segunda nota"));
            if ( nota2>21 || nota2 <= 0){
                JOptionPane.showMessageDialog(null,"**Error al ingresar dotas***");
            }
            }while(nota2>21 || nota2 <= 0);
            
            
            pila.llenarPila(pos,codigo, nombre, nota1, nota2);
            pos++;
    }
}