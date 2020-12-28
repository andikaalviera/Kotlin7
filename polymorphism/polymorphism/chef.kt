package polymorphism

class chef : DataPegawai () {
    var masak: String = ""

    fun ahli() {
        println("masakan spesial yang dimasak oleh $nama adaah $masak")
    }

    override fun data() {
        println("perkenalkan ini adalah koki di restoran ini bernama $nama dan berusia masih $usia tahun")
    }
}