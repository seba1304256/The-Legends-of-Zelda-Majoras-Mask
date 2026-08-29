import java.util.Scanner;

public class Menu{
    public static void main(String[] args){
        Scanner caracter_consola = new  Scanner(System.in);
        Mascaras mascaras = null;
        int opcion;
        do{
            System.out.println("*******MAJORA S MASK ******");
            System.out.println("1. mascara Goro");
            System.out.println("2. mascara Deku");
            System.out.println("3. mascara Zora");
            System.out.println("4. mostrar informacion");
            System.out.println("5. Usar habilidad");
            System.out.println("6. salir");
            System.out.println("Seleccione una opcion:");
            opcion = caracter_consola.nextInt();
            switch (opcion){
                case 1:
                    mascaras = new M_Goro();
                    System.out.println("has seleccionado la mascara Goro");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    if (mascaras != null){
                        mascaras.mostrarinformacion();}
                    else {
                        System.out.println("primero debes seleccionar una mascaras");
                    }

                    
                    break;
                default:
                    System.out.println("opciopn no valida");

            }


        }while (opcion != 6 );
        caracter_consola.close ();

    }

}
