class Usuario private constructor(
    val nombre: String,
    val edad: Int
) {
    class Builder {
        private var nombre = ""
        private var edad = 0

        fun setNombre(nombre: String) = apply { this.nombre = nombre }
        fun setEdad(edad: Int) = apply { this.edad = edad }

        fun build() = Usuario(nombre, edad)
    }
}