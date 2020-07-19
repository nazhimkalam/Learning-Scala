object Demo {   // creating an object
  def main(args: Array[String]) {   // creating a main method

    // var means can change
    // val means can't change, it's like a constant
    // So when ever you don't change a variable, make use of val


    // creating a class with Default values
    case class Student(var rollno: Int = 1, var name: String = "Nazhim", var marks: Int = 90)
    {
      // defining a method
      def show() = {
        val x : Int = 40;
        println(x + " this is the value of the variable x")
      }

      // functional overloading
      def > (std: Student) : Boolean = {
        marks > std.marks
      }
    }

    // instantiating the Student class
    val s1 = Student(name = "Nazhim Kalam");
    val s2 = Student(name = "Obama", marks = 89)
    println(s1.name)
    println("---------------------------------------")

    s1.show();

    println(s1>s2)       // similar to s1.>(s2)
    println("---------------------------------------")

    println(s2>s1)       // similar to s2.>(s1)
    println("---------------------------------------")


    // creating a List
    val numbers = List(4, 7, 2, 3)

    for(i <- numbers){
      println(i)
    }
    println("---------------------------------------")


    var reverseNumbers = numbers.reverse

    // using Lambda method to display the output
    numbers.foreach{i:Int => println(i)}
    println("---------------------------------------")


    //drop a number of elements from the starting position of the list
    reverseNumbers = reverseNumbers.drop(2)

    // using the Lambda method to display the contents of the reversed List
    reverseNumbers.foreach{i:Int => println(i)}
    println("---------------------------------------")


    // if you need to print or get only a number of elements from a list from the starting position
    val usingTake = reverseNumbers.take(1)
    println(usingTake)
    println("---------------------------------------")

    // You can also have a List of Type "Any" were we can put any data type values inside the list
    val myList = List(8,5,"Nazhim",true,2.3)      // this is of "any" type were it can take any data into the list
    println(myList)
    println("---------------------------------------")

    // creating a List of Student class objects
    val studentList = List(Student(1, "Nazhim", 95), Student(2, "Abilash", 88), Student(3, "Obama", 50), Student())

    val first = studentList.head    // this will return the first element in the list
    println(first)
    println("---------------------------------------")

    val rest  = studentList.tail    // this will return all the elements except the first element
    println(rest)
    println("---------------------------------------")

    val highMarksOfStudents = studentList.filter(s => s.marks >= 60)// we can filter the List elements with a given condition
    println(highMarksOfStudents)
    println("---------------------------------------")




  }
}