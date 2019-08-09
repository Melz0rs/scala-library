package classes

import abstractions.ProductsShelf
import traits.Shelf

import scala.collection.mutable.ListBuffer

class BookShelf(books: ListBuffer[Book] = new ListBuffer[Book]) extends ProductsShelf(books)
