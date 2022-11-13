public class Juegos {
    String nombre;
    String genero;
    int anio;
    int peso;
    String desarrollador;

    public Juegos() {
        nombre = "Resident Evil 4";
        genero = "Accion - horror";
        anio = 2010;
        peso = 50;
        desarrollador = "Capcom";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    //Metodos
    public void jugar() {}
    public void cargar() {}
    public void guardar () {}

}
