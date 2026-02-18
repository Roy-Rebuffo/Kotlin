package Model

class CCuentaAhorro(
    nombre: String,
    cuenta: String,
    saldo: Double,
    tipoDeInteres: Double,
    private var cuotaMantenimiento: Double
) : CCuenta(nombre, cuenta, saldo, tipoDeInteres) {

    fun asignarCuotaManten(c: Double) { cuotaMantenimiento = c }
    fun obtenerCuotaManten() = cuotaMantenimiento

    override fun comisiones() {
        saldo -= cuotaMantenimiento
    }

    override fun intereses() {
        val interesMes = saldo * obtenerTipoDeInteres() / 12
        saldo += interesMes
    }
}