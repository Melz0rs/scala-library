import classes.{Book, Bookmark, Pen}
import data.DataGenerator
import objects.Library

import scala.collection.mutable.ListBuffer

object main extends App {
  var books: ListBuffer[Book] = DataGenerator.generateBooks()
  var bookmarks: ListBuffer[Bookmark] = DataGenerator.generateBookmarks()
  var pens: ListBuffer[Pen] = DataGenerator.generatePens()

  Library.books = books
}
