package modelo;

public class Disco {

    private int id;
    private String nombre;
    private String banda;
    private String genero;
    private String formato;
    private int precio;

    public Disco() {
    }

    public Disco(int id) {
        this.id = id;
    }

    public Disco(String nombre, String banda, String genero, String formato, int precio) {
        this.nombre = nombre;
        this.banda = banda;
        this.genero = genero;
        this.formato = formato;
        this.precio = precio;
    }

    public Disco(int id, String nombre, String banda, String genero, String formato, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.banda = banda;
        this.genero = genero;
        this.formato = formato;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Disco{"
                + "id = " + id
                + ", nombre = " + nombre
                + ", banda = " + banda
                + ", genero = " + genero
                + ", formato = " + formato
                + ", precio = " + precio
                + '}';
    }
}
