package practico_8;
public class Colegio {

    public static void main(String[] args) {
        //a) Crear las materias
        Materia ing=new Materia(1,"Ingles 1",1);
        Materia mat=new Materia(2,"Matematicas",1);
        Materia lab=new Materia(3,"Laboratorio 1",1);
        //b)Crear 2 Alumnos
        Alumno lopez = new Alumno(1001,"Martin","Lopez");
        Alumno martinez = new Alumno(1002,"Brenda","Martinez");
        //c)Incribir a lopez en 3 materias
        lopez.agregarMateria(ing);
        lopez.agregarMateria(mat);
        lopez.agregarMateria(lab);
        //d)inscribir a martinez en 3 materias y volver a inscribirlo en lab1
        martinez.agregarMateria(ing);
        martinez.agregarMateria(mat);
        martinez.agregarMateria(lab);
        martinez.agregarMateria(lab);
        //e) Visualizar la csntidad de materias en las que estan inscriptos
       System.out.println("El Alumno Lopez tiene "+lopez.cantidadMatrias()+" Materias");
       System.out.println("El Alumno Martinez tiene "+martinez.cantidadMatrias()+" Materias");
       //e.a/b) el motivo por el cual tienen la misma cantidad es porque se estan almacenando en 
       //un TreeSet y esta coleccion no permite duplicados, a su vez se sobreescribe el metodo equals 
       //para que el valor a comparar sea la materia y se modifico el hashCode para setearle el  
       //id de la materia.
      
    }
    
}
