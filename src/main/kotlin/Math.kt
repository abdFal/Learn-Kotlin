fun main(args: Array<String>) {
    result()
}
fun result(){
    perkalian(bilanganPertama = 80 , bilanganKedua = 10)
    perkurangan(bilanganPertama = 80 , bilanganKedua = 10)
    pertambahan(bilanganPertama = 80 , bilanganKedua = 10)
    permbagian(bilanganPertama = 80 , bilanganKedua = 10)
    modulus()
}
fun pertambahan(bilanganPertama: Int , bilanganKedua: Int){
    var hasil = bilanganPertama + bilanganKedua
    println(hasil)
}

fun perkurangan(bilanganPertama: Int , bilanganKedua: Int){
    var hasil = bilanganPertama - bilanganKedua
    println(hasil)
}

fun permbagian(bilanganPertama: Int , bilanganKedua: Int){
    println(bilanganPertama.toDouble() / bilanganKedua.toDouble())
}

fun perkalian(bilanganPertama: Int , bilanganKedua: Int){
    println(bilanganPertama * bilanganKedua)
}

fun modulus() {
    var number = 4
    println(number % 3)
}


