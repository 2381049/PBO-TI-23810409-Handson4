public class ContohOverLoading {
    public static double hitungLuas(double sisi) {
        return sisi * sisi;
    }

    //Method untuk menghitung luas persegi panjang
    public static double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }

    // Method untuk menghitung luas lingkarang
    public static double hitungLuas(double jarijari, boolean isLingkaran) { // Parameter tambahan untuk membedakan
        if (isLingkaran) {
            return Math.PI * jarijari * jarijari;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        double luasPersegi = hitungLuas(5);
        System.out.println("Luas Persegi: " + luasPersegi);

        double luasPersegiPanjang = hitungLuas(4, 6);
        System.out.println("Luas Persegi: " + luasPersegiPanjang);

        double luasLingkaran = hitungLuas(3, true);
        System.out.println("Luas Lingkaran: " + luasLingkaran);
    }
}