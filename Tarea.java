public class Tarea {
 private String nombre;
 private String descripcion;
 private int estado;
    public Tarea(String nombre, String descripcion, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return  this.estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String toString() {
        return ("Tarea: "+getNombre()+"\n"+
                "Descripcion: "+getDescripcion()+"\n"+
                "Estado: "+getEstado());

    }
}
