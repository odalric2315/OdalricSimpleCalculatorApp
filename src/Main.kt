fun main() {
    print("Masukkan nilai pertama : ")
    val nilai1: Double = readLine()?.toDouble()!!
    print("Masukkan nilai kedua : ")
    val nilai2: Double = readLine()?.toDouble()!!
    println("Hasil Pembagian dari perhitungan $nilai1 dan $nilai2 adalah = ${nilai1/nilai2}")
}