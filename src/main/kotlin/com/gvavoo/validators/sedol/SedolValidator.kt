package com.gvavoo.validators.sedol

class SedolValidator {
    fun validate(code: String): Boolean {
        val weight: IntArray = intArrayOf(1, 3, 1, 7, 3, 9, 1)

        val input = code.substring(0, 6)
        if (!input.matches(Regex("^[0-9BCDFGHJKLMNPQRSTVWXYZ]{6}\$"))) {
            throw IllegalArgumentException("invalid SEDOL number")
        }
        var sum = 0
        for (i in 0 until input.length) {
            sum += weight[i] * Integer.parseInt(input.get(i).toString())
        }
        val checkDigit = (10 - sum % 10) % 10
        return code == input + checkDigit.toString()
    }
}