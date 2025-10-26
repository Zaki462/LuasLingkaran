/**
 * Kelas Circle merepresentasikan lingkaran dengan radius tertentu.
 * Kelas ini menyediakan fungsionalitas untuk menghitung luas lingkaran
 * dan menampilkan informasi tentang lingkaran.
 *
 * @author Your Name
 * @version 1.0
 * @since 2025
 */
public class Circle {
    /**
     * Radius lingkaran dalam satuan unit.
     */
    private double radius;

    /**
     * Konstruktor untuk membuat objek Circle dengan radius yang ditentukan.
     *
     * @param radius nilai jari-jari lingkaran yang akan digunakan (harus positif)
     */
    public Circle(double radius) {
        this.setRadius(radius);
    }

    /**
     * Menghitung luas lingkaran menggunakan rumus: π × r²
     * Menggunakan konstanta Math.PI untuk perhitungan yang akurat.
     *
     * @return luas lingkaran dalam bentuk double
     */
    public double calculateArea() {
        double area = Math.PI * getRadius() * getRadius();
        return area;
    }

    /**
     * Menampilkan informasi lengkap tentang lingkaran ke konsol.
     * Informasi yang ditampilkan meliputi radius dan luas lingkaran.
     */
    public void displayResult() {
        System.out.println("Radius: " + getRadius());
        getAreaString();
    }

    /**
     * Menampilkan luas lingkaran ke konsol.
     * Method private yang digunakan secara internal oleh displayResult().
     */
    private void getAreaString() {
        System.out.println("Area: " + calculateArea());
    }

    /**
     * Method main untuk menjalankan program dan mendemonstrasikan
     * penggunaan kelas Circle dengan berbagai radius.
     *
     * @param args argumen command line (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Circle c = new Circle(10.0);

        System.out.println("--- Circle Calculation ---");
        c.displayResult();

        // Simulasikan perubahan radius
        c.setRadius(15.0);
        System.out.println("\n--- Updated Circle Calculation ---");
        c.displayResult();
    }

    /**
     * Mengambil nilai radius lingkaran saat ini.
     *
     * @return nilai radius dalam bentuk double
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Mengubah nilai radius lingkaran.
     *
     * @param radius nilai radius baru yang akan diset (harus positif)
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}