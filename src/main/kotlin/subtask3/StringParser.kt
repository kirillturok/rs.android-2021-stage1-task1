package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val result = mutableListOf<String>()
        val open = arrayOf('<', '[', '(')
        val close = arrayOf('>',']',')')
        for (i in inputString.indices) {
            if (inputString[i] !in open) continue
            var ind = open.indexOf(inputString[i])
            var counter = 0
            for (k in i..inputString.lastIndex) {
                if (inputString[k] == open[ind]) {
                    counter++
                }
                if (inputString[k] == close[ind]) {
                    counter--
                    if (counter == 0) {
                        result.add(inputString.substring(i+1..k-1))
                        break
                    }
                }
            }
        }
        return result.toTypedArray()
        throw NotImplementedError("Not implemented")
    }
}
