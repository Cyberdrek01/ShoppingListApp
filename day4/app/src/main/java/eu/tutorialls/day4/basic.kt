package eu.tutorialls.day4

fun main(){
    //Immutable list-cannot add items after initialization
    //val shoppingList= listOf("Processor","RAM","Graphics Card","SSD")
    //mutable list- can add items later and modify
    val shoppingList= mutableListOf("Processor","RAM","Graphics Card","SSD")
    //addin gitems in the list
    shoppingList.add("colling system")
    shoppingList.remove(element = "Graphics Card")
    print(shoppingList)
}
