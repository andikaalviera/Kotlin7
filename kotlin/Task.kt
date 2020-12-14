fun main() {
    //variable
    val FirstName1 = "Andi"
    val LastName1 = "Budiman"
    val Age1 = 34

    println(FirstName1)
    println(LastName1)
    println(Age1)

    val FirstName2 = "Rudi"
    val LastName2 = "Setiawan"
    val Age2 = 25

    println(FirstName2)
    println(LastName2)
    println(Age2)

    //array
    val firstname = arrayListOf<String>()
    val lastname = arrayListOf<String>()
    val age = arrayListOf<Int>()

    firstname.add("Andi")
    lastname.add("Setiawan")
    age.add(25)

    for (first in firstname) {
        println(first)
    }
    for (last in lastname) {
        println(last)
    }
    for (a in age) {
        println(a)
    }

    //array2
    val andiArray = arrayListOf<Any>()
    andiArray.add("Andi")
    andiArray.add("Budiman")
    andiArray.add(34)
    for (andi in andiArray) {
        println(andi)
    }

    //array3
    val mhsArray = arrayListOf<ArrayList<Any>>()
    mhsArray.add(andiArray)
    mhsArray.add(arrayListOf("Rudi", "Setiawan", 25))
    for (item in mhsArray) {
        for (i in item) {
            println(i)
        }
    }

    //Data class
    val andi = User("Andi", "Budiman", 34)
    val rudi = User(age = 25, lastName = "Setiawan", firstName = "Rudi")
    val dedi = User()
    dedi.age = 35
    dedi.firstName = "Dedi"

    val andi2 = andi.copy(age = 40)

    println(andi)
    println(rudi)
    println(dedi)

    println(andi.lastName)
    println(andi2)

    //data class array
    val mhsAmikom = arrayListOf<User>()
    mhsAmikom.add(andi)
    mhsAmikom.add(rudi)
    mhsAmikom.add(dedi)
    mhsAmikom.add(User("ferdi", "Setiawan", 45))
    for (mhs in mhsAmikom)
        println(mhs)
}
