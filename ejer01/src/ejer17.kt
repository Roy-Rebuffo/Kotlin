private class Libro(isbn:String, titulo: String,autor:String,precio:Double) {
    //hacer set y get de todos los atr.
    //hacerlos privados??
    //toString
    //constructor que le pasemos todos los parametros
    var isbn:String = isbn
        set(valor) {
            field = valor
        }
        get() {
            return "(" + field + ")"
        }
    var titulo:String = titulo
        set(valor) {
            field = valor
        }
        get() {
            return "(" + field + ")"
        }
    var autor:String = autor
        set(valor) {
            field = valor
        }
        get() {
            return "(" + field + ")"
        }
    var precio:Double = precio
        set(valor) {
            field = valor
        }
        get() {
            return field
        }

    override fun toString(): String {
        return "Libro(isbn='$isbn', titulo='$titulo', autor='$autor', precio=$precio)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Libro

        if (precio != other.precio) return false
        if (isbn != other.isbn) return false
        if (titulo != other.titulo) return false
        if (autor != other.autor) return false

        return true
    }

    override fun hashCode(): Int {
        var result = precio.hashCode()
        result = 31 * result + isbn.hashCode()
        result = 31 * result + titulo.hashCode()
        result = 31 * result + autor.hashCode()
        return result
    }

}

fun main() {
    var libro1 = Libro("Ana","Mena","Pepe",20.0)
    print(libro1)
}