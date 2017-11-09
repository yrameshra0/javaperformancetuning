package com.deepsydoodle.javaperformance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SampleTest {

    @Test
    public void sample_test() throws Exception {
        Sample sample = new Sample();

        assertThat(sample.someMethod(), is(true));
    }
}
