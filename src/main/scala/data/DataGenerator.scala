package data

import classes.{Book, Bookmark, Pen, Section}

import scala.collection.mutable.ListBuffer
import scala.util.Random
import enums.{ColorType, GenreType}

object DataGenerator {
  def generateBooks(): ListBuffer[Book] = {
    val booksCount  = Random.nextInt(1000)
    val books = new ListBuffer[Book]

    for (i <- 0 to booksCount){
      val price = Random.nextInt(300) + 20
      val pages = Random.nextInt(1000) + 150
      val name = Random.nextString(Random.nextInt(10) + 2)
      val genresCount = GenreType.values.size
      val genreIndex = Random.nextInt(genresCount)
      val genre = GenreType.values.toList(genreIndex)

      val book = new Book(price, pages, name, genre)

      books += book
    }
    
    books
  }

  def generatePens(): ListBuffer[Pen] = {
    var i = 0
    val pensCount  = Random.nextInt(1000)
    val pens = new ListBuffer[Pen]

    for (i <- 0 to pensCount) {
      val price = Random.nextInt(300) + 20
      val colorsCount = ColorType.values.size
      val colorsIndex = Random.nextInt(colorsCount)
      val color = ColorType.values.toList(colorsIndex)

      val pen = new Pen(price, color)

      pens += pen
    }
    
    pens
  }

  def generateBookmarks(): ListBuffer[Bookmark] = {
    var i = 0
    val bookmarksCount  = Random.nextInt(1000)
    val bookmarks = new ListBuffer[Bookmark]

    for (i <- 0 to bookmarksCount) {
      val price = Random.nextInt(300) + 20
      val colorsCount = ColorType.values.size
      val colorsIndex = Random.nextInt(colorsCount)
      val color = ColorType.values.toList(colorsIndex)

      val bookmark = new Bookmark(price, color)

      bookmarks += bookmark
    }

    bookmarks
  }

  def generateSections(): ListBuffer[Section] = {
    val sections = new ListBuffer[Section]

    for (i <- 0 to 10) {
      sections += new Section(i)
    }

    sections
  }
}

