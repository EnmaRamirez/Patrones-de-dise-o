interface Color {
    fun aplicar()
}

class Rojo : Color {
    override fun aplicar() {
        println("Color rojo aplicado")
    }
}

abstract class Forma(protected val color: Color)

class Circulo(color: Color) : Forma(color) {
    fun dibujar() {
        color.aplicar()
        println("Dibujando círculo")
    }
}