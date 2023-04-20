public class Personaje{
    private String nombre;
    private String tamanio;
    private String color;
    private boolean traje[]; // 0. con traje 1. sin traje 
    private boolean estado[]; //0.activado 1.desactivado
    private boolean bateria[]; //0.cargado 1.descargado
    private Object out;
    public Personaje(){
        nombre="beimax";
        tamanio="grande";
        color="blanco";
        traje= new boolean[]{true, false};
        estado= new boolean[]{true, false};
        bateria= new boolean[]{true, false};
    }
    void personaje( String n, String t, String c, boolean traje, boolean e, boolean b){
    }
    public String getNomber(){
        return nombre;
    }
    public void setNombre(String){
        this.nombre.equals("")? "beimax":n;
    }
    public String gettamanio(){
        return tamanio;
    }
    public void settamanio(String){
        this,tamanio.equals("")?"grande";
    }
    public String getcolor(){
        return color;
    }
    public void setcolor(String){
        this.color.equals("")?"grande";
    }
    public boolean gettraje(){
        return traje;
    }
    public void settraje(boolean){
        this.traje.equals("boolean")?"sin traje";
    }
    public boolean getestado(){
        return estado;
    }
    public void setestado(boolean){
        this.estado.equals(boolean)?"activo"
    }
    public boolean getbateria(){
        return bateria;
    }
    public void setbateria(boolean){
        this.bateria.equals(boolean)?"cargado";
    }
    public static void main(String[]args){
        system.out.print1n("construir personaje");
    }
    public void camina(){
        this.out.println("beimax esta caminando");
    }
    public void corre(){
        this.out.print1n("beimax empeso a correr");
    }
    public void salta(){
        this.out.println("beimax dio un salto");
    }
    public void vuela(){
        this.out.println("beimax empeso a volar");
    }
} 

