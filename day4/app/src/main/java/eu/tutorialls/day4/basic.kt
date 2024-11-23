package eu.tutorialls.day4
//67
//fun main(){
//    val shoppingList= mutableListOf("Graphics card","RAM","SSD","Monitor")
//    println(shoppingList.size)
//    for (index in 0 until shoppingList.size){
//        println("item ${shoppingList[index]} is at index $index ")
//
//    }
//}

fun main() {
    val numbers=mutableListOf(1,2,3,4,5)
    for(index in 0 until numbers.size){
        numbers[index]=numbers[index]*2
        println(numbers[index])
    }
}
