import cell_model.*

class CellImpl(
    core: CoreOfCell,
    cytoplasm: Cytoplasm,
    cellularCenter: CellularCenter,
    endoplasmicReticulum: EndoplasmicReticulum,
    golgiApparatus: GolgiApparatus,
    lysosome: Lysosome,
    mitochondria: Mitochondria,
) : Cell(
    core,
    cytoplasm,
    cellularCenter,
    endoplasmicReticulum,
    golgiApparatus,
    lysosome,
    mitochondria,
) {

    constructor(celModel: Cell) : this(
        celModel.core,
        celModel.cytoplasm,
        celModel.cellularCenter,
        celModel.endoplasmicReticulum,
        celModel.golgiApparatus,
        celModel.lysosome,
        celModel.mitochondria,
    )

    override fun cellDivision(count: Int, array: Array<Cell>): Array<Cell> {

        if (count >= 1) {
            val newArray = mutableListOf<Cell>()

            array.forEach {
                newArray.add(it)
                newArray.add(CellImpl(it))
            }

            return cellDivision(count - 1, newArray.toTypedArray())
        }

        return array

    }


}