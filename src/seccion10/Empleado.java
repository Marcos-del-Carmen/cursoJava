package seccion10;
/**
 * Esta es mi clase hija en la cual estoy heredando de la clase padre "Persona"
 * 
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contEmpleado;

    public Empleado() {
        this.sueldo = 0.0;
    }

    public Empleado(int idEmpleado, double sueldo, String nombre) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public Empleado(double sueldo, String nombre, char sexo, int edad, String direccion) {
        super(nombre, sexo, edad, direccion);
        this.idEmpleado = ++Empleado.contEmpleado;
        this.sueldo = sueldo;
    }

    @Override 
    public String detallePersona(){
        return "Empleado { \n "
                + "\tidEmpleado: " + this.idEmpleado + ",\n"
                + "\tsueldo    : $" + this.sueldo + ",\n"                
                + super.detallePersona();
    }
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContEmpleado() {
        return contEmpleado;
    }

    public static void setContEmpleado(int contEmpleado) {
        Empleado.contEmpleado = contEmpleado;
    }
    
    @Override
    public String toString() {
        return "Empleado { " 
                + "\n    idEmpleado : " + idEmpleado 
                + ",\n    sueldo : $" + sueldo                 
                + "," + super.toString();
    }
    
    
}
