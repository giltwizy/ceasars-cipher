package CeasarCipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasarCipherTest {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();

	@Test
	void testCipheredMessageWithOffset12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("",caesarCipher.cipher("", 12));
	}
	
	@Test
	void testCipheredMessageWithOffset11() {
		assertEquals("tai mdq kag pauzs kqefqdpmk",caesarCipher.cipher("how are you doing yesterday", 12));
	}

}
