package classes

import abstractions.ProductsShelf

import scala.collection.mutable.ListBuffer

class BookmarkShelf(bookmarks: ListBuffer[Bookmark]) extends ProductsShelf(bookmarks)