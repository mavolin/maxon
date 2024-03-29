package com.github.mavolin.maxon.jsonvalues;

import com.github.mavolin.maxon.exceptions.IllegalTypeRequestedException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/**
 * A {@code JsonElement} is the Object used by {@link JsonArray JsonArrays} and {@link JsonObject JsonObjects} in their
 * respective collections, to make the use of the enhanced for loop more easy to use. To do so {@code JsonElement}
 * contains {@code getAsX()} methods to prevent the need of casting on the user end.
 */
public class JsonElement {


    /**
     * The value of the {@code JsonElement}.
     */
    private JsonValue value;


    /**
     * Creates a new {@code JsonElement} holding the passed {@link JsonValue JsonValue}.
     *
     * @param value
     *         the value
     */
    public JsonElement(JsonValue value) {

        this.value = Objects.requireNonNullElse(value, JsonPrimitive.NULL);
    }


    /**
     * Checks if the {@code JsonElement} is JSON null
     *
     * @return {@code true} if the {@code JsonElement} is null; {@code false} otherwise
     */
    public boolean isNull() {

        if (!(this.value instanceof JsonPrimitive)) {
            return false;
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        return jsonPrimitive.isNull();
    }

    /**
     * Checks if the {@code JsonElement} represents a {@code boolean}.
     *
     * @return {@code true} if the {@code JsonElement} represents a {@code boolean}; {@code false} otherwise
     */
    public boolean isBoolean() {

        if (!(this.value instanceof JsonPrimitive)) {
            return false;
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        return jsonPrimitive.isBoolean();
    }

    /**
     * Checks if the {@code JsonElement} represents a {@code character}.
     *
     * @return {@code true} if the {@code JsonElement} represents a {@code character}; {@code false} otherwise
     */
    public boolean isCharacter() {

        if (!(this.value instanceof JsonPrimitive)) {
            return false;
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        return jsonPrimitive.isCharacter();
    }

    /**
     * Checks if the {@code JsonElement} represents a {@link Number Number}.
     *
     * @return {@code true} if the {@code JsonElement} represents a {@link Number}; {@code false} otherwise
     */
    public boolean isNumber() {

        if (!(this.value instanceof JsonPrimitive)) {
            return false;
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        return jsonPrimitive.isNumber();
    }

    /**
     * Checks if the {@code JsonElement} represents a {@link String String}.
     *
     * @return {@code true} if the {@code JsonElement} represents a {@link String}; {@code false} otherwise
     */
    public boolean isString() {

        if (!(this.value instanceof JsonPrimitive)) {
            return false;
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        return jsonPrimitive.isString();
    }

    /**
     * Checks if the {@code JsonElement} represents a {@link JsonArray JsonArray}.
     *
     * @return {@code true} if the {@code JsonElement} represents a {@link JsonArray}; {@code false} otherwise
     */
    public boolean isJsonArray() {

        return this.value instanceof JsonArray;
    }

    /**
     * Checks if the {@code JsonElement} represents a {@link JsonObject JsonObject}.
     *
     * @return {@code true} if the {@code JsonElement} represents a {@link JsonObject}; {@code false} otherwise
     */
    public boolean isJsonObject() {

        return this.value instanceof JsonObject;
    }

    /**
     * Gets this {@code JsonElement} as a {@link Boolean Boolean}.
     *
     * @return the {@link Boolean Boolean}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Boolean}
     */
    public Boolean getAsBoolean() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Boolean");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isBoolean() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Boolean");
        }

        return jsonPrimitive.getAsBoolean();
    }

    /**
     * Gets this {@code JsonElement} as a {@link Character Character}.
     *
     * @return the {@link Character Character}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Character}
     */
    public Character getAsCharacter() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Character");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isCharacter() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Character");
        }

