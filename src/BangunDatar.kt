fun main() {
//    AND-WAVE5-TUGAS-C3T3
    println("1. Luas Persegi Panjang")
    println("2. Keliling Persegi Panjang")
    print("Masukkan Rumus : ")
    val rumus = readLine()!!

    println("====================")
    print("Masukkan Nilai p : ")
    val panjang = readLine()!!
    println("====================")
    print("Masukkan Nilai p : ")
    val lebar = readLine()!!

    if (rumus == "1") {
        luas(panjang, lebar)
    } else {
        keliling(panjang, lebar)
    }


}

fun keliling(panjang: String, lebar: String) {
    val keliling = 2 * (panjang.toInt() + lebar.toInt())
    print("Keliling $keliling")
}

fun luas(p: String, l: String) {
    val luas = p.toInt() * l.toInt()
    print("Luas Panjang : $luas")
}