package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        /*
        1. SORU
    Girilen desimal değeri binary değere çeviren metodu oluşturunuz.
        Örnek: 12 = 1 1 0 0

         */

        System.out.println("BIR SAYI GIRINIZ: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        System.out.println("GIRILEN IFADENIN BİNARY KARSILIGI :"+binaryConvert(sayi));
    }

    public static List<Integer> binaryConvert(int sayi) {

        List<Integer> binaryList = new ArrayList<>();

        while (sayi>=1){
            binaryList.add(sayi % 2);
            sayi/= 2;  // sayi = sayi/2;
        } // 0 0 1 1

        // Collections.reverse(binaryList); ==> ters cevirmeyi bu sekilde de yapabilirdik

        List<Integer> tersBinaryList = new ArrayList<>();

        for (int i = binaryList.size()-1; i >=0 ; i--) { // for loop 3 tenn baslayacak binarylistin son indexi

            tersBinaryList.add(binaryList.get(i));

        }


        return tersBinaryList;
}
}