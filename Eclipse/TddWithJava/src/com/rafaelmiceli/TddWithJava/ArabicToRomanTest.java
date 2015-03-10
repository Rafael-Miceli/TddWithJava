package com.rafaelmiceli.TddWithJava;


import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ArabicToRomanTest {

    @Test
    public void test_Convert_1_to_I() throws Exception {
        Integer inputToTest = 1;
        String expected =  "I";
        ArabicToRoman sut = new ArabicToRoman();
        String result = sut.convert(inputToTest);

        assertThat(result, is(expected));
    }

    @Test
    public void test_Convert_10_to_X() throws Exception {
        Integer inputToTest = 10;
        String expected =  "X";
        ArabicToRoman sut = new ArabicToRoman();
        String result = sut.convert(inputToTest);

        assertThat(result, is(expected));
    }

    @Test
    public void test_Convert_2_to_II() throws Exception {
        Integer inputToTest = 2;
        String expected =  "II";
        ArabicToRoman sut = new ArabicToRoman();
        String result = sut.convert(inputToTest);

        assertThat(result, is(expected));
    }

    @Test
    public void test_Convert_4_to_IV() throws Exception {
        Integer inputToTest = 4;
        String expected =  "IV";
        ArabicToRoman sut = new ArabicToRoman();
        String result = sut.convert(inputToTest);

        assertThat(result, is(expected));
    }

    @Test
    public void test_Convert_5_to_V() throws Exception {
        Integer inputToTest = 5;
        String expected =  "V";
        ArabicToRoman sut = new ArabicToRoman();
        String result = sut.convert(inputToTest);

        assertThat(result, is(expected));
    }

    @Test
    public void test_Convert_9_to_IX() throws Exception {
        Integer inputToTest = 9;
        String expected =  "IX";
        ArabicToRoman sut = new ArabicToRoman();
        String result = sut.convert(inputToTest);

        assertThat(result, is(expected));
    }
}