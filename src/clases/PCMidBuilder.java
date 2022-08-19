package clases;

// CONCRETE BUILDER.
public class PCMidBuilder extends PCBuilder {
    @Override
    public void buildCpu() { 
        pc.setCpu("i5"); 
    }
    
    @Override
    public void buildGpu() { 
        pc.setGpu("gtx 1660"); 
    }
    
    @Override
    public void buildRelleno() { 
        pc.setRam("16gb"); 
    }
    @Override
    public void buildDisco() { 
        pc.setDisco("SSD 512gb"); 
    }
    
    @Override
    public void buildMotherboard() { 
        pc.setMotherboard("m270"); 
    }
    
    @Override
    public void buildCase() { 
        pc.setCase("4 en 1 Deluxe"); 
    }
}
