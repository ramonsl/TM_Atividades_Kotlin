class Song(
	val title: String,
	val artist: String,
  	val year: Int,
  	val playCount: Int
) {
    val isFamous: Boolean
    	get() = playCount >= 1000
    
    override fun toString(): String = "$title, de $artist, lançado en $year."
}

fun main() {    
    var newSong = Song("Musica 1", "Artista A", 2022, 100)
    println("É famoso: " + newSong.isFamous)
    print(newSong.toString())
}
