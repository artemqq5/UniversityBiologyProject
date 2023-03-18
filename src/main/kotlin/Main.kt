import cell_model.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main(): Unit = coroutineScope {
    val exampleCell = CellImpl(
        core = CoreOfCell(),
        cytoplasm = Cytoplasm(),
        cellularCenter = CellularCenter(),
        endoplasmicReticulum = EndoplasmicReticulum(),
        golgiApparatus = GolgiApparatus(),
        lysosome = Lysosome(),
        mitochondria = Mitochondria(),
    )

    val number = getNumberFromUser()

    launch(Dispatchers.Default) {
        val listOfCell = exampleCell.cellDivision(number, arrayOf(exampleCell))

        for (i in listOfCell.indices) {
            if (i == 0) println("-> Головна батьківська клітина \n\t${listOfCell[i]}\n")
            else println("\t -> похідна клітина ${i}-го поділу \n\t\t${listOfCell[i]}\n")

        }

        println(
            "\n\nУсього у резальтаті ${number}-разового поділу було створенно ${listOfCell.size} клітин/ів. " +
                    "\nУ цьому прикладі ми бачимо, що у кожної клітини різний індифікатор основи, але однаковий " +
                    "індифікатор складових. \nЦе показує повидінку справжніх клітин при діленні, " +
                    "бо кожна похідна клітина це окремий" +
                    "новий організм, який успадкував ДНК батьківської"
        )
    }

}

fun getNumberFromUser(): Int {
    println("Зараз на прикладі абстракції об'єктів клітини відбудеться її створення та подальше ділення (обмежено до 5 поділів для коректного вживання пам'яті)")
    var input: Int?

    do {
        print("Введіть число від 1 до 5 включно: ")
        input = readLine()?.toIntOrNull()
    } while (input !in 1..5)

    return input!!
}