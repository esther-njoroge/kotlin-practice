fun main(){
   println( checkNumber(7))
    println(maxAndMin(listOf(1,4,5,2,5,6,7,9,2,9)))
    println(Even())
}




//Write a program that takes in a number and checks if it's a prime number
fun checkNumber(num: Int){
    if (num <= 1){
        println("is not prime")
    }
else if (num==2 || num==3){
        println("is a prime")
    }
    else if (num%2!=0 && num%3!=0){
        println("is prime")
    }
    else{
        println("Number is not Prime")
    }
}


//Write a program that calculates the sum of all even numbers between 1 and 100.
fun Even():Int{
   var sum = 0

    for(num in 1..100)
        if(num%2==0) {
            sum+=num
        }
    return sum
}


//Write a program that reads in a list of integers and finds the maximum and minimum values in the list.

fun maxAndMin( number:List<Int>): Int{
   var  maxNumber =number[0]
    var minNumber = number[0]

    for(num in number){
        if (num > maxNumber){
            maxNumber = num
        }
        if (num < minNumber){
            minNumber = num

        }
    }
    return maxNumber
    return minNumber
}
