package com.gvavoo.validators.creditcard

class CreditCardValidator {

    fun isCreditCardValid(number: String): Boolean {
        if (!number.matches(Regex("\\d{12,18}"))) {
            return false
        }

        var sum: Int = Integer.parseInt(number[number.length - 1].toString())
        val nDigits: Int = number.length
        val parity: Int = nDigits % 2
        for (i in 0 until nDigits - 1) {
            var digit = Integer.parseInt(number[i].toString())
            if (i % 2 == parity) digit *= 2
            if (digit > 9) digit -= 9
            sum += digit
        }
        return (sum % 10) == 0
    }
}