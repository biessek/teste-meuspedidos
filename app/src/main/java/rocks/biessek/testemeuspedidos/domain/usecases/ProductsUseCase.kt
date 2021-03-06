package rocks.biessek.testemeuspedidos.domain.usecases

import rocks.biessek.testemeuspedidos.domain.model.Product

interface ListProductsUseCase {
    suspend fun listAllProducts(): List<Product>
}

interface FilterProductsUseCase {
    suspend fun listProductsFromCategory(categoryId: Long): List<Product>
}

interface FavoriteProductUseCase {
    suspend fun toggleProductFavorite(product: Product): Boolean
}

interface DetailProductUseCase {
    suspend fun loadProductById(id: Long): Product?
}
