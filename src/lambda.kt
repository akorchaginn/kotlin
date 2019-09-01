import java.util.*

fun lambda() {
    val lambdaArray = {input: Array<String> ->
        println(Arrays.toString(input))
    }
    lambdaArray(arrayOf("One", "Two", "Three"))
}