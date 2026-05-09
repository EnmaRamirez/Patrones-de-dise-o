fun main() {

    // Singleton
    Database.connect()

    // Builder
    val usuario = Usuario.Builder()
        .setNombre("Enma")
        .setEdad(22)
        .build()

    println("Usuario: ${usuario.nombre}, ${usuario.edad}")

    // Factory Method
    val logistica = LogisticaTerrestre()
    val transporte = logistica.crearTransporte()
    transporte.entregar()

    // Adapter
    val motor = AdaptadorMotor(MotorViejo())
    motor.encender()

    // Bridge
    val circulo = Circulo(Rojo())
    circulo.dibujar()

    // Composite
    val carpeta = Carpeta()
    carpeta.agregar(Archivo())
    carpeta.agregar(Archivo())

    carpeta.mostrar()

    // Prototype
    val doc1 = Documento("Hola")
    val doc2 = doc1.clonar()

    println(doc2.texto)
}