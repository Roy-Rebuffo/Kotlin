fun suma(x1:Int, x2:Int):Int{
    return x1+x2
}

fun mult(x1:Int, x2:Int):Int{
    return x1*x2
}

fun resta(x1:Int, x2:Int):Int{
    return x1-x2
}

fun division(x1:Int, x2:Int):Int{
    return x1/x2
}

fun main() {
    print("Di el 1º nº")
    val n1: Int = readln().toInt()
    print("Di el 2º nº")
    val n2:Int = readln().toInt()
    print("Di el 3º nº")
    val n3:Int = readln().toInt()
    print("Di el 4º nº")
    val n4:Int = readln().toInt()

    println("La suma es: ${suma(n1,n2)}")
    println("La resta es: ${resta(n3,n4)}")
    println("La division es: ${division(n1,n2)}")
    println("La multiplicacion es: ${mult(n1,n2)}")
}