package com.github.mavolin.maxon.jsonvalues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonPrimitiveTest {


    @Test
    void isNullTest() {

        JsonPrimitive jsonNull = new JsonPrimitive((String) null);
        JsonPrimitive jsonBoolean = new JsonPrimitive(true);
        JsonPrimitive jsonCharacter = new JsonPrimitive('a');
        JsonPrimitive jsonNumber = new JsonPrimitive(12345);
        JsonPrimitive jsonString = new JsonPrimitive("String");
        
        assertTrue(jsonNull.isNull());
        assertFalse(jsonBoolean.isNull());
        assertFalse(jsonCharacter.isNull());
        assertFalse(jsonNumber.isNull());
        assertFalse(jsonString.isNull());
    }

    @Test
    void isBooleanTest() {

        JsonPrimitive jsonNull = new JsonPrimitive((String) null);
        JsonPrimitive jsonBoolean = new JsonPrimitive(true);
        JsonPrimitive jsonCharacter = new JsonPrimitive('a');
        JsonPrimitive jsonNumber = new JsonPrimitive(12345);
        JsonPrimitive jsonString = new JsonPrimitive("String");

        assertFalse(jsonNull.isBoolean());
        assertTrue(jsonBoolean.isBoolean());
        assertFalse(jsonCharacter.isBoolean());
        assertFalse(jsonNumber.isBoolean());
        assertFalse(jsonString.isBoolean());
    }

    @Test
    void isCharacterTest() {

        JsonPrimitive jsonNull = new JsonPrimitive((String) null);
        JsonPrimitive jsonBoolean = new JsonPrimitive(true);
        JsonPrimitive jsonCharacter = new JsonPrimitive('a');
        JsonPrimitive jsonNumber = new JsonPrimitive(12345);
        JsonPrimitive jsonString = new JsonPrimitive("String");

        assertFalse(jsonNull.isCharacter());
        assertFalse(jsonBoolean.isCharacter());
        assertTrue(jsonCharacter.isCharacter());
        assertFalse(jsonNumber.isCharacter());
        assertFalse(jsonString.isCharacter());
    }

    @Test
    void isNumberTest() {

        JsonPrimitive jsonNull = new JsonPrimitive((String) null);
        JsonPrimitive jsonBoolean = new JsonPrimitive(true);
        JsonPrimitive jsonCharacter = new JsonPrimitive('a');
        JsonPrimitive jsonNumber = new JsonPrimitive(12345);
        JsonPrimitive jsonString = new JsonPrimitive("String");

        assertFalse(jsonNull.isNumber());
        assertFalse(jsonBoolean.isNumber());
        assertFalse(jsonCharacter.isNumber());
        assertTrue(jsonNumber.isNumber());
        assertFalse(jsonString.isNumber());
    }

    @Test
    void isStringTest() {

        JsonPrimitive jsonNull = new JsonPrimitive((String) null);
        JsonPrimitive jsonBoolean = new JsonPrimitive(true);
        JsonPrimitive jsonCharacter = new JsonPrimitive('a');
        JsonPrimitive jsonNumber = new JsonPrimitive(12345);
        JsonPrimitive jsonString = new JsonPrimitive("String");

        assertFalse(jsonNull.isString());
        assertFalse(jsonBoolean.isString());
        assertFalse(jsonCharacter.isString());
        assertFalse(jsonNumber.isString());
        assertTrue(jsonString.isString());
    }


}