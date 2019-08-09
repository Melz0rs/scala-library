package classes

import traits.Shelf

import scala.collection.mutable.ListBuffer

class Section(id: Int, shelves: ListBuffer[Shelf] = new ListBuffer[Shelf]()) {
  def apply(id: Int): Unit = {
    for(i <- 0 to 10) {
      shelves += new BookShelf()
    }

  }
}
