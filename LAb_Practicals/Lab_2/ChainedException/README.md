Chained Exception helps to identify a situation in which one exception causes another Exception in an application.
For instance, consider a method which throws an ArithmeticException because of an attempt to divide by zero but the actual cause of exception was an I/O error which caused the divisor to be zero.
