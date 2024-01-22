package seccion10;

import java.util.Date;

public class Cliente extends Persona {
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contCliente;

    public Cliente() {
        this.fechaRegistro = fechaRegistro;
        this.vip = false;
    }
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char sexo, int edad, String direccion) {
        super(nombre, sexo, edad, direccion);
        this.idCliente = ++Cliente.contCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    @Override 
    public String detallePersona(){
        return "Cliente {\n"
                + "\tidcliente : " + this.idCliente + ",\n"
                + "\tfechaRegistro : " + this.fechaRegistro + ",\n"
                + "\tvip       : " + this.vip + ",\n"
                + super.detallePersona();
    }
    @Override
    public String toString() {
        return "Cliente { " 
                + "\n    idCliente : " + idCliente 
                + " ,\n    fechaRegistro : " + fechaRegistro 
                + " ,\n    vip : " + vip 
                + super.toString();
    }
    
    
}
