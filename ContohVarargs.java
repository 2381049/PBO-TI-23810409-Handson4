public class ContohVarargs {

    public static int jumlahkan(int ... angka) {
        int total = 0;
        for (int nlai : angka) {
            total += nlai;
        }
        return total;
    }

    public static void main(String[] args) {
        int hasil1 = jumlahkan(1, 2, 3);
        System.out.println("Hasil 1: " + hasil1); // Output: hasil 1:  6

        int hasil2 = jumlahkan(4, 5);
        System.out.println("Hasi; 2: " + hasil2); // Output: hasil 2: 9

        int hasil3 = jumlahkan( );
        System.out.println("Hasil 3: " + hasil3); // Output: Hasil 3: 0
    }
}
