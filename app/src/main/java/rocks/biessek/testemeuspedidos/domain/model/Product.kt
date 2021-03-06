package rocks.biessek.testemeuspedidos.domain.model

interface Product {
    val id: Long?
    val name: String
    val description: String
    val photo: String
    val price: Double
    val categoryId: Long
    var favorite: Boolean
}