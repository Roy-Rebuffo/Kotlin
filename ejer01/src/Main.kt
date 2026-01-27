//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val valor1: Int = 100 // Val: variable inmutable
    val valor2: Int = 400
    val mensaje: String = "Holita $valor1 y $valor2"
    println(mensaje)
    var resultado: Int
    resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("El producto de $valor1 * $valor2 es $resultado")
}