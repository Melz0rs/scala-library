package services

import classes.Book
import enums.GenreType
import scala.collection.mutable.ListBuffer

object SectionsService {

  def buildSections(books: ListBuffer[Book]): Unit = {

  }

  def addSection(): Unit = {

  }

  def removeSection(): Unit = {

  }

  def takeBook(bookName: String): Option[Book] = {
    Some(new Book(1, 2, "hava", GenreType.Comedy))
  }
}
