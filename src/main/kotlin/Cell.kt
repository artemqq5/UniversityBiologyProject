import cell_model.*

// Абстракція клітини з методом поділу
abstract class Cell(
    val core: CoreOfCell,
    val cytoplasm: Cytoplasm,
    val cellularCenter: CellularCenter,
    val endoplasmicReticulum: EndoplasmicReticulum,
    val golgiApparatus: GolgiApparatus,
    val lysosome: Lysosome,
    val mitochondria: Mitochondria,
) {

    abstract fun cellDivision(count: Int, array: Array<Cell>): Array<Cell>

}