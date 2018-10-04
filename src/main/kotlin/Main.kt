import Tables.MusicTable
import com.github.kittinunf.fuel.Fuel
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

fun main(args: Array<String>) {

    val url="https://next.json-generator.com/api/json/get/EkeSgmXycS"

    val (request, response, result)=Fuel.get(url).responseObject(Song.SongArrayDeserializer())
    val(songs, err)= result

    Database.connect(
            "jdbc:postgresql:Songs",
            "org.postgresql.Driver",
            "postgres",
            "59809690"
    )
    transaction {{
//        //SchemaUtils.create(MusicTable)
//        //if (songs != null) {
//            //for (song in songs){
//                //MusicTable.insert {
//                    it[year] = song.year
//                    it[country] = song.country
//                    it[region] = song.region
//                    it[artistName] = song.artistName
//                    it[title] = song.song
//                    it[artistGender] = song.artistGender
//                    it[groupOrSolo] = song.groupOrSolo
//                    it[place] = song.place
//                    it[points] = song.points
//                    it[isFinal] = song.isFinal
//                    it[isSongInEnglish] = song.isSongInEnglish
//                    it[songQuality] = song.songQuality
//                    it[normalizedPoints] = song.normalizedPoints
//                    it[energy] = song.energy
//                    it[duration] = song.duration
//                    it[acousticness] = song.acousticness
//                    it[danceability] = song.danceability
//                    it[tempo] = song.tempo
//                    it[speechines] = song.speechiness
//                    it[key] = song.key
//                    it[liveness] = song.liveness
//                    it[timeSignature] = song.timeSignature
//                    it[mode] = song.mode
//                    it[loudness] = song.loudness
//                    it[valence] = song.valence
//                    it[happiness] = song.happiness
//                    it[isFavorite] = song.isFavorite


               // }
            //}
        }
    }

}