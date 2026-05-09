interface Transporte {
    fun entregar()
}

class Camion : Transporte {
    override fun entregar() {
        println("Entrega por tierra")
    }
}

class Barco : Transporte {
    override fun entregar() {
        println("Entrega por mar")
    }
}

abstract class Logistica {
    abstract fun crearTransporte(): Transporte
}

class LogisticaTerrestre : Logistica() {
    override fun crearTransporte(): Transporte {
        return Camion()
    }
}