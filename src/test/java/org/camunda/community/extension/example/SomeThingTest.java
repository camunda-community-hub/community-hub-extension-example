package org.camunda.community.extension.example;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SomeThingTest {

    private SomeThing testThing = new SomeThing();

    @Test
    public void testDoIt() {
        assertThat(testThing.doIt(1)).isEqualTo(2);
    }
}
