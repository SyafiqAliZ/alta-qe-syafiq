package OOP.MediumChallange4;
public class Harga {

    public static float hitungongkir(int p, int l, int t, float weight) {

        int baseprice = 5000;
        int volume = p * l * t;
        float price = baseprice * volume / 50f * weight;
        float price2;
        float price3;

        if (volume <= 50f && weight <= 1) {
            return baseprice;
        } else if (volume < 50f) {
            return price2 = baseprice * 1 * weight;
        } else if (weight < 1) {
            return price3 = baseprice * volume/50f * 1;
        } else {
            return price; }
        }
    }



