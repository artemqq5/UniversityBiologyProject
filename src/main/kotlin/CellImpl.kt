import cell_model.*

// Реалізація абстракції
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

    override fun toString(): String {
        return "Клітина(${super.toString().replace("CellImpl@", "")}) || " +
                "Ядро(${this.core.toString().replace("cell_model.CoreOfCell@", "")}), " +
                "Цитоплазма(${this.cytoplasm.toString().replace("cell_model.Cytoplasm@", "")}), " +
                "Клітинний центр(${this.cellularCenter.toString().replace("cell_model.CellularCenter@", "")}), " +
                "Ендоплазматична сітка(${
                    this.endoplasmicReticulum.toString().replace("cell_model.EndoplasmicReticulum@", "")
                }), " +
                "Апарат Гольджі(${this.golgiApparatus.toString().replace("cell_model.GolgiApparatus@", "")}), " +
                "Лізосома(${this.lysosome.toString().replace("cell_model.Lysosome@", "")}), " +
                "Мітохондрія(${this.mitochondria.toString().replace("cell_model.Mitochondria@", "")}), "
    }

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