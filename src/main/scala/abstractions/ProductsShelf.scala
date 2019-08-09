package abstractions

import traits.Shelf
import scala.collection.mutable.ListBuffer

abstract class ProductsShelf[A <: Product](products: ListBuffer[A] = new ListBuffer[A]) extends Shelf
