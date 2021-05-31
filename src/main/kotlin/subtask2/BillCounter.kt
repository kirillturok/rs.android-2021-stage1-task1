package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var sum=0
        for(i in 0..k-1){
            sum+=bill[i]
        }
        for (i in k+1..bill.size-1){
            sum+=bill[i]
        }
        sum/=2
        if(sum==b) return "Bon Appetit"
        return (b-sum).toString()
        throw NotImplementedError("Not implemented")
    }
}
