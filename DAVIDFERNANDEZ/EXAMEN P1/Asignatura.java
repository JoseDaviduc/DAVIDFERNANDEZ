public class Asignatura{

    private String clave;
    private int Hp;
    private int Ht;
    private String nombre;
    private int semestre;

    public Asignatura(String c, int h, int ht, String n, int s){
        clave = c;
        Hp = h; 
        Ht = ht;
        nombre = n;
        semestre = s;
    }
    public Asignatura() {clave="12345"; Hp= 23899; Ht= 76351; nombre="programacion"; semestre= 4;}
        public String getClave(){
            return clave;
        }
        public void setclave(String clave){
            if (clave.equals("")) {
                clave = "12345";
            } else {
                
            }
        }
        public int getHp(){
            return Hp;
        }
        public void setHp(int Hp){
            if (Hp== 23899) {
                
            } else {
                
            }
        }
        public int getHt(){
            return Ht;
        }
        public void setHt(int Ht) {
            if (Ht== 76351) {
                
            } else {
                
            }
        }
        public String getNombre(){
            return nombre;
         }
        public void setnombre(String Nombre) {
            if (nombre.equals("")) {
                nombre="programacion";
            } else {
                
            }
        }
        public int getSemestre(){
            return semestre;
        }
        public void setSemestre(int Semestre){
            if (Semestre== 4) {
                
            } else {
                
            }
        }
        
    }
