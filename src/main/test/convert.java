package main.test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.either;
import static org.junit.Assert.assertEquals;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import main.java.converter.PigLatin;

import static org.hamcrest.CoreMatchers.*;
public class convert {

	@Test
	public void test() {
		PigLatin pig = new PigLatin();
		String s = pig.convertWord("donia");

		assertEquals("oniaday", s);
	//	assertThat(s,either(containsString("ay")).or (containsString("way")));
	}

	

}
