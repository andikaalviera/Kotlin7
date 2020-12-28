package polymorphism

class ekschef : DataPegawai() {
    var resep: String = ""

    fun menu() {
        println("$nama memiliki menu $resep setiap hari")
    }

    override fun data () {
        println("perkenalkan nama ketua chef disini adalah $nama dan usinya masih $usia tahun" )
    }
}