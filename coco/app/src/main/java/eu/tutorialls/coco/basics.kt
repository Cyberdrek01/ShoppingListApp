package eu.tutorialls.coco

fun main(){
    var age=0
    println("Enter the age: ")
    val enteredValue=readln()
    age=enteredValue.toInt()
    if(age>=22 && age<49){
        println("enter")

    }else if(age>40){
        println("To old")
    }
    else{
        println{"no entry"}
    }
    }