package eu.tutorialls.bankaccountprogram

fun main(){

    val deniseBankAccount= BankAccount(accountHolder = "Danis Panjuta", balance= 13456.21)
    deniseBankAccount.deposit(amount = 200.0)
    deniseBankAccount.withdraw(amount = 1200.00)
    deniseBankAccount.deposit(amount = 3000.00)
    deniseBankAccount.withdraw(amount = 3333.16)
    deniseBankAccount.displayTransactionHistory()
    println("${deniseBankAccount.accountHolder}'s balance is ${deniseBankAccount.balance}")
}