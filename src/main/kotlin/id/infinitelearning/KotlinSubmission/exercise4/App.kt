package id.infinitelearning.KotlinSubmission.exercise4

    fun sayHalo(nama: String){
        if (nama.isBlank()){
            throw Throwable("is Blank") // Throwable adalah all exception CMIIW
        } else {
            println("Hallo $nama")
        }
    }
fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    //sayHalo("") //eror
    //sayHalo("sandy") // tidak eror
    try {
        sayHalo("sandy")
        sayHalo("") // program eror
        sayHalo("sandy") // tidak tercetak
    }catch (error: Throwable ){}
    println("Terjadi Error")



}