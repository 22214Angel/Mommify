import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MommifyTest {
    Mommify converter;

    @Before
    public void setUp() {
        converter= new Mommify();
    }

    @Test
    public void shouldReturnSameWordWhenThereIsNoVowel() {

        assertEquals("bcd", converter.mommify("bcd"));
    }

    @Test
    public void shouldReturnMommyfiedWordWhenThereAreDiscontinuousVowels() {

        assertEquals("MommybcMommydMommy", converter.mommify("abcide"));
    }

    @Test
    public void shouldReturnMommyfiedWordWhenThereAreContinousVowels() {

        assertEquals("Mommiesb", converter.mommify("aeb"));
    }

    @Test
    public void shouldReturnMommyfiedWordWhenThePercentageOfVowelsIsTwentyFive() {

        assertEquals("abcd", converter.mommify("abcd"));
    }

    @Test
    public void shouldReturnMommyfiedWordWhenThePercentageOfVowelsIsThirty() {

        assertEquals("MommybcdMommyfghMommyj", converter.mommify("abcdefghij"));
    }

    @Test
    public void shouldReturnMommyWhenTheWordIsMommy() {

        assertEquals("Mommy", converter.mommify("Mommy"));
    }


    @Test
    public void shouldReturnMommyfiedWordWhenSingleVowelISFollowedByGroup() {

        assertEquals("MommiesbcdMommy", converter.mommify("aabcde"));
    }

    @Test
    public void shouldReturnMommyfiedWordWhenGroupOfVowelsIsFollowedBySingle() {
        assertEquals("MommybcdMommies", converter.mommify("abcdei"));
    }
}
