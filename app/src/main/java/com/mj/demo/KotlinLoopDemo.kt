package com.mj.demo

fun main() {
    printListOfNames()
    println()
    printRanges()
    println()
    printRangeUsingUntil()
    println()
    printRangeWhileControllingUsingStep()
    println()
    printReverseRangeUsingDownTo()
    println()
    printListOfNumbers()
    println()
    printValueWithIndex()
    println()
    printPrimeNumbers()

}


fun printPrimeNumbers() {
var count=0
    outer@ for(n in 2..100)
{
    for(d in 2 until n)
    {
        if(n%d==0) continue@outer
    }
    count = count.plus(1)
    println("Prime Number: $n")
}
    println("Total number of Prime number in range 2..100 is $count")
}

fun printValueWithIndex() {
 val names= listOf("A","B","C","D")
    for((index,value) in names.withIndex()) println("$index, $value")
}

fun printListOfNumbers() {
    val numbers=(0..9).toList()
    println(numbers)
}

fun printReverseRangeUsingDownTo() {
    for (i in 10 downTo 0 step 2) println("Reverse value: $i")  // Prints 10, 8, 6, 4, 2, 0
}


/**
 * control the increment with step
 */
fun printRangeWhileControllingUsingStep() {
    for(i in 0 until 10 step 3) println("Value: $i")
}


/**
 * exclude the last value, use until
 */
fun printRangeUsingUntil() {
    for (i in 0 until 10 )println("printRangeUsingUntilValue: $i") //Prints 0 through 9
}

fun printRanges() {
    for(i in 0..10) println("printRangesValue: $i") // Prints 0 through 10 (inclusive)

}

fun printListOfNames() {

    val names = listOf("A","B","C","D")
    for (name in names)
    {
        println(name)
    }
}
