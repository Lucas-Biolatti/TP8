package practico_8;
public class Colegio {

    public static void main(String[] args) {
        //materias
        Materia ing=new Materia(1,"Ingles 1",1);
        Materia mat=new Materia(2,"Matematicas",1);
        Materia lab=new Materia(3,"Laboratorio 1",1);
        
        Alumno lopez = new Alumno(1001,"Martin","Lopez");
        Alumno martinez = new Alumno(1002,"Brenda","Martinez");
        
        lopez.agregarMateria(ing);
        lopez.agregarMateria(mat);
        lopez.agregarMateria(lab);
        
        martinez.agregarMateria(ing);
        martinez.agregarMateria(mat);
        martinez.agregarMateria(lab);
        martinez.agregarMateria(lab);
   
       System.out.println(lopez.cantidadMatrias());
       System.out.println(martinez.cantidadMatrias());
           
    }
    
}
