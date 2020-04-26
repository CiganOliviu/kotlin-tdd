import org.Source.FactorialSource
import org.Source.FibonacciSource
import org.Source.LargestCommonDivisorSource
import org.Source.Tests

fun main () {

    var FactSrc = FactorialSource()
    var FiboSrc = FibonacciSource()
    var LargestCommonDivisorSrc = LargestCommonDivisorSource()
    var Runner = Tests()

    Runner.TestFactorialFunction(FactSrc)
    Runner.TestFibonacciFunction(FiboSrc)
    Runner.TestGetTheLargestCommonDivisorFunction(LargestCommonDivisorSrc)
}
