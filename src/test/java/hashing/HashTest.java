package hashing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HashTest {
	private Hasher hasher = new Hasher();

	/* each Hasher object has no state(no instance variables) so it makes no sens to recreate it before each method
	 * @BeforeEach public void createHasher() { hasher = new Hasher(); }
	 */

	@Test
	public void returnsCorrectHash_1() {
		int expected = 3;
		int actual = hasher.hashUsingArrayList("abc");
		assertEquals(expected, actual);

	}

	@Test
	public void returnsCorrectHash_2() {
		int expected = 6;
		int actual = hasher.hashUsingArrayList("abcd");
		assertEquals(expected, actual);
	}

	@Test
	public void returnsCorrectHash_3() {
		int expected = 3 * 25;
		int actual = hasher.hashUsingArrayList("zzz");
		assertEquals(expected, actual);
	}

	@Test
	public void whenInvalidChar_thenSkipsThisCharAndReturnsCorrectHash() {
		int expected = 3 * 25;
		int actual = hasher.hashUsingArrayList("zz@z");
		assertEquals(expected, actual);
	}

	@Test
	public void whenEmptyString_thenReturnsZero() {
		int expected = 0;
		int actual = hasher.hashUsingArrayList("");
		assertEquals(expected, actual);
	}

	@Test
	public void whenNullInput_thenReturnsMinusOne() {
		int expected = -1;
		int actual = hasher.hashUsingArrayList(null);
		assertEquals(expected, actual);
	}
}
