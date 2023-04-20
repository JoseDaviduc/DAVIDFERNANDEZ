public class Curso {
    
    private String Asignatura;
    private String Aula;
    private String Nombre;
    private int NumAlumnos;

     public Curso (String a, String au, String n, int nm){
        Asignatura= a;
        Aula= au;
        Nombre= n;
        NumAlumnos= nm;
        }
        
        public Curso(){Asignatura="programacion"; Aula="A7"; Nombre="sistemas"; NumAlumnos=40;}

            public String getasignatura(){
                return Asignatura;
            }
            public void setasignarura(String Asignatura){
                if (Asignatura.equals("")) {
                    Asignatura= "porgramacion";
                } else {
                    
                }
            }
            public String getAula(){
                return Aula;
            }
            public void setAula(String Aula){
                if (Aula.equals("")) {
                    Aula= "A7";
                } else {
                    
                }
            }
            public String getNombre(){
                return Nombre;
            }
            public void setnombre(String Nombre){
                if (Nombre.equals("")) {
                    Nombre= "sistemas";
                } else {
                    
                }
            }
            public int getNumAlumnos(){
                return NumAlumnos;
        }
            public void setnumalumnos(int NumAlumno){
               if (NumAlumnos== 0) {
                
               } else {
                
               }
            }
        }
   
