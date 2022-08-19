package clases;

// CLASE DIRECTOR.
public class Tecnico {
    private PCBuilder pcBuilder;
 
    public void setPCBuilder(PCBuilder pb) { 
        pcBuilder = pb; 
    }
    
    public PC getPC() { 
        return pcBuilder.getPC(); 
    }
 
    public void construirPC() {
       pcBuilder.crearNuevaPC();
       pcBuilder.buildCpu();
       pcBuilder.buildGpu();
       pcBuilder.buildRam();
       pcBuilder.buildDisco();
       pcBuilder.buildMotherboard();
       pcBuilder.buildCase();
    }
}
