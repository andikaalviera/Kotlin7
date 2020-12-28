package polymorphism

class pelayan : DataPegawai () {
    var attitude: String = ""
    var tanggap: String = ""

    fun tatakrama() {
        println("$nama memiliki attitude $attitude dan $tanggap dalam melayani pelanggan")
    }
}