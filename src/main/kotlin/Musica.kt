class Song (
    val title: String,
    val artist: String,
    val year: Int,
    val playCount: Int,
){
    val isPopular: Boolean
    	get()= playCount >= 1000
    
    fun musicDescription(){
        println("$title - $artist - $year")
    }
}

fun main() {
    val album = Song("Music X", "Artist X", 2008, 1001)
    album.musicDescription()
    println(album.isPopular)
}
