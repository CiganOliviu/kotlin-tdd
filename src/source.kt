package org.Source

class FactorialSource {

    fun Factorial (Number: Int) : Int {

        var Result = 1

        if (Number == 0 || Number == 1)
            return Result

        Result = Factorial (Number - 1) * Number;

        return Result
    }
}

class FibonacciSource {

    fun Fibonacci (Number: Int) : Int {

        var Result = 1

        if (Number == 1 || Number == 2)
            return Result

        Result = Fibonacci(Number - 1) + Fibonacci(Number - 2)

        return Result
    }
}

class LargestCommonDivisorSource {

    fun GetTheLargestCommonDivisor (LowPoint: Int, HighPoint: Int) : Int {

        var Result = 1
        var CopyLowPoint = LowPoint
        var CopyHighPoint = HighPoint
        var rest = CopyLowPoint % CopyHighPoint

        while (rest != 0) {
            CopyLowPoint = CopyHighPoint
            CopyHighPoint = rest;
            rest = CopyLowPoint % CopyHighPoint
        }

        Result = CopyHighPoint

        return Result
    }
}