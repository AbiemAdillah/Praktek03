package praktek03;

public class TasSelempang extends Tas{
    private String jenisTas;
    
    void throttle(){
        System.out.println("Tas Santai");
    }

    public String getJenisTas() {
        return jenisTas;
    }

    public void setJenisTas(String jenisTas) {
        this.jenisTas = jenisTas;
    }
    
    
}
