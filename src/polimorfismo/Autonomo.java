package polimorfismo;

public class Autonomo extends Trabajador{

    int pHora, hora;
    int saldoMes, saldoTotal;

    public Autonomo(String nombre, String apellido, String dni, int pHora, int horas) {
        super(nombre, apellido, dni);
        this.pHora = pHora;
        this.hora = horas;
    }

    @Override
    public void calcularSaldoMes() {
        saldoMes = (pHora*hora)/12;
        saldoTotal = pHora * hora;
    }

    public int getpHora() {
        return pHora;
    }

    public int getHora() {
        return hora;
    }

    public int getSaldoMes() {
        return saldoMes;
    }

    public int getSaldoTotal() {
        return saldoTotal;
    }

    @Override
    public String mostrarDatos() {
        String mensaje = "con un precio hora de %d y un salario anual de %d";
        return super.mostrarDatos() + String.format(mensaje,getpHora(),getSaldoTotal());
    }
}
