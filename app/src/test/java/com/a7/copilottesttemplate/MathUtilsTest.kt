package com.a7.copilottesttemplate

import org.junit.Assert.assertEquals
import org.junit.Test

class MathUtilsTest {
    @Test
    fun testAdd() {
        assertEquals(4, MathUtils.add(2, 2))
    }
}
