fun main() {

    val andika : Human = Human("andika")
    val andi : Human = Human("andi")

    andika.email = "andika@gmail.com"
    andika.address = "Tangerang, banten"

    andi.email = "andi@gmail.com"
    andi.address = "bandung, jawabarat"

    andika.talk()
    andi.talk()

    andika.introduce()
    println(andika.verify("andika@gmail.com"))

    println(Andika.name)

    val ujang : Andika = Andika
    println(ujang.nationality)
}