import com.sun.xml.internal.ws.api.ha.StickyFeature

fun main(){
    val ano = 4
    println("$ano anos equivalem a:")
    count(ano)

    val str = "Erick Ferrareto"
    println(strinCount(str))
}
fun strinCount(str : String) : Int = str.length

fun count(ano : Int){
    println("${ano * 12} meses")
    println("${ano * 365} dias")
    println("${(ano * 365) * 24} horas")
    println("${((ano * 365) * 24) * 60} minutos")
    println("${(((ano * 365) * 24) * 60) * 60} segundo")
}




