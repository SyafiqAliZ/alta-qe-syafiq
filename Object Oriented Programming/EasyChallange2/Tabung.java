package OOP.EasyChallange2;

public class Tabung {
// r & t
   public Tabung(double r, double t){
       this.R = r;
       this.T = t;
   }
   double R;
   double T;

   public void Volume() {
       double volumetabung = Math.PI * Math.pow(this.R, 2) * this.T;
       System.out.println("Volume Tabung adalah: "+Math.ceil(volumetabung));
   }
}
