/*
 * En esta nueva seccion tenemos una clase persona en la cual estoy entendiendo como usar
 * protected y clases padres con herencia. Ya que esto es muy util para reutilizar parametros
 * que se repiten en otras clases o tablas.
 */
package seccion10;

import java.util.Objects;

public class Persona {
    protected String nombre;
    protected char sexo;
    protected int edad;
    protected String direccion;

    public Persona(){
        this.nombre = "?";
        this.sexo = '?';
        this.edad = 0;
        this.direccion = "?";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(String nombre, char sexo, int edad, String direccion) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String detallePersona(){        
        return    "\tnombre    : " + this.nombre + ", \n"
                + "\tsexo      : " + this.sexo + ",\n"
                + "\tedad      : " + this.edad + ",\n"
                + "\tdireccion : " + this.direccion + " \n}\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }
           
    @Override
    public String toString() {
        return "\n"
                + "    nombre : " + nombre 
                + " ,\n    sexo : " + sexo 
                + " ,\n    edad : " + edad 
                + " ,\n    direccion : " + direccion 
            + "\n}\n";
    }

    
}
