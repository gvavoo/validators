package com.gvavoo.validators.iban

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IbanValidatorTest {
    val ibanValidator: IbanValidator = IbanValidator()

    @Test
    fun validate_validNumbers() {
        assertTrue(ibanValidator.validate("GR1601101250000000012300695"))
        assertTrue(ibanValidator.validate("AL47212110090000000235698741"))
        assertTrue(ibanValidator.validate("AD1200012030200359100100"))
        assertTrue(ibanValidator.validate("AT611904300234573201"))
        assertTrue(ibanValidator.validate("AZ21NABZ00000000137010001944"))
        assertTrue(ibanValidator.validate("BH67BMAG00001299123456"))
        assertTrue(ibanValidator.validate("BE62510007547061"))
        assertTrue(ibanValidator.validate("BA391290079401028494"))
        assertTrue(ibanValidator.validate("BG80BNBG96611020345678"))
        assertTrue(ibanValidator.validate("HR1210010051863000160"))
        assertTrue(ibanValidator.validate("CY17002001280000001200527600"))
        assertTrue(ibanValidator.validate("CZ6508000000192000145399"))
        assertTrue(ibanValidator.validate("DK5000400440116243"))
        assertTrue(ibanValidator.validate("EE382200221020145685"))
        assertTrue(ibanValidator.validate("FO9754320388899944"))
        assertTrue(ibanValidator.validate("FI2112345600000785"))
        assertTrue(ibanValidator.validate("FR1420041010050500013M02606"))
        assertTrue(ibanValidator.validate("GE29NB0000000101904917"))
        assertTrue(ibanValidator.validate("DE89370400440532013000"))
        assertTrue(ibanValidator.validate("GI75NWBK000000007099453"))
        assertTrue(ibanValidator.validate("GR1601101250000000012300695"))
        assertTrue(ibanValidator.validate("HU42117730161111101800000000"))
        assertTrue(ibanValidator.validate("IS140159260076545510730339"))
        assertTrue(ibanValidator.validate("IE29AIBK93115212345678"))
        assertTrue(ibanValidator.validate("IL620108000000099999999"))
        assertTrue(ibanValidator.validate("IT40S0542811101000000123456"))
        assertTrue(ibanValidator.validate("JO94CBJO0010000000000131000302"))
        assertTrue(ibanValidator.validate("KW81CBKU0000000000001234560101"))
        assertTrue(ibanValidator.validate("LV80BANK0000435195001"))
        assertTrue(ibanValidator.validate("LB62099900000001001901229114"))
        assertTrue(ibanValidator.validate("LI21088100002324013AA"))
        assertTrue(ibanValidator.validate("LT121000011101001000"))
        assertTrue(ibanValidator.validate("LU280019400644750000"))
        assertTrue(ibanValidator.validate("MK07250120000058984"))
        assertTrue(ibanValidator.validate("MT84MALT011000012345MTLCAST001S"))
        assertTrue(ibanValidator.validate("MU17BOMM0101101030300200000MUR"))
        assertTrue(ibanValidator.validate("MD24AG000225100013104168"))
        assertTrue(ibanValidator.validate("MC9320052222100112233M44555"))
        assertTrue(ibanValidator.validate("ME25505000012345678951"))
        assertTrue(ibanValidator.validate("NL39RABO0300065264"))

    }

    @Test
    fun validate_inValidNumbers() {
        assertFalse(ibanValidator.validate("99999"))


    }
}