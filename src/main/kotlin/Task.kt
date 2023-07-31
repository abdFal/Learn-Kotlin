fun main(args: Array<String>) {
    personal()
    operator()
    logika()
    controlFlow()
    dataClass()
    collections()
}

fun personal() {
    val nama = "Halo Aku Nofal" // String
    val marga: String? = null   // Null
    val usia = 15               // Integer
    val ukuran = 'M'            // Character
    val isMarried = false       // Boolean
    val hobbies = arrayOf(      // Array
        "Berenang", "Fitness", "Traveling"
    )

    println("$nama, marga nya $marga, usia aku $usia tahun, ukuran baju aku $ukuran, " +
            "hobby yang paling aku suka ${hobbies.joinToString(", ")}\nudah nikah: $isMarried")
}

fun operator() {
    val a = 10
    val b = a + 20      // pertambahan
    val c = b - 5       // pengurangan
    val d = c * 3       // perkalian
    val e = d / 5       // pembagian
    val f = e % 3       // modulus

    println("Hasil operasi: b = $b, c = $c, d = $d, e = $e, f = $f")
}


fun logika() {
    var beratBadan = 65
    val ideal = beratBadan >50 && beratBadan < 75       // Operator AND , 2 kondisi harus True
    val kurus = beratBadan <50 || beratBadan == 25      // Operator OR , Salah 1 harus true
    val obesitas = !ideal && !kurus                     // Operator Not , Nilainya Harus False
    beratBadan++                                        // Post Increment
    println("Berat: $beratBadan")
    println("ideal: $ideal\nkurus: $kurus\nobesitas: $obesitas")
}

fun controlFlow(){
    var lagiMood = true
    var bayaran = 50000
    var predikats = charArrayOf('A', 'B', 'C')

    if (lagiMood){                  // IF akan dieksekusi pertama dan jika true maka jalan
        println("Push up 50x")
    }
    else{                           // ELSE bakal jlan Jika semua kondisi diatas gak terpenuhi
        println("ga dulu")
    }
    when(bayaran){                          // WHEN akan jalan kalau nilainya cocok sama kondisi
        25000 -> println("Kemurahan Ah")
        50000 -> println("Gasss")
        100000 -> println("Kemahalan Atuh")
        else -> println("Gajelas")
    }

    for (predikat in predikats){            // Looping suatu data pada array
        println("Predikat: $predikat")
    }

    var simpenan = 100_000_003
    var pegangan = 499_997
    while (simpenan >= 100_000_000){        // Mengecek Kondisi lalu Melakukan loop hingga kondisinya false
        println("Mau beli apa aja ?")
        simpenan--
    }
    do {                                    // Melakukan loop lalu mengecek kondisi hinnga false
        println("Hemat dulu ya")
        pegangan++
    } while (pegangan >= 500_000)
}

fun dataClass(){
    data class DataKelas(var kelas: Int, var jurusan: String, var jumlahSiswa: Int)     // Container sebuah data
    var kelasA = DataKelas(11, "TKJ", 30)
}

fun collections(){
    var myMotors = mutableListOf("Pcx", "Nmax", "Cbr", "H2R")
    var myNumbers = mutableSetOf(1,3,5,6,8,8)                                   // Menyimpan beberapa data yang sama
    var myFamily = mapOf("Father" to "Andi", "Mom" to "Ambar", "Aunt" to "Devi")

    myMotors.add("WR")
    println(myMotors)
    println("Total Nomer ${myNumbers.size}")    // Hanya menghitung jumlah data yang beda
    println("Aunt : ${ myFamily["Aunt"] }")
}