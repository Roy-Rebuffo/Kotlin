fun main() {
    print("Introduzca un mes por teclado: ")
    var mes : Int = readln().toInt()
    var semestre : Int = 0
    var trimestre : Int = 0
    when {
        mes >= 1 && mes <=6 -> {
            semestre = 1
            when{
                mes>=1 && mes <=3 ->
                    trimestre = 1
                    else ->trimestre = 2
            }
        }
        mes >= 7 && mes <=12 -> {
            semestre = 2
            when{
                mes>=7 && mes <=9 ->
                    trimestre = 3
                    else ->trimestre = 4
            }
        }
    }
    println("El semestre es: $semestre")
    print("El trimestre es: $trimestre")
}