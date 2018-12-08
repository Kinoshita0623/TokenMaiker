import compiler.TokenMaker

fun main(args: Array<String>){
    val token = TokenMaker()
    val list = token.createToken("あいうえお かきくけこ さしすせそ たちつてと")
    println(list)
}