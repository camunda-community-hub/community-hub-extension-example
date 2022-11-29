package org.camunda.community.extension.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SomeThingTest {

    private final SomeThing testThing = new SomeThing();

    @Test
    public void testDoIt() {
        assertThat(testThing.doIt(1)).isEqualTo(2);
    }

    /**
     * Tests fails if called with -DfailTest=true
     */
    @Test
    public void testToFail() {
        final Boolean failTest = Boolean.valueOf(System.getProperty("failTest", "false"));
        assertThat(failTest).isEqualTo(false);
    }
}
