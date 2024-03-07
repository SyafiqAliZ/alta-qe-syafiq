package OOP.EasyChallange1;
public class Segitiga {
// Alas & Tinggi
    public Segitiga(double nilaialas, double nilaitinggi){
        this.Alas = nilaialas;
        this.Tinggi = nilaitinggi;
    }
    double Alas;
    double Tinggi;

    public void luas(){
        double luassegitiga = this.Alas * this.Tinggi / 2;
        System.out.println("Luas Segitiga adalah: "+luassegitiga);
    }
    public void keliling(){
        double miring = Math.sqrt(Math.pow(this.Alas,2) + Math.pow(this.Tinggi,2));
        double kelilingsegitiga = this.Alas + this.Tinggi + miring;
        System.out.println("Keliling segitiga adalah " + kelilingsegitiga);
    }


}

