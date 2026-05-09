class MotorViejo {
    fun encenderMotor() {
        println("Motor viejo encendido")
    }
}

interface MotorNuevo {
    fun encender()
}

class AdaptadorMotor(private val motorViejo: MotorViejo) : MotorNuevo {
    override fun encender() {
        motorViejo.encenderMotor()
    }
}