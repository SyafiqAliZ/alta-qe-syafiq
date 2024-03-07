package OOP.EasyChallange1;
public class PersegiPanjang {
// Panjang & Lebar
    public PersegiPanjang(int nilaipanjang, int nilailebar){
        this.Panjang = nilaipanjang;
        this.Lebar = nilailebar;
    }
    int Panjang;
    int Lebar;

    public void luas(){
        int luaspersegipanjang = this.Panjang * this.Lebar;
        System.out.println("Luas Persegi Panjang adalah "+ luaspersegipanjang);
    }
    public void keliling(){
        int kelilingpersegipanjang = this.Panjang*2 + this.Lebar*2;
        System.out.println("Keliling Persegi Panjang adalah "+kelilingpersegipanjang);
    }

}
