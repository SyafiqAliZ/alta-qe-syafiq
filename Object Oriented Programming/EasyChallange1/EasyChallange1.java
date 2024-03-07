package OOP.EasyChallange1;
public class EasyChallange1 {
// 1 - Easy Challange (Menghitung Luas dan Keliling)
    public static void main(String[] args) {
        Persegi persegi = new Persegi(4);
        persegi.luas();
        persegi.keliling();

        Segitiga segitiga = new Segitiga(3,4);
        segitiga.luas();
        segitiga.keliling();

        PersegiPanjang persegipanjang = new PersegiPanjang(7,8);
        persegipanjang.luas();
        persegipanjang.keliling();
    }
}
