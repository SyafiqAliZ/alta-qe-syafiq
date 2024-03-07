package OOP.EasyChallange2;
public class Kubus {
// Sisi
 public Kubus(double nilaisisi) { this.Sisi = nilaisisi; }
 double Sisi;
 public void Volume(){
     double volumekubus = Math.pow(this.Sisi,3);
     System.out.println("Volume Kubus adalah: "+volumekubus);
 }
}
