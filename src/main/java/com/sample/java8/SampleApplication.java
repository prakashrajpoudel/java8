/**
 * 
 */
package com.sample.java8;

import java.lang.reflect.Method;
import java.util.Arrays;

import com.sample.annotation.CustomAnnotation;

/**
 * @author ppoudel
 *
 */
public class SampleApplication {

    @CustomAnnotation(value = "custom", enabled = true)
    public int getTestVar() {
        return 0;
    }

    public String getCustomAnnotationValue() {
        Class<SampleApplication> obj = SampleApplication.class;
        for (Method m : obj.getDeclaredMethods()) {
            if (m.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation myownAnn = m
                        .getAnnotation(CustomAnnotation.class);
                myownAnn.value();
            }
        }
        return Arrays.asList(obj.getDeclaredMethods()).stream()
                .filter(m -> m.isAnnotationPresent(CustomAnnotation.class))
                .findFirst().get().getAnnotation(CustomAnnotation.class)
                .value();
    }
}

