/**
 * 
 */
package com.sample.annotationTest;

import org.junit.Test;
import static org.junit.Assert.*;

import com.sample.java8.SampleApplication;

/**
 * @author ppoudel
 *
 */
public class TestSampleApplication {


    @Test
    public void testCustomAnnotation() {
        SampleApplication sampleApplication = new SampleApplication();
        assertEquals("Should return custom string", "custom",
                sampleApplication.getCustomAnnotationValue());

        //                .forEach(
        //                        m -> System.out.println(m.getAnnotation(
        //                                CustomAnnotation.class).value()
        //                                + " -- "
        //                                + m.getAnnotation(CustomAnnotation.class)
        //                                        .myHelp()));

    }
}
