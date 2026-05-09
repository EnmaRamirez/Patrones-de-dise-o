interface Builder {
    fun construirMotor()
    fun construirPuertas()
}

class AutoBuilder : Builder {
    override fun construirMotor() {
        println("Motor construido")
    }

    override fun construirPuertas() {
        println("Puertas construidas")
    }
}