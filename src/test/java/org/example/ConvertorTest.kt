package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals


class ConvertorTest {

    @Test
    fun whenNumberGreater4000000ThenException() {
        assertThrows<IllegalArgumentException> {
            Convertor.convertArabicToRoman(4000001)
        }
    }

    @Test
    fun whenNumberLess1ThenException() {
        assertThrows<IllegalArgumentException> {
            Convertor.convertArabicToRoman(0)
        }
    }

    @Test
    fun whenNumberIs5ThenV() {
        assertEquals("V", Convertor.convertArabicToRoman(5))
    }

    @Test
    fun whenNumberIs12ThenXII() {
        assertEquals("XII", Convertor.convertArabicToRoman(12))
    }

    @Test
    fun whenNumberIs153ThenCLIII() {
        assertEquals("CLIII", Convertor.convertArabicToRoman(153))
    }

    @Test
    fun whenNumberIs639ThenDCXXXIX() {
        assertEquals("DCXXXIX", Convertor.convertArabicToRoman(639))
    }

    @Test
    fun whenNumberIs753ThenDCCLIII() {
        assertEquals("DCCLIII", Convertor.convertArabicToRoman(753))
    }

    @Test
    fun whenNumberIs100000Then_C() {
        assertEquals("_C", Convertor.convertArabicToRoman(100000))
    }

    @Test
    fun whenNumberIs150000Then_C_L() {
        assertEquals("_C_L", Convertor.convertArabicToRoman(150000))
    }

    @Test
    fun whenNumberIs200000Then_C_C() {
        assertEquals("_C_C", Convertor.convertArabicToRoman(200000))
    }

    @Test
    fun whenNumberIs500000Then_D() {
        assertEquals("_D", Convertor.convertArabicToRoman(500000))
    }

    @Test
    fun whenNumberIs750000Then_D_C_C_L() {
        assertEquals("_D_C_C_L", Convertor.convertArabicToRoman(750000))
    }

    @Test
    fun whenNumberIs900000Then_C_M() {
        assertEquals("_C_M", Convertor.convertArabicToRoman(900000))
    }

    @Test
    fun whenNumberIs1000000Then_M() {
        assertEquals("_M", Convertor.convertArabicToRoman(1000000))
    }

    @Test
    fun whenNumberIs2000000Then_M_M() {
        assertEquals("_M_M", Convertor.convertArabicToRoman(2000000))
    }

    @Test
    fun whenNumberIs3000000Then_M_M_M() {
        assertEquals("_M_M_M", Convertor.convertArabicToRoman(3000000))
    }

    @Test
    fun whenNumberIs4000000Then_M_M_M_M() {
        assertEquals("_M_M_M_M", Convertor.convertArabicToRoman(4000000))
    }

    @Test
    fun whenNumberIs123ThenCXXIII() {
        assertEquals("CXXIII", Convertor.convertArabicToRoman(123))
    }

    @Test
    fun whenNumberIs456ThenCDLVI() {
        assertEquals("CDLVI", Convertor.convertArabicToRoman(456))
    }

    @Test
    fun whenNumberIs789ThenDCCLXXXIX() {
        assertEquals("DCCLXXXIX", Convertor.convertArabicToRoman(789))
    }

    @Test
    fun whenNumberIs3999ThenMMMCMXCIX() {
        assertEquals("MMMCMXCIX", Convertor.convertArabicToRoman(3999))
    }

    @Test
    fun whenNumberIs600000Then_D_C() {
        assertEquals("_D_C", Convertor.convertArabicToRoman(600000))
    }

    @Test
    fun whenNumberIs700000Then_D_C_C() {
        assertEquals("_D_C_C", Convertor.convertArabicToRoman(700000))
    }

    @Test
    fun whenNumberIs300000Then_C_C_C() {
        assertEquals("_C_C_C", Convertor.convertArabicToRoman(300000))
    }

    @Test
    fun whenNumberIs400000Then_C_D() {
        assertEquals("_C_D", Convertor.convertArabicToRoman(400000))
    }

    @Test
    fun whenNumberIs800000Then_D_C_C_C() {
        assertEquals("_D_C_C_C", Convertor.convertArabicToRoman(800000))
    }

    @Test
    fun whenNumberIs112457Then_C_XMMCDLVII() {
        assertEquals("_C_XMMCDLVII", Convertor.convertArabicToRoman(112457))
    }

    @Test
    fun whenNumberIs2547234Then_M_M_D_X_L_VMMCCXXXIV() {
        assertEquals("_M_M_D_XL_VMMCCXXXIV", Convertor.convertArabicToRoman(2547234))
    }

    @Test
    fun whenNumberIs3345234Then_M_M_M_C_C_C_XL_VCCXXXIV() {
        assertEquals("_M_M_M_C_C_C_XL_VCCXXXIV", Convertor.convertArabicToRoman(3345234))
    }

    @Test
    fun whenNumberIs2333234Then_M_M_C_C_C_X_X_XMMMCCXXXIV() {
        assertEquals("_M_M_C_C_C_X_X_XMMMCCXXXIV", Convertor.convertArabicToRoman(2333234))
    }

    @Test
    fun whenNumberIs2233234Then_M_M_C_C_X_X_XMMMCCXXXIV() {
        assertEquals("_M_M_C_C_X_X_XMMMCCXXXIV", Convertor.convertArabicToRoman(2233234))
    }

    @Test
    fun whenNumberIs3435234Then_M_M_M_C_D_X_X_X_VCCXXXIV() {
        assertEquals("_M_M_M_C_D_X_X_X_VCCXXXIV", Convertor.convertArabicToRoman(3435234))
    }

    @Test
    fun whenNumberIs3000001Then_M_M_MI() {
        assertEquals("_M_M_MI", Convertor.convertArabicToRoman(3000001))
    }

    @Test
    fun whenNumberIs2000005Then_M_MV() {
        assertEquals("_M_MV", Convertor.convertArabicToRoman(2000005))
    }

    @Test
    fun whenNumberIs2000034Then_M_MXXXIV() {
        assertEquals("_M_MXXXIV", Convertor.convertArabicToRoman(2000034))
    }

    @Test
    fun whenNumberIs3000023Then_M_M_C_C_X_X_XMMMCCXXXIII() {
        assertEquals("_M_M_C_C_X_X_XMMMCCXXXIII", Convertor.convertArabicToRoman(2233233))
    }

    @Test
    fun whenNumberIs2233233Then_M_M_C_C_X_X_XMMMCCXXXIII() {
        assertEquals("_M_M_C_C_X_X_XMMMCCXXXIII", Convertor.convertArabicToRoman(2233233))
    }

    @Test
    fun whenNumberIs2233454Then_M_M_C_C_X_X_XMMMCDLIV() {
        assertEquals("_M_M_C_C_X_X_XMMMCDLIV", Convertor.convertArabicToRoman(2233454))
    }

    @Test
    fun whenNumberIs2233674Then_M_M_C_C_X_X_XMMMDCLXXIV(){
        assertEquals("_M_M_C_C_X_X_XMMMDCLXXIV",Convertor.convertArabicToRoman(2233674))
    }

    @Test
    fun whenNumberIs3456345Then_M_M_M_C_D_L_VMCCCXLV(){
        assertEquals("_M_M_M_C_D_L_VMCCCXLV",Convertor.convertArabicToRoman(3456345))
    }
}