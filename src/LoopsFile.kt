fun main(args: Array<String>) {
    var countOne = 0
    while (countOne <= 5){
        println(countOne)
        countOne++
    }
//Do while loop
    var countTwo = 10
    do {
        println(countTwo)
        countTwo++
    }while (countTwo <= 15)

    //Repeat loop
    repeat(5){
       println("Good morning")
    }

    //For in loop
    var names = arrayOf("King","Faith","Linnet","Brian")
    names.sortDescending()
    for (jina in names){
        println(jina)
    }



    var ascendingNumbers = 0 .. 20
    for (nambari in ascendingNumbers){
        println(nambari)
    }

    var descendingNumbers = 20 .. 0
    for (nambari1 in descendingNumbers){
        println(nambari1)
    }

}