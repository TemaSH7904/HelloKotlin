fun main() {
    val line1: String? = null
    val line2: String? = "12332"
    val line3: String? = ""

    val result = (line1?.length?:0) + (line2?.length?:0) + (line3?.length?:0)

    println(result)
}