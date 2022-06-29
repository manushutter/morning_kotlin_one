fun main(args: Array<String>) {
    motto()
    userVerification("Kingwanyama", "king@gmail.com" )
    average(23.0, 50, 65.0f)
}

fun motto(){
    println("Hello this is our motto")
}

fun userVerification(username:String, email:String){
    println("Your username is $username and your email is $email")
    login("King")
    login("king@gmail.com", "king123")
}

fun average(x:Double, y:Int, z:Float){
   var result = (x + y + z)/3.0
    println("Hello your average is $result")
    println(addition(20, 30.0))

}

fun addition(x:Int, y:Double):Double{
    var answer = x + y
    return answer
}

fun login(name:String){
    println("Hello your name is $name")
}

fun login(email:String, password:String){
    println("Hello your email is $email and your password is $password" )
}

