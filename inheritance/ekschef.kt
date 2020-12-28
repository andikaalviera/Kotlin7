package inheritance

class ekschef : DataPegawai() {
    var resep: String = ""

    fun menu() {
        println("$nama memiliki menu $resep setiap hari")
    }
}