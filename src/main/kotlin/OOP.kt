interface MyMobil
fun main(args: Array<String>){
    var cyan = MobilLambo(cc = 9000, nama = "Cyan", color = "Gray", collab = "Snoopdog", jenisban = "R20")
    cyan.infoLambo()
    cyan.balap()

    var bajai = Mobil(cc = 6000, brand = "tes", jenisban = "R69")
    bajai.info()
}

open class Mobil(protected var cc:Int , var collab:String = "ANL", var brand:String?){
    var transmision = "automatic"
    var jenisban: String? = null

    constructor(cc: Int, collab: String = "ANL", brand: String?, jenisban: String) : this(cc, collab, brand) {
        this.jenisban = jenisban
    }
    init {
        this.brand = if (brand == null){"Toyota"} else brand
        this.cc = if (cc!! <= 3000){4800}else{cc}
    }

    fun balap(){
        burnout()
    }
    private fun burnout(){
        if (cc!! > 4700){
            println("${brand} Persiapan Balap, burnout dlu gak sih")
        }
        else{
            println("Mesin lemah")
        }
    }
    fun info(){
        println("mobil brand: $brand\ntransmision: $transmision\ncc: $cc\ncollab: $collab\njenis ban: $jenisban")
    }
}

class MobilLambo(var nama: String, var color: String,cc: Int, collab: String, jenisban: String): Mobil(cc, brand = "Lamborghini",
    collab = collab, jenisban = jenisban
){
    fun infoLambo(){
        info()
        println("nama: lamborghini $nama\ncolor: $color")
    }
}

