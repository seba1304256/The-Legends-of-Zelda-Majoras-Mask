public class Mascaras {
String nombre;
int poder;
public Mascaras(String nombre, int poder){
this.nombre = nombre;
this.poder = poder;
}
public void habilidad(){
    System.out.println("la mascara tiene una habilidad especial.");

}
public void mostrarinformacion(){
    System.out.println("Mascara:" + nombre);
    System.out.println("poder:" + poder);
    habilidad();

}

    
}
