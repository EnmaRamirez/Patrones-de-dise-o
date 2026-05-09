data class Documento(val texto: String) {
    fun clonar(): Documento {
        return this.copy()
    }
}