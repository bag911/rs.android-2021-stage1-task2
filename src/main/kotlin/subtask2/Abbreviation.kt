package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val aString = a.toUpperCase()
        var j = 0
        for (i in aString){
            if (i == b[j]){
              j++
                if (j>b.length-1) return "YES"
            }
        }

        return "NO"
    }
}
