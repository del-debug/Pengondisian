public class Kondisi1 {
    public static void main(String[] args) {
        int usia = 20;
        double totalBelanja = 149000.0;

        if (usia < 18) {
            System.out.println("akses dibatasi : usia harus di atas 18 tahun");
        } else if (totalBelanja >= 150000) {
            System.out.println("akses diberikan + diskon 15%");
        } else {
            System.out.println("akses diberikan, tanpa mendapatkan diskon");
        }
    }}
