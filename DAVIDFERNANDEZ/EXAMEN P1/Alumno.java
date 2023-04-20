public class Alumno{

    private String Direccion;
    private String Matricula;
    private String nombre;
    private String telefono;

    public Alumno(String d, String M, String n, String t){
        Direccion = d;
        Matricula = M;
        nombre = n;
        telefono = t;
    }
    public Alumno(){Direccion= "calle 22"; Matricula= "7933"; nombre= "david"; telefono= "9961110461";}
        public String getDireccion(){
            return Direccion;
        }
        public void setdireccion(String direccioString){
            if (direccioString.equals("")) {
                Direccion="calle 22";
                
            } else {
                Direccion=direccioString;
                
            }
        }
        public String getMatricula(){
            return Matricula;
        }
        public void setmatricula(String Matricula){
            if (Matricula.equals("")) {
                this.Matricula= "7933";
            } else {
                
            }
        }
        public String getnombre(){
            return nombre;
        }
        public void setnombre(String nombre){
            if (nombre.equals("")) {
                this.nombre="david";
            } else {
                
            }
        }
        public String gettelefono(){
            return telefono;
         }
        public void settelefono(String telefono){
            if (telefono.equals("")) {
                this.telefono="9961110461";
            } else {
                
            }
        }
       
    
}