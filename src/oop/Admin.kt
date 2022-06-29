package oop

fun main(args: Array<String>) {
    var firstAdmin = Admin("King", 90000.00, "king@gmail.com")
    firstAdmin.registerUser()
    println(firstAdmin.salary)

    firstAdmin.setIdNumber("456587345")
    println(firstAdmin.getIdNumber())

}


class Admin {
    var name:String
    var salary:Double
    var email:String
private var phoneNumber:String = ""
private var idNumber:String = ""

    constructor(name:String, salary:Double, email:String){
        this.name = name
        this.salary = salary
        this.email = email
    }

    fun registerUser(){
        println("Yeah, I can register a user")
    }

    fun suspendEmployee(){
        println("Yeah, I can suspend an employee")
    }

    fun setPhoneNumber(phoneNumber:String){
        this.phoneNumber = phoneNumber
    }
    fun getPhoneNumber():String{
        return this.phoneNumber
    }

    fun setIdNumber(idNumber:String){
        this.idNumber = idNumber
    }
    fun getIdNumber():String{
        return this.idNumber
    }
}