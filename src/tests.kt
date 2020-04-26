package org.Source

import kotlin.test.assertEquals

class Tests {

    fun TestFactorialFunction (FactSrc: FactorialSource) {

        assertEquals(
                1,
                FactSrc.Factorial(0)
        )

        assertEquals(
                6,
                FactSrc.Factorial(3)
        )

        assertEquals(
                120,
                FactSrc.Factorial(5)
        )

        assertEquals(
                5040,
                FactSrc.Factorial(7)
        )
    }

    fun TestFibonacciFunction (FiboSrc: FibonacciSource) {

        assertEquals(1,
                FiboSrc.Fibonacci(2)
        )

        assertEquals(8,
                FiboSrc.Fibonacci(6)
        )
        assertEquals(34,
                FiboSrc.Fibonacci(9)
        )

        assertEquals(144,
                FiboSrc.Fibonacci(12)
        )
    }

    fun TestGetTheLargestCommonDivisorFunction (LargestCommonDivisorSrc: LargestCommonDivisorSource) {

        assertEquals(12,
                LargestCommonDivisorSrc.GetTheLargestCommonDivisor(12, 36)
        )

        assertEquals(1,
                LargestCommonDivisorSrc.GetTheLargestCommonDivisor(13, 36)
        )
        assertEquals(2,
                LargestCommonDivisorSrc.GetTheLargestCommonDivisor(160, 362)
        )

        assertEquals(4,
                LargestCommonDivisorSrc.GetTheLargestCommonDivisor(132, 988)
        )
    }
}