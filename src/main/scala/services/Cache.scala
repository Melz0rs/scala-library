package services

import classes.Book

object Cache {
  var books: Map[String, Book] = Map[String, Book]()
}
