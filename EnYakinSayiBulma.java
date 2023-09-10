import java.util.Arrays;

public class EnYakinSayiBulma {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;

        int enKucukEnYakin = Integer.MAX_VALUE;
        int enBuyukEnYakin = Integer.MIN_VALUE;

        for (int eleman : dizi) {
            if (eleman < girilenSayi && girilenSayi - eleman < girilenSayi - enKucukEnYakin) {
                enKucukEnYakin = eleman;
            } else if (eleman > girilenSayi && eleman - girilenSayi < enBuyukEnYakin - girilenSayi) {
                enBuyukEnYakin = eleman;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(dizi));
        System.out.println("Girilen Sayı: " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enKucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enBuyukEnYakin);
    }
}