package listaLigadaSimple;

class Nodo {
    Alumno alumno;
    Nodo siguiente;
    
    int valor;
    // con este constructor resivimos un numero
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
    // con este constructor resivimos un objeto de la clase Alumno
    public Nodo(Alumno alumno) {
        this.alumno = alumno;
        this.siguiente = null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    
}
