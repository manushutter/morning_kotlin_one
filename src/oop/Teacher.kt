package oop

fun main(args: Array<String>) {
    var firstStudent = student("Faith",100)
    firstStudent.publishMagazine()

    var firstBoardMember = BoardMember("Linnet",50)
    firstBoardMember.publishMagazine()
}

open class Teacher (open var name:String, open var age:Int){
    fun viewResults(){
        println("Hello $name, you can view results")
    }
    fun publishMagazine(){
        println("Hello $name, you are $age years and you can publish a magazine")
    }
}

open class student(name:String, age:Int):Teacher(name,age){
    fun sitForExams(){
        println("Hello, I can sit for exams")
    }
}

class BoardMember(name:String, age:Int):student(name,age){

}
