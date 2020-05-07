/*
MIT License

Copyright (c) 2020 Cigan Oliviu David

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

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
