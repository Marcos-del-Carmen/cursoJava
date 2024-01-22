package seccion10;
public enum Continentes 
{
    AFRICA(54),
    EUROPA(50),
    ASIA(48),
    AMERICA(48),
    OCEANIA(14);
    
    private final int paises;
    
    private Continentes(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
