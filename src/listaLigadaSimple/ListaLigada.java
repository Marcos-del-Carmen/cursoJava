package listaLigadaSimple;

public class ListaLigada {
    private Nodo inicio;
    private Nodo fin;
    
    public ListaLigada(){
        
    }
    
    public ListaLigada(Nodo inicio, Nodo fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public boolean listaVacia(){
        if(inicio == null) {
            return true;
        }
        return false;
    }
    
    public void agregarNum(int valor){
        Nodo aux; 
        if(listaVacia()){
            aux = new Nodo(valor); // instanceamos un nuevo nodo en el metodo de agregar para un numero
            inicio = fin = aux;
        } else {
            aux = new Nodo(valor);
            fin.setSiguiente(aux);
            fin = aux;
        }
    }
    
    // En este metododo podemos resivir un objeto de tipo Alumno que nos permite tener matricula, nombre, apellido y edad
    public void agregar(Alumno alumno) {               
        Nodo aux;
        if (listaVacia()) {
            // Si la lista está vacía, el nuevo nodo se convierte en el inicio y el fin.
            aux = new Nodo(alumno); // nuevo nodo
            inicio = fin = aux;
        } else {
            // Si la lista no está vacía, se agrega el nuevo nodo al final.
            aux = new Nodo(alumno);
            fin.setSiguiente(aux);
            fin = aux;
        }
    }
    
    public void mostrarNum() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.getValor());
            actual = actual.getSiguiente();
        }
    }
    
    public void mostrarAlumnos() {
        Nodo actual = inicio;
        while (actual != null) {
            Alumno alumno = actual.getAlumno();
            System.out.println(   
                                  "Matricula: " + alumno.getMatricula() +"\n"
                                + "Nombre completo: " + alumno.getNombre() + " " + alumno.getApellido()+"\n"
                                + "Edad: " + alumno.getEdad()+"\n");
            actual = actual.getSiguiente();
        }
    }
    
    
    
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }  
    
}
