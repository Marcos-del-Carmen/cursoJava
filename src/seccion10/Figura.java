package seccion10;

public abstract class Figura {
    private String figura;
    
    public Figura(String figura){
        this.figura = figura;
    }
    
    public abstract void dibujar();
    
    public String getFigura(){
        return this.figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        return "Figura { \n"
                + "    figura : " + figura 
                + "\n}\n";
    }    
}
