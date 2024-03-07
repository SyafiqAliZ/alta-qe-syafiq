package OOP.EasyChallange2;
public class Balok {
// Panjang, Lebar, & Tinggi
    public Balok(double panjang, double lebar, double tinggi) {
        this.Panjang = panjang;
        this.Lebar = lebar;
        this.Tinggi = tinggi;
    }
    double Panjang;
    double Lebar;
    double Tinggi;
    public void Volume(){
        double volumebalok = this.Panjang * this.Lebar * this.Tinggi;
        System.out.println("Volume Balok adalah: "+volumebalok);
    }
}
