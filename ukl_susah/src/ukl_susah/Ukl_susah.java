package ukl_susah;

public class Ukl_susah {

    public static void main(String[] args) {
        System.out.println("Program Mencari Nilai Yang Sering Muncul");
        System.out.println("----------------------------------------");
        int[] halo = {3, 7, 3, 1, 7, 7, 5, 6, 7, 8, 9, 4, 1, 1, 1, 1, 7, 7, 7};

        int palingseringmuncul = 0;
        int banyaknya = 0;

        for (int i = 0; i < halo.length; i++) {
            palingseringmuncul = halo[i];
            int a = 0;

            for (int j = 0; j < halo.length; j++) {
                if (halo[i] == halo[j]) {
                a++;
                }
            }

            if
                    (a > banyaknya) {
                banyaknya = a;

            }
        }

        System.out.println("Nilai yang paling sering muncul adalah " + palingseringmuncul + " sebanyak " + banyaknya + " kali");
    }
}
