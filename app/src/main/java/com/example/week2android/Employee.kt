package com.example.week2android
class Employee(val employeeId: Int, val employeeName:String) {
}
fun main(){
    //val emp = Employee(1,"s")
    val emp: Employee?
    null.also { emp = it }
    if(emp == null){
        println("emp is null")
    }
    else{
        println(emp?.employeeId)
        println(emp?.employeeName)
        println(emp!!.employeeId)
        println(emp!!.employeeName)
    }
    fun performTask(callback: Callback) {
        // Simulating some task
        val result = "Task completed successfully"
        callback(result)
    }
    val result = Driver.performOperation(10, 5) { a, b ->
        a - b
    }
    println("Result of subtraction: $result") // Output: R
    fun performOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

}
