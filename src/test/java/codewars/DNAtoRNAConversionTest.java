package codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DNAtoRNAConversionTest {
    @Test
    public void testDna() throws Exception {
        DNAtoRNAConversion b = new DNAtoRNAConversion();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        DNAtoRNAConversion b = new DNAtoRNAConversion();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}