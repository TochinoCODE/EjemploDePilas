package Enunciado1;

public class Alumno {
    private String codigo;
    private String nombre;
    private int nota1;
    private int nota2;

    public Alumno() {
    }

    public void registrar(String codigo, String nombre, int nota1, int nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public double hallarPromedio(){
        double prom=(nota1+nota2)/2.0;
        return prom;
    }
    public void mostrarPromedio(){
        System.out.println("Promedio: "+hallarPromedio());
    }
    public void mostrarDatos(){
        System.out.println("\nCodigo = "+codigo);
        System.out.println("Nombre = "+nombre);
        System.out.println("Nota 1 = "+nota1);
        System.out.println("Nota 2 = "+nota2);
        System.out.println("Promedio = "+hallarPromedio());
    }
}
