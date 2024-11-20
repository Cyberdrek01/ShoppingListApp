package eu.tutorialls.day4
//67
fun main(){
    val shoppingList= mutableListOf("Graphics card","RAM","SSD","Monitor")
    for (item in shoppingList){
        print(item)
        if(item=="RAM"){
            break
        }
    }
}
