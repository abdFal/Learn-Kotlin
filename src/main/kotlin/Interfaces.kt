interface activities{
    fun play()
    fun eat(): String
    fun mood(): Boolean
}

class human: activities {
    override fun eat(): String {
        return "eating"
    }

    override fun play() {
        println("Human playing as a victim")
    }

    override fun mood(): Boolean {
        return true
    }

    public fun laugh(): String{
        var laugh = "HAHA"
        return laugh
    }
}

fun main(args: Array<String>){
    val dodo = human()
    dodo.play()
}