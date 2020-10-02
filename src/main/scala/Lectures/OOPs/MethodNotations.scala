package Lectures.OOPs

object MethodNotations extends App {

  class Person (val name : String, val age : Int, favoriteMovie : String){

    def +(n: String) = {new Person(name+"("+n+")",age,favoriteMovie)


    }

    def unary_+ : Person = {new Person(name,age+1,favoriteMovie)

      }

    def learns(thing : String) = s"$name learns $thing"

    def learnsScala : String =  this learns "Scala"

    def apply(n: Int) : String = s"$name watched $favoriteMovie $n times"

  }

  val mary = new Person("Mary",27,"Inception")

  println((mary + "the rockstar").name)

  println((+mary).age)

  println(mary learnsScala)

  println(mary(2))




}
