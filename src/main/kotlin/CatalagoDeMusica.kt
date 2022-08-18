class Song(
    var title: String,
    var artist: String,
    var year: Int,
    var played_counter: Int,
    var isFamous: Boolean = if (played_counter > 1000) true else false) 
    {
        
        //"[Título], de [artista], lançado em [ano de lançamento]."

    fun description(){
        println("${this.title}, of ${this.artist}, released in ${this.year}")
    }

}