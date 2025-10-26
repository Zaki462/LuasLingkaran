# Circle Class

## Deskripsi
Kelas `Circle` adalah implementasi sederhana untuk menghitung luas lingkaran berdasarkan radius yang diberikan. Kelas ini menggunakan konstanta `Math.PI` untuk perhitungan yang akurat.

## Struktur Kelas

### Atribut
- `radius` (private double): Menyimpan nilai jari-jari lingkaran

### Konstruktor
```java
public Circle(double radius)
```
Membuat objek Circle dengan radius yang ditentukan.

**Parameter:**
- `radius`: Nilai jari-jari lingkaran

### Metode Publik

#### `calculateArea()`
```java
public double calculateArea()
```
Menghitung luas lingkaran menggunakan rumus: π × r²

**Return:** Luas lingkaran dalam double

#### `displayResult()`
```java
public void displayResult()
```
Menampilkan informasi radius dan luas lingkaran ke konsol.

#### `getRadius()`
```java
public double getRadius()
```
Mengambil nilai radius saat ini.

**Return:** Nilai radius

#### `setRadius(double radius)`
```java
public void setRadius(double radius)
```
Mengubah nilai radius lingkaran.

**Parameter:**
- `radius`: Nilai radius baru

### Metode Private

#### `getAreaString()`
```java
private void getAreaString()
```
Menampilkan luas lingkaran ke konsol (digunakan internal oleh `displayResult()`).

## Cara Penggunaan

### Contoh Dasar
```java
// Membuat objek Circle dengan radius 10.0
Circle circle = new Circle(10.0);

// Menampilkan informasi lingkaran
circle.displayResult();

// Output:
// Radius: 10.0
// Area: 314.1592653589793
```

### Contoh Mengubah Radius
```java
Circle circle = new Circle(10.0);
circle.displayResult();

// Ubah radius
circle.setRadius(15.0);
circle.displayResult();

// Output setelah perubahan:
// Radius: 15.0
// Area: 706.8583470577034
```

### Contoh Menggunakan Method Langsung
```java
Circle circle = new Circle(7.0);
double radius = circle.getRadius();
double area = circle.calculateArea();

System.out.println("Lingkaran dengan radius " + radius + " memiliki luas " + area);
```

## Menjalankan Program

### Compile
```bash
javac Circle.java
```

### Run
```bash
java Circle
```

### Output Program
```
--- Circle Calculation ---
Radius: 10.0
Area: 314.1592653589793

--- Updated Circle Calculation ---
Radius: 15.0
Area: 706.8583470577034
```

## Rumus Perhitungan
Luas lingkaran dihitung menggunakan rumus:

**A = π × r²**

Dimana:
- A = Luas lingkaran
- π = Pi (3.14159... / Math.PI)
- r = Radius lingkaran

## Catatan Teknis
- Kelas menggunakan `Math.PI` untuk nilai Pi yang presisi
- Semua perhitungan menggunakan tipe data `double` untuk akurasi
- Terdapat enkapsulasi dengan getter/setter untuk atribut radius

## Versi Java
Program ini kompatibel dengan Java 8 ke atas.

## Lisensi
Program ini dibuat untuk tujuan pembelajaran.