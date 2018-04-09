package praktek03;
public class TasAksi {
    public static void main(String[] args) {
      Tas s = new Tas();
     s.setMerk("Eiger");
     s.setKapasitas("25 L");
     s.setHarga(300000);
     
     s.cetakInfo();
     
     System.out.print("Merknya \t: ");
     System.out.println(s.getMerk());
     System.out.print("Kapasitasnya \t: ");
     System.out.println(s.getKapasitas());
      System.out.print("Harganya \t: ");
     System.out.println(s.getHarga());
    
   
    }
    
 
}
