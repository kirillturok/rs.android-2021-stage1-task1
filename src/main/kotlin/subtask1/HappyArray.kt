package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var res = sadArray.toMutableList()
        var hasChanged: Boolean =true
        while (hasChanged) {
            var i=1
            hasChanged = false
            while (i < res.size - 1) {
                if (res[i - 1] + res[i + 1] < res[i]) {
                    res.removeAt(i)
                    hasChanged = true
                } else {
                    i++
                }
            }
        }
        return res.toIntArray()
        throw NotImplementedError("Not implemented")
    }
}
