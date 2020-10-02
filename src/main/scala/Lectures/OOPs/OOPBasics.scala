package Lectures.OOPs

object OOPBasics extends App {


  val writer = new Writer("Charles","Dickens",1812)
  val novel = new Novel("Book",1859,writer)

  println(writer.fullName)

  println(novel.authorAge)

  println(novel.isWrittenBy(writer))

  println("New release on " + novel.copy(1872))
}

class Writer (fname : String, lname : String, val year : Int){

  def fullName = fname + " " + lname

}

class Novel (name : String, year : Int, author : Writer){

  def authorAge = year - author.year

  def isWrittenBy (author : Writer) = author == this.author

  def copy(reRelease : Int)  = {new Novel (name,reRelease,author)

    reRelease

  }
}