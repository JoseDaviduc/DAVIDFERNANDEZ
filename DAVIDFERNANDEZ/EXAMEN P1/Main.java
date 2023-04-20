public class Main {

    public static void main(String[]args){
        
        Alumno a= new Alumno("calle 22", "7933", "david","9971110461");
        Asignatura A= new Asignatura("curso", 0, 0, "programacion", 0);
        Curso c= new Curso("programacion", "A7", "sistemas", 40);
        
        System.out.println("nombre del alumno = " + curso.getNom());
                System.out.println("aula =  " + curso.getAula());
                System.out.println("numero del alumno =" + curso.getNumAlumnos());
                System.out.println(curso.getNom()+ curso.EstaCompleto());
                
               
                System.out.println(" clave de le asignatura = " + asignatura.getClave());
                System.out.println("nombre del alumno = " + asignatura.getNombre());
                System.out.println("horas de practica = " + asignatura.getHP());
                System.out.println(" horas de teoria = " + asignatura.getHT());
                
                System.out.println(" direccion del alumno =  " + alumno.getDireccion());
    } 
}