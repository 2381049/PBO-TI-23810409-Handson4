public class contohParameterMethod {

    // Method dengan satu paratmeter
    public static int kaliDua(int angka) {
        return angka * 2;
    }

    // Methdo dengan beberapa parameter
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        int hasiliKaliDua = kaliDua(5); // Memanggil method dengan argumen 5
        System.out.println("5 x 2 = " + hasiliKaliDua);

        double luasSegitiga = hitungLuasSegitiga(4, 6); // Memanggil method dengan argumen 4 dan 6
        System.out.println("Luas segitga: " + luasSegitiga);
    }
}
