/*
Propriedades do título, artista, ano de lançamento e contagem de reprodução.
Uma propriedade que indica se a música é famosa. Se o número for menor que 1.000, considere que não gostam muito dela.
Um método que mostra uma descrição de música neste formato:
"[Título], de [artista], lançado em [ano de lançamento]."


 */

class Song (val title: String,
            val artist: String,
            val year:Int,
            val playCont:Int){

    val isPopular: Boolean
        get()= playCont>=1000

    fun printDesc(){
        println("$title, de [$artist], lançado em [$year].")
    }
}
fun main(){
    val armandinho= Song("Semente","Armandinho",2008, 10000)
    armandinho.printDesc();
    println(armandinho.isPopular)
    
}