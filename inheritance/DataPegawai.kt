package inheritance

open class DataPegawai {
    var nama: String = ""
    var usia: Int = 0
    var gender: String = ""
    var jam1: Int = 0
    var jam2: Int = 0
    var gaji: Int = 0
    var bidang: String = ""

    fun data() {
        println("Nama $nama jenis kelamin $gender berusia $usia ")
    }
    fun kerja() {
        println("bekerja di bagian $bidang dimulai dari jam $jam1 hingga $jam2")
    }
    fun upah() {
        println("dengan bayaran $gaji perbulan")
    }
}