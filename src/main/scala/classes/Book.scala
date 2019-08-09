package classes

import enums.ProductType
import abstractions.Product
import enums.GenreType.GenreType

class Book(price: Int, pages: Int, name: String, genre: GenreType) extends Product(price, ProductType.Book)