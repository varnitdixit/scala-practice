package Lectures.OOPs

object Inheritance extends App{

   class Animal{
    val creatureType = "Unknown"
    def eat = println("nomnom")
  }

  class Dog extends Animal{
    override val creatureType: String = "Domestic"
    override def eat = {
      //println("this is parent type : " + super.creatureType)
      println(s"This is child type : $creatureType")
      println("Crunch")
      super.eat
    }
  }

  val dog = new Dog

  val unknown : Animal = new Dog

  unknown.eat

  dog.eat



}
