package Model

class CCuentaCorrienteConIntereses(
    nombre: String,
    cuenta: String,
    saldo: Double,
    tipoDeInteres: Double,
    importePorTrans: Double,
    transExentas: Int
) : CCuentaCorriente(nombre, cuenta, saldo, tipoDeInteres, importePorTrans, transExentas) {

    override fun intereses() {
        if (estado() >= 3000) {
            super.intereses()
        }
    }
}