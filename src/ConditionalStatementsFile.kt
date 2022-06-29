fun main(args: Array<String>) {
    var age = 18
    if (age < 18){
        println("Go home")
    }else{
        println("Welcome to the party")
    }
    //Grading system
    var marks = 80
    if (marks < 40){
        println("E")
    }else if(marks < 50){
        println("D")
    }else if(marks < 60){
        println("C")
    }else if(marks < 70){
        println("B")
    }else{
        println("A")
    }

    //Betting system
    var bettingNumber = 3
    when(bettingNumber){
        1->{
            println("Oops!! You`ve lost")
        }
        2->{
            println("Oops!! You`ve lost")
        }
        3->{
            println("Congrats!! You won")
        }
        4->{
            println("Oops!! You`ve lost")
        }
        else->{
            println("Please enter number from 1-4 to bet")
        }
    }


}