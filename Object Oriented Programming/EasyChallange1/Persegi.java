package OOP.EasyChallange1;
public class Persegi {
// Sisi
    public Persegi(int nilaisisi) {
       this.sisi =   nilaisisi;
    }

   int sisi;

    public void luas() {
      int luasArea = this.sisi * this.sisi;
      System.out.println("Luas Persegi adalah "+luasArea);
    }
    public void keliling() {
      int keliling = this.sisi * 4;
        System.out.println("Keliling Persegi adalah "+ keliling);
    }
}

