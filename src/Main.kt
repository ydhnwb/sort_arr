//The unique thing is, breaking the loop after swap happen
//So the logic will loop from the beginning again instead of continuing check

fun main(args: Array<String>){
    val arr = arrayOf(4, 9, 7, 5, 8, 9, 3)
    sortArr(arr)
}

fun sortArr(arr: Array<Int>){
    var counter = 0
    var isShouldCheck = true
    while (isShouldCheck){
        isShouldCheck = false
        for (i in 0 until arr.size - 1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp
                counter++
                println("${counter}. [${arr[i]}, ${arr[i+1]}] ${arr.joinToString(" ")}")
                isShouldCheck = true
                break
            }
        }
    }
    println("Jumlah swap : $counter")
}