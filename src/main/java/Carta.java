import java.util.Objects;

public class Carta {
    String nombre;
    String descripcion;
    double precio;
    String foto;
    String disponibilidad;
    String ingredientes;

    public Carta() {
    }

    public Carta(String nombre, String descripcion, double precio, String foto, String disponibilidad, String ingredientes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.foto = foto;
        this.disponibilidad = disponibilidad;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public Carta setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Carta setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Carta setPrecio(double precio) {
        this.precio = precio;
        return this;
    }

    public String getFoto() {
        return foto;
    }

    public Carta setFoto(String foto) {
        this.foto = foto;
        return this;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public Carta setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
        return this;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public Carta setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Double.compare(carta.precio, precio) == 0 && Objects.equals(nombre, carta.nombre) && Objects.equals(descripcion, carta.descripcion) && Objects.equals(foto, carta.foto) && Objects.equals(disponibilidad, carta.disponibilidad) && Objects.equals(ingredientes, carta.ingredientes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, precio, foto, disponibilidad, ingredientes);
    }
}
