fun main() {
    for(i in 1..10) {
        println("---------------")
        for (j in 1..10) {
            println("| $i * $j  = ${i * j} |")
        }
        print("---------------")
    }
}