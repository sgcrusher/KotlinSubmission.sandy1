package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

   // var listgenap = listOf(1..100)

    for (item in 1..100 ) {
        if(item %2 == 0)
        println(item)
    }
        println("==================================================")



    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

    val Bulan = mapOf(
        "Jan" to "Januari",
        "Feb" to "Febuari",
        "Mar" to "Maret",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Ags" to "Agustus",
        "Sep" to "September",
        "Okt" to "Oktober",
        "Nov" to "November",
        "Des" to "Desember"
        )
    Bulan.forEach { t, u ->
        println("$t -> $u")
    }
    println("it's ${Bulan.get("Okt")} now, i was born in ${Bulan.get("Okt")} ")


}