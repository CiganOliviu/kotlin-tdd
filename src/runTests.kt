import org.Source.*;

fun main () {

    val FactSrc = FactorialSource()
    val FiboSrc = FibonacciSource()
    val LargestCommonDivisorSrc = LargestCommonDivisorSource()
    val Runner = Tests()

    Runner.TestFactorialFunction(FactSrc)
    Runner.TestFibonacciFunction(FiboSrc)
    Runner.TestGetTheLargestCommonDivisorFunction(LargestCommonDivisorSrc)
}
