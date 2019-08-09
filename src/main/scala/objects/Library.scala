package objects

import classes.{Book, Bookmark, Pen, Section}
import services.LibraryService
import services.SectionsService
import scala.collection.mutable.ListBuffer

object Library {
  private var _sections: ListBuffer[Section] = new ListBuffer[Section]
  private var _books: ListBuffer[Book] = new ListBuffer[Book]()
  private var _bookmarks: ListBuffer[Bookmark] = new ListBuffer[Bookmark]()
  private var _pens: ListBuffer[Pen] = new ListBuffer[Pen]()

  def books: ListBuffer[Book] = _books
  def bookmarks: ListBuffer[Bookmark] = _bookmarks
  def pens: ListBuffer[Pen] = _pens

  def books_=(newBooks: ListBuffer[Book]): Unit = {
    _books = newBooks

    SectionsService.buildSections(newBooks)
  }
  // Create sections, and shelves
  // Split the products into sections for quick access

//  def takeBook(bookName: String) => LibraryService.

}
