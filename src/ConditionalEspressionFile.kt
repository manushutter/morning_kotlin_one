fun main(args: Array<String>) {
    var marks = 85
    var result = if (marks < 50){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks < 70){
        "C"
    }else if (marks < 80){
        "B"
    }else{
        "A"
    }
    println(result)

    var bettingNumber = 0
    var bettingResult = when(bettingNumber){
        1->{
            "Ooops!! You lost"
        }
        2->{
            "Congrats!! You won"
        }
        3->{
            "Ooops!! You lost"
        }
        else->{
            "Please enter a number from 1 - 3 to bet"
        }
    }
    println(bettingResult)
}