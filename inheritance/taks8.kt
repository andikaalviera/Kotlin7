package polymorphism

fun main() {

    val jon = ekschef()
    jon.nama = "jon"
    jon.usia = 27
    jon.gender = "laki"
    jon.data()
    jon.bidang = "EKSEKUTIF CHEF"
    jon.jam1 = 9
    jon.jam2 = 21
    jon.kerja()
    jon.gaji = 4000000
    jon.upah()
    jon.resep = "beef"
    jon.menu()

    println()

    val andika = chef()
    andika.nama = "andika"
    andika.usia = 21
    andika.gender = "laki"
    andika.data()
    andika.bidang = "CHEF"
    andika.jam1 = 9
    andika.jam2 = 21
    andika.kerja()
    andika.gaji = 4000000
    andika.upah()
    andika.masak = "ramen"
    andika.ahli()

    println()

    val nia = kasir()
    nia.nama = "nia"
    nia.usia = 23
    nia.gender = "laki"
    nia.data()
    nia.bidang = "Pelayan"
    nia.jam1 = 9
    nia.jam2 = 21
    nia.kerja()
    nia.gaji = 3500000
    nia.upah()
    nia.nomer = 3
    nia.tempat()

    println()

    val andri = pelayan()
    andri.nama = "andri"
    andri.usia = 23
    andri.gender = "laki"
    andri.data()
    andri.bidang = "Pelayan"
    andri.jam1 = 9
    andri.jam2 = 21
    andri.kerja()
    andri.gaji = 3500000
    andri.upah()
    andri.attitude = "sangat ramah"
    andri.tanggap = "cepat"
    andri.tatakrama()

    println()

    val adi = sortir()
    adi.nama = "adi"
    adi.usia = 20
    adi.gender = "laki"
    adi.data()
    adi.bidang = "Sortir BARANG"
    adi.jam1 = 9
    adi.jam2 = 21
    adi.kerja()
    adi.gaji = 3500000
    adi.upah()
    adi.barang = "Ikan"
    adi.jumlah = 40
    adi.nomer = 4
    adi.total()

    println()

    val susi = resepsionis()
    susi.nama = "susi"
    susi.usia = 24
    susi.gender = "perempuan"
    susi.data()
    susi.bidang = "resepsionis"
    susi.jam1 = 10
    susi.jam2 = 21
    susi.kerja()
    susi.gaji = 3000000
    susi.upah()
    susi.bahasa = "Inggris, Jerman, Prancis, Jawa, Sunda"
    susi.ucapan()

    println()

    val ara = PencuciPiring()
    ara.nama = "ara"
    ara.usia = 21
    ara.gender = "perempuan"
    ara.data()
    ara.bidang = "pencuci piring"
    ara.jam1 = 10
    ara.jam2 = 22
    ara.kerja()
    ara.gaji = 4000000
    ara.upah()
    ara.teliti = "bersih"
    ara.detail()

    println()

    var aza = deliver()
    aza.nama = "aza"
    aza.usia = 24
    aza.gender = "laki"
    aza.data()
    aza.bidang = "pengantar makanan"
    aza.jam1 = 10
    aza.jam2 = 22
    aza.kerja()
    aza.gaji = 4000000
    aza.upah()
    aza.kendaraan = "motor"
    aza.alat()

    println()

    val aga = barista()
    aga.nama = "aga"
    aga.usia = 24
    aga.gender = "laki"
    aga.data()
    aga.bidang = "barista"
    aga.jam1 = 10
    aga.jam2 = 22
    aga.kerja()
    aga.gaji = 4000000
    aga.upah()
    aga.jenis = "Latte"
    aga.minum()
}