package clases;

// CONCRETE BUILDER.
public class PCEcoBuilder extends PCBuilder {
    @Override
    public void buildCpu() { 
        pc.setCpu("i3"); 
    }
    
    @Override
    public void buildGpu() { 
        pc.setGpu("gtx 1050"); 
    }
    
    @Override
    public void buildRelleno() { 
        pc.setRam("8gb"); 
    }
    @Override
    public void buildDisco() { 
        pc.setDisco("HDD 1tb"); 
    }
    
    @Override
    public void buildMotherboard() { 
        pc.setMotherboard("b450"); 
    }
    
    @Override
    public void buildCase() { 
        pc.setCase("4en1 PlanetPC"); 
    }
}