        return jsonPrimitive.getAsCharacter();
    }

    /**
     * Gets this {@code JsonElement} as a {@link Byte Byte}.
     *
     * @return the {@link Byte Byte}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Byte}
     */
    public Byte getAsByte() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Byte");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Byte");
        }

        return jsonPrimitive.getAsByte();
    }

    /**
     * Gets this {@code JsonElement} as a {@link Short Short}.
     *
     * @return the {@link Short Short}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Short}
     */
    public Short getAsShort() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Short");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Short");
        }

        return jsonPrimitive.getAsShort();
    }

    /**
     * Gets this {@code JsonElement} as an {@link Integer Integer}.
     *
     * @return the {@link Integer Integer}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Integer}
     */
    public Integer getAsInteger() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Integer");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Integer");
        }

        return jsonPrimitive.getAsInteger();
    }

    /**
     * Gets this {@code JsonElement} as a {@link Long Long}.
     *
     * @return the {@link Long Long}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Long}
     */
    public Long getAsLong() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Long");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Long");
        }

        return jsonPrimitive.getAsLong();
    }

    /**
     * Gets this {@code JsonElement} as a {@link BigInteger BigInteger}.
     *
     * @return the {@link BigInteger BigInteger}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code BigInteger}
     */
    public BigInteger getAsBigInteger() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a BigInteger");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a BigInteger");
        }

        return jsonPrimitive.getAsBigInteger();
    }

    /**
     * Gets this {@code JsonElement} as a {@link Float Float}.
     *
     * @return the {@link Float Float}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Float}
     */
    public Float getAsFloat() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Float");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Float");
        }

        return jsonPrimitive.getAsFloat();
    }

    /**
     * Gets this {@code JsonElement} as a {@link Double Double}.
     *
     * @return the {@link Double Double}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code Double}
     */
    public Double getAsDouble() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Double");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a Double");
        }

        return jsonPrimitive.getAsDouble();
    }

    /**
     * Gets this {@code JsonElement} as a {@link BigDecimal BigDecimal}.
     *
     * @return the {@link BigDecimal BigDecimal}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code BigDecimal}
     */
    public BigDecimal getAsBigDecimal() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a BigDecimal");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isNumber() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a BigDecimal");
        }

        return jsonPrimitive.getAsBigDecimal();
    }

    /**
     * Gets this {@code JsonElement} as a {@link String String}.
     *
     * @return the {@link String String}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code String}
     */
    public String getAsString() {

        if (!(this.value instanceof JsonPrimitive)) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a String");
        }

        JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

        if (!jsonPrimitive.isString() && !jsonPrimitive.isNull()) {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a String");
        }

        return jsonPrimitive.getAsString();
    }

    /**
     * Gets this {@code JsonElement} as a {@link JsonObject JsonArray}.
     *
     * @return the {@link JsonObject JsonArray}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code JsonArray}
     */
    public JsonArray getAsJsonArray() {

        if (this.value instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

            if (jsonPrimitive.isNull()) {
                return null;
            } else {
                throw new IllegalTypeRequestedException("The JsonElement does not resemble a JsonArray");
            }
        } else if (this.value instanceof JsonArray) {
            return (JsonArray) this.value;
        } else {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a JsonArray");
        }
    }

    /**
     * Gets this {@code JsonElement} as a {@link JsonObject JsonObject}.
     *
     * @return the {@link JsonObject JsonObject}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code JsonObject}
     */
    public JsonObject getAsJsonObject() {

        if (this.value instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) this.value;

            if (jsonPrimitive.isNull()) {
                return null;
            } else {
                throw new IllegalTypeRequestedException("The JsonElement does not resemble a JsonObject");
            }
        } else if (this.value instanceof JsonObject) {
            return (JsonObject) this.value;
        } else {
            throw new IllegalTypeRequestedException("The JsonElement does not resemble a JsonObject");
        }
    }

    /**
     * Gets this {@code JsonElement} as a {@link JsonValue JsonValue}.
     *
     * @return the {@link JsonValue JsonOValue}
     *
     * @throws IllegalTypeRequestedException
     *         if this {@code JsonElement's} value is not an instance of {@code JsonValue}
     */
    public JsonValue getAsJsonValue() {

        return this.value;
    }

    /**
     * Checks, whether or not this {@code JsonElement} is equal to the provided {@code Object o}.
     *
     * @param o
     *         the {@link Object} that is to be compared with this {@code JsonElement}
     *
     * @return {@code true} if {@code Object o} and this {@code JsonElement} are equal; {@code false} otherwise
     */
    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (!(o instanceof JsonElement)) {
            return false;
        }

        JsonElement that = (JsonElement) o;

        return this.value.equals(that.value);
    }

    /**
     * Generates a hash code that is unique to every object, that is not equal to one another, as defined by {@link
     * #equals(Object)}, but is the same for every {@code JsonElement} that is equal.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {

        return this.value.hashCode();
    }

    /**
     * Returns a {@link String String} representation of this {@code JsonElement}.
     *
     * @return a {@link String String} representation of this {@code JsonElement}
     */
    @Override
    public String toString() {

        return this.value.toString();
    }


}
