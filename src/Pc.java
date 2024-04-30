import java.util.Comparator;
public class Pc implements Comparable<Pc> {

    /*public class Pc implements Comparable<Pc>

        public int compare(Pc pc, Pc pc1) {

            int flag=0;
            if(pc.getId()>pc1.getId())
                flag=1;
            else if(pc1.getId()>pc.getId())
                flag=-1;
            else
                return flag
            return flag;
        }
    */
    private int id;
    private String cpu;
    private String ram;
    private String storage;
    private String lcdMaker;
    private boolean hasGpu;

    Pc(int id, String cpu, String ram, String storage, String lcdMaker, boolean hasGpu) {
        this.id = id;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.lcdMaker = lcdMaker;
        this.hasGpu = hasGpu;
    }

    @Override
    public int compareTo(Pc o) {
        return this.lcdMaker.compareTo(o.getLcdMaker()); //Integer.compare(this.id,o.getId());
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id=id;
    }

    public String getCpu() {

        return cpu;
    }

    public void setCpu(String cpu) {

        this.cpu = cpu;
    }

    public String getRam() {

        return ram;
    }

    public void setRam(String ram) {

        this.ram = ram;
    }

    public String getStorage() {

        return storage;
    }

    public void setStorage(String storage) {

        this.storage = storage;
    }

    public String getLcdMaker() {

        return lcdMaker;
    }

    public void setLcdMaker(String lcdMaker) {

        this.lcdMaker = lcdMaker;
    }

    public boolean hasGpu() {

        return hasGpu;
    }

    public void setGpu(boolean hasGpu) {

        this.hasGpu = hasGpu;
    }

    @Override
    public String toString() {
        return String.format("Id: %d\nCPU: %s\nRAM: %s\nStorage: %s\nLCD Maker: %s\nGPU: %b\n", id, cpu, ram, storage, lcdMaker, hasGpu);
    }

    public Object clone() {

        return new Pc(this.id ,this.ram,this.lcdMaker,this.storage,this.cpu,this.hasGpu);
    }

    public boolean equals(Object o)
    {
        Pc p=(Pc)o;
        return this.cpu.equals(p.cpu);
    }
}
