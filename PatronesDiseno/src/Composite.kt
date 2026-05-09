interface Componente {
    fun mostrar()
}

class Archivo : Componente {
    override fun mostrar() {
        println("Archivo")
    }
}

class Carpeta : Componente {
    private val elementos = mutableListOf<Componente>()

    fun agregar(c: Componente) {
        elementos.add(c)
    }

    override fun mostrar() {
        elementos.forEach { it.mostrar() }
    }
}