//fun main(args: Array<String>) {
//    get()
//    back()
//    map()
//    nilai()
//    untuk()
//    data()
//    getSet()
//    println(sum(9,90))
//}
//fun get (){
//    val salary = longArrayOf(50_000_000, 50_000_000_000, 250_000_000)
//    val total = salary.sum()
//    println("Penghasilan Nofal Hari Ini: ${total.plus(100)}")
//    making(total)
//}
//fun back (){
//    println(" ----- ".repeat(3))
//}
//fun map (){
//    val family = mapOf("Son" to "Nofal", "Aunt" to "Vladlena", "children" to 5)
//    println(family)
//}
//fun making(total: Long){
//    val vladlenaInMood = true
//    if (vladlenaInMood && total > 10000000000) {
//        println("Mauuu")
//    } else {
//        println("Lagi Gamau")
//    }
//}
//
//fun nilai(){
//    var nilai = 90
//    var ket : Char
//
//    if (nilai <= 80){
//        ket = 'B'
//    } else {
//        ket = 'A'
//    }
//
//    var kata : String
//
//    kata = when (ket){
//        'A' -> {
//            "Bagusss"
//        }
//        else -> {
//            "Jelek"
//        }
//    }
//    println(kata)
//}
//
//fun untuk(){
//    var base = 2
//    var power = 6
//    var result = 1
//    var namas = arrayOf("udin", "jajank", "bima")
//    for (nama in namas){
//        println("nama orang $nama")
//    }
//    val range = 1 .. power
//    range.forEach {
//        result *= base
//    }
//    println("hasil $base pangkat $power adalah $result")
//}
//
//var list = listOf("Mangga", "Jeruk", "Pepayah", "Bakwan")
//class dataDiri(var name: String, var age: Int, var isMarried: Boolean)
//class dataOrang(var name: String, var age: Int, var isMarried: Boolean)
//fun data(){
//
//    var saya = dataDiri("Naufal", 15, false)
//    var kamu = dataDiri("Aline", 15, false)
//    println(saya.equals(kamu))
//    println("Kalo Aku ${saya.name}, kalo kamu ${kamu.name}")
//    println("Buah Buahan ada ${list.size}, buah ${list.get(3)} paling enaakk")
//}
//
//fun getSet(){
//    val lesson = setOf("Math", "Sport", "IT", "History")
//    var training = setOf("Laws", "Character", "IT")
//    println(lesson.toList())
//    if (lesson.contains("History")){
//        println("Ada History")
//    }
//
//    println(lesson == training)
//
//    var gabung = lesson.union(training)
//    println(gabung)
//    println(lambda())
//}
//
//val lambda = { "Lambda" }
//
//fun sum(vararg number:Int ):Int{
//    return (number.sum())
//}
//
//fun kalkulator(num1: Int, num2: Int): Number {
//    val result = num1.toDouble() / num2.toDouble()
//    val isDecimalZero = result % 1.0 == 0.0
//
//    val output = if (isDecimalZero) {
//        result.toInt()
//    } else {
//        result
//    }
//
//    return output
//}
