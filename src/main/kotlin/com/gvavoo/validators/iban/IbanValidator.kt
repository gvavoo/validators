package com.gvavoo.validators.iban

import java.math.BigInteger

class IbanValidator {

    val ibanRegex = "[a-zA-Z]{2}[0-9]{2}[a-zA-Z0-9]{4}[0-9]{7}([a-zA-Z0-9]?){0,16}"

    fun validate(number: String): Boolean {

        if (!number.matches(Regex(ibanRegex))){
            return false
        }

        val lettersMap: Map<Char, Int> = hashMapOf('A' to 10, 'B' to 11, 'C' to 12, 'D' to 13, 'E' to 14,
                'F' to 15, 'G' to 16, 'H' to 17, 'I' to 18, 'J' to 19, 'K' to 20, 'L' to 21, 'M' to 22, 'N' to 23, 'O' to 24,
                'P' to 25, 'Q' to 26, 'R' to 27, 'S' to 28, 'T' to 29, 'U' to 30, 'V' to 31, 'W' to 32, 'X' to 33, 'Y' to 34, 'Z' to 35)

        val firstLetters = number.substring(0, 4)
        val remainderLetters = number.substring(4, number.length)
        val reversedNumber = remainderLetters + firstLetters
        var res = ""
        for (c in reversedNumber) {
            res += if (c.isLetter()) lettersMap.get(c) else c
        }
        val num: BigInteger = res.toBigInteger()
        return ((num.mod(BigInteger.valueOf(97L)) == BigInteger.ONE))
    }
}