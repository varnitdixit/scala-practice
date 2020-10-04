package Lectures.OOPs

abstract class MyList[+A]{

  def head : A
  def tail : MyList[A]
  def isEmpty : Boolean
  def add[B>:A](element : B) : MyList[B]
  def printElements : String

  override def toString = "[" + printElements + "]"

}

object Empty extends MyList[Nothing]{

  def head: Nothing = throw new NoSuchMethodException()
  def tail: MyList[Nothing] = throw new NoSuchMethodException()
  def isEmpty: Boolean = true
  def add[B>: Nothing](element: B): MyList[B] = new Cons(element, Empty)
  def printElements : String = ""
}

class Cons[+A](h: A, t : MyList[A]) extends MyList[A]{
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
  def add[B>:A](element: B): MyList[B] = new Cons(element,this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements


}

object ListTestGeneric extends App{

  val listofIntegers : MyList[Int] = new Cons(1,new Cons(2,new Cons(3, Empty)))
  val listofStrings : MyList[String] = new Cons("Hi",new Cons("There !", Empty))

  println(listofIntegers.toString)
  println(listofStrings.toString)



}

