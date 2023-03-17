import cell_model.*
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

    println("Введіть кількість поділів для клітини: ")
    val input = readLine()

    launch {
        val listOfCell = exampleCell.cellDivision(input!!.toInt(), arrayOf(exampleCell))

        for (i in listOfCell.indices) {
            println("${listOfCell[i]} - клітина #$i")
        }

        println("\n\nУсього у резальтаті ${input}-разового поділу клітин = ${listOfCell.size}")
    }


}