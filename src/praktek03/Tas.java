package praktek03;

public class Tas {
    private String merk;
    private String kapasitas;
    private double harga;
    private String jenistas;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                           "Kapasitas \t: "+kapasitas+"\n"+
                           "Harga \t: "+harga+"\n"+"Jenis \t:"+jenistas);
    }

    public String getJenistas() {
        return jenistas;
    }

    public void setJenistas(String jenistas) {
        this.jenistas = jenistas;
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

    boolean getjenistas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
