package praktek03;

public class Tas {
    private String merk;
    private String kapasitas;
    private double harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                           "Kapasitas \t: "+kapasitas+"\n"+
                           "Harga \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
