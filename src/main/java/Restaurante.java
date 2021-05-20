import java.util.Date;
import java.util.Objects;

public class Restaurante {
    String nombre;
    String descripcion;
    String tipo;
    String direccion;
    Date horario;

    public Restaurante() {
    }

    public Restaurante(String nombre, String descripcion, String tipo, String direccion, Date horario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public Restaurante setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Restaurante setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Restaurante setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }

    public Restaurante setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public Date getHorario() {
        return horario;
    }

    public Restaurante setHorario(Date horario) {
        this.horario = horario;
        return this;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", horario=" + horario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(descripcion, that.descripcion) && Objects.equals(tipo, that.tipo) && Objects.equals(direccion, that.direccion) && Objects.equals(horario, that.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, tipo, direccion, horario);
    }
}
