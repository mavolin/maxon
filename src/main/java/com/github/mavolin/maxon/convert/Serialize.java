package com.github.mavolin.maxon.convert;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The {@code Serialize} interface is used to annotate fields that are to be serialized in the serialization process
 * done by the {@link com.github.mavolin.maxon.converter.UniversalObjectConverter UniversalObjectConverter}. If no
 * field gets annotated, all fields will be serialized. Optionally a custom name can be picked, that will be used
 * instead of the name of the field.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Serialize {


    /**
     * If passed when annotating, the passed {@link String String} will be used as name for the value instead of the
     * literal field name.
     *
     * @return a custom field name or "[USE FIELD NAME]" if no custom value was specified
     */
    String value() default "[USE FIELD NAME]";


}
