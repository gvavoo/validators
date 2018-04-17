package com.gvavoo.validators.sedol

import org.junit.Test

import org.junit.Assert.*

class SedolValidatorTest {

    val sedolValidator = SedolValidator()

    @Test
    fun validate() {
        assertTrue(sedolValidator.validate("0263494"))
        assertTrue(sedolValidator.validate("0263494"))
        assertTrue(sedolValidator.validate("B0WNLY7"))
    }
}