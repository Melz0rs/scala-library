package services

import classes.{Book, Pen, Bookmark}

object LibraryService {

  def takeBook(bookName: String): Option[Book] = {
    var book = Cache.books.get(bookName)

    if (book.isEmpty) {
      book = SectionsService.takeBook(bookName)
    }

    book
  }
}
