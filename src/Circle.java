/**
 * Kelas Circle merepresentasikan lingkaran dengan radius tertentu.
 * Kelas ini menyediakan fungsionalitas untuk menghitung luas lingkaran,
 * keliling lingkaran, dan diameter lingkaran.
 *
 * @author Your Name
 * @version 1.1
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
     * Menghitung keliling lingkaran menggunakan rumus: 2 × π × r
     * Menggunakan konstanta Math.PI untuk perhitungan yang akurat.
     *
     * @return keliling lingkaran dalam bentuk double
     */
    public double calculateCircumference() {
        return 2 * Math.PI * getRadius();
    }

    /**
     * Menghitung diameter lingkaran menggunakan rumus: 2 × r
     *
     * @return diameter lingkaran dalam bentuk double
     */
    public double calculateDiameter() {
        return 2 * getRadius();
    }

    /**
     * Menampilkan informasi lengkap tentang lingkaran ke konsol.
     * Informasi yang ditampilkan meliputi radius, diameter, keliling, dan luas lingkaran.
     */
    public void displayResult() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Diameter: " + calculateDiameter());
        System.out.println("Circumference: " + calculateCircumference());
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
     * Membandingkan ukuran lingkaran ini dengan lingkaran lain.
     *
     * @param other lingkaran lain yang akan dibandingkan
     * @return true jika lingkaran ini lebih besar, false jika tidak
     */
    public boolean isLargerThan(Circle other) {
        return this.calculateArea() > other.calculateArea();
    }

    /**
     * Method main untuk menjalankan program dan mendemonstrasikan
     * penggunaan kelas Circle dengan berbagai radius dan fitur baru.
     *
     * @param args argumen command line (tidak digunakan dalam program ini)
     */
    public static void main(String[] args) {
        Circle c = new Circle(10.0);

        System.out.println("--- Circle Calculation ---");
        c.displayResult();

        // Simulasikan perubahan radius
        c.setRadius(11.0);
        System.out.println("\n--- Updated Circle Calculation ---");
        c.displayResult();

        // Demonstrasi fitur baru: perbandingan lingkaran
        System.out.println("\n--- Circle Comparison ---");
        Circle c2 = new Circle(12.0);
        System.out.println("Circle 1 radius: " + c.getRadius());
        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Circle 1 is larger than Circle 2: " + c.isLargerThan(c2));
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