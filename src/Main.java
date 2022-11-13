import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juegos j = new Juegos();
        System.out.println("Nombre: "+j.getNombre());
        System.out.println("Genero: "+j.getGenero());
        System.out.println("Año de publicacion: "+j.getAnio());
        System.out.println("Tamaño del juego: "+j.getPeso()+" GB");
        System.out.println("Desarrollador: "+j.getDesarrollador());
        System.out.println();

        Juegos x = new Juegos();
        x.setNombre("Call of duty");
        System.out.println("Nombre: "+x.getNombre());
        x.setGenero("Accion");
        System.out.println("Genero: "+x.getGenero());
        x.setAnio(2002);
        System.out.println("Año de publicacion: "+x.getAnio());
        x.setPeso(15);
        System.out.println("Tamaño del juego: "+x.getPeso()+" GB");
        x.setDesarrollador("Activision");
        System.out.println("Desarrollador: "+x.getDesarrollador());
        System.out.println();

    }
}