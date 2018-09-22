package polimorfismo;

public abstract class Trabajador {

    String nombre, apellido, dni;

    public Trabajador(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String mostrarDatos(){

        String mensaje = "Los datos del trabajador son Nombre: %s Apellido: %s DNI: %s y es de tipo %s ";
        return String.format(mensaje,getNombre(),getApellido(),getDni(),getClass().getSimpleName()) ;
    }

    public abstract void calcularSaldoMes();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
