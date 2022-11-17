package com.vscode.java.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DisplayerTest {

	@Test
	public void testDisplayHelloWorld() {
		Displayer displayer = new Displayer();
		String displayedText = displayer.displayHelloWorld();
		assertEquals("Hello world", displayedText);
	}
	
}
