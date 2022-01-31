/** Program.java
 * 
 */
package com.github.aveva.adhClientCredsJava;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test for simple App.
 */
public class ProgramTest {
    @Test
    public void runMainProgram() throws java.io.IOException {
        assertTrue(Program.toRun());
    }
}