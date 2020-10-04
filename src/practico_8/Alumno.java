package practico_8;

import java.util.*;

public class Alumno {
    
    private int legajo;
    private String nombre;
    private String apellido;
    Set<Materia> mat = new TreeSet<>();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void agregarMateria(Materia m){
        mat.add(m);
    }
   public int cantidadMaterias(){
    int materias=0;
        return mat.size();
    
    }
        
    
    public int cantidadMatrias(){
        int materias=0;
        for(Materia m:mat){
        materias++;
        }
        
        
        return materias;
    }
}
