package Enunciado1;

import javax.swing.JOptionPane;

public class Pilas {
    int tope = 0,max;
    Alumno[] pila; //Arreglo pila de tipo Alumno
    Alumno alum = new Alumno();//objeto de la clase alumno
    
    public Pilas (int max){
        this.tope = 0;
        this.max = max;
        this.pila = new Alumno[this.max+1];
        for (int i = 0; i < this.max+1; i++) {
            pila[i] = new Alumno();
        }
    }

    public Pilas() {
        this.tope = 0;
        this.max = 4;
        this.pila = new Alumno[max+1];
    }
    
    public int getTope(){
        return tope;
    }
     
    public void vaciarPila(){
        this.tope = 0;
    }
    
    public boolean isPilaLlena(){
      if (this.max == this.tope) return true;
      else                       return false;
    }
    
    public boolean isPilasVacia(){
        if (this.tope == 0) return true;
        else                return false;
    }
    
    public void llenarPila( int pos,String codigo, String nombre,int nota1, int nota2){
        
            pila[pos].registrar(codigo, nombre, nota1, nota2);
        tope++;
    }
    
    public void mostrar (){
        if (this.isPilasVacia()) 
            JOptionPane.showMessageDialog(null,"La pila esta vacia no hay elemento que mostrar");
        else{
            for (int i = 0; i<tope; i++){
            pila[i].mostrarDatos();
            }
        }
    }
     
    public void eliminar (){
        if (this.isPilasVacia()){
            JOptionPane.showMessageDialog(null,"La pila ya esta vavia");
        }else tope--;
    }
    
}
