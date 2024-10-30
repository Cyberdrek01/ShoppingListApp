package eu.tutorialls.day3

import java.util.function.ToIntFunction

fun main(){
    println("Who is this coffee for: ")
    val name= readln()
    println("How many cubes of sugar: ")
    val sugarCount= readln()
    val sugarCountInt=sugarCount.toInt()
    makeCoffee(sugarCountInt, name)
}

fun makeCoffee(sugarCount: Int, name: String){
    if(sugarCount==1) {
        println("$name like's $sugarCount spoon of sugar")
    }
    else if(sugarCount==0){
        println("$name like's $sugarCount spoon of sugar")
    }
    else{
        println("$name like's $sugarCount spoons of sugar")
    }
}