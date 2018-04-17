package com.gvavoo.validators.isbn

class IsbnValidator {
    //todo 13digit isbn

    fun validate(number: String): Boolean {
        var t = 0
        var s = 0

        for (i in 0 until number.length) {
            t += Integer.parseInt(number.get(i).toString())
            s += t
        }
        return (s % 11) == 0
    }
}