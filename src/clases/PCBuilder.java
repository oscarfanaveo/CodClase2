package clases;

// ABSTRACT BUILDER.
public abstract class PCBuilder {
    protected PC pc;
 
    public PC getPC() { 
        return pc; 
    }
    
    public void crearNuevaPC() { 
        pc = new PC(); 
    }
 
    public abstract void buildCpu();
    public abstract void buildGpu();
    public abstract void buildRam();
    public abstract void buildDisco();
    public abstract void buildMotherboard();
    public abstract void buildCase();
}
