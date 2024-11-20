package eu.tutorialls.calculator
fun main(){
    println("Enter your first number: ")
    val num1= readln().toInt()
    println("Enter your second number: ")
    val num2= readln().toInt()
    println("Enter 1 for Add, 2 for subtract, 3 for multiplication, 4 for division: ")
    val choice= readln().toInt()
    if(choice==1){
        val result=add(num1,num2)
        println("The sum is:$result")
    }
    else if(choice==2){
        val result=subs(num1,num2)
        println("The subs is:$result")
    }
    else if(choice==3){
        val result=mul(num1,num2)
        println("The subs is:$result")
    }
    else if(choice==4){
        val result=div(num1,num2)
        println("The subs is:$result")
    }



}
fun add(num1: Int, num2: Int): Int {
    return num1+num2
}
fun subs(num1:Int,num2:Int):Int{
    return num1-num2
}
fun mul(num1:Int,num2:Int):Int{
    return num1*num2
}
fun div(num1:Int,num2:Int):Int{
    return num1/num2
}