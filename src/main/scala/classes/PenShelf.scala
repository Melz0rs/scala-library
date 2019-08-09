package classes

import abstractions.ProductsShelf

import scala.collection.mutable.ListBuffer

class PenShelf(pens: ListBuffer[Pen]) extends ProductsShelf(pens)