package Lectures.OOPs

abstract class MyList{

  def head : Int
  def tail : MyList
  def isEmpty : Boolean
  def add(element : Int) : MyList
  def printElements : String

  override def toString = "[" + printElements + "]"

}

object Empty extends MyList{

  def head: Int = throw new NoSuchMethodException()
  def tail: MyList = throw new NoSuchMethodException()
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element, Empty)
  def printElements : String = ""
}

class Cons(h: Int, t : MyList) extends MyList{
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element: Int): MyList = new Cons(element,this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements


}

object ListTest extends App{

  val list = new Cons(1,Empty)

  println(list.add(4).head)



}

