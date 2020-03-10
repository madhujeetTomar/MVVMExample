package com.mj.demo

fun main() {

    val firstPerson = Person("MJ",28,"S.E.")
    val secondPerson = Person("Jags", 26, "M.E.")

    //Normal If
    val olderPerson=if(firstPerson.age>secondPerson.age) firstPerson else secondPerson
olderPerson.printPerson()

    //run: Calls the specified function [block] and returns its result.
    run { if(firstPerson.age>secondPerson.age) firstPerson else secondPerson }.printPerson()

    //with

    with(secondPerson)
    {
        age += 1
        "Age is now $age"
    }.println()

}

data class Person(var name: String, var age: Int, var job:String)
{
    fun printPerson() = println(this.toString())


}

fun String.println()= println(this)