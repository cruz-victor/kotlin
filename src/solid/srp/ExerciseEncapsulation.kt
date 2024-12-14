package solid.srp

class BankAccount(var balance: Double) {
    fun depositMoney(money:Double) {
        if (money>0){
            balance+=money
        }
    }

    fun withdrawMoney(money:Double): Boolean {
        if (money<=balance){
            balance-=money
            return true
        }else{
            return false
        }
    }

    fun showBalance() {
        println("El saldo actual es: $balance")
    }
}

fun main(){
    val bank=BankAccount(1000.00)
    bank.showBalance()

    bank.depositMoney(50.00)
    bank.showBalance()

    bank.withdrawMoney(20.00)
    bank.showBalance()
}