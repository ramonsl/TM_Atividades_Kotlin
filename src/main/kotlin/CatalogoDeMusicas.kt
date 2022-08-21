fun main(){
    val armandinho = Song("Semente", "Armandinho", 2008, 100000)
    armandinho.getSongDescription()
}

class Song(val title: String, val artist: String, val releaseYear: Int, val playCount: Int){

    val isFamous: Boolean
        get() = playCount>= 100

    fun getSongDescription(){
        println("$title, de $artist, lançado em $releaseYear.")
    }

}