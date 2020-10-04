package Lectures.OOPs

object AbstractDataTypes extends App{

  abstract class Animal(name : String, animalType: String){

    val creatureType : String
    def eat : Unit

  }

  class Dog(name : String, animalType: String) extends Animal(name,animalType){

    override val creatureType: String = "Canine"

    def eat: Unit = println("Crunch")

  }

}
