package edu.iis.mto.lab_0;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TailsGeneratorTest {

    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @BeforeEach
    void setup() {
        tailsGenerator = new TailsGenerator();
    }

    @Test
    void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {
        String value = "Hello";
        tails = tailsGenerator.tails(value);

        assertThat(tails, hasSize(value.length() + 1));
    }

    @Test
    void tailsShouldReturnFullStringAsFirstElement() {
        String value = "Foo";
        tails = tailsGenerator.tails(value);
        assertThat(tails.get(0), equalTo(value));
    }

    @Test
    void tailsShouldReturnStringMinusTwoFirstSignsAsThirdElement() {
        String value = "Bazzzzzzzz";
        tails = tailsGenerator.tails(value);
        assertThat(tails.get(2), equalTo(value.substring(2)));
    }

    @Test
    void tailsShouldReturnEmptyStringAsLastElement() {
        String value = "Empty";
        tails = tailsGenerator.tails(value);
        assertThat(tails.get(tails.size() - 1), equalTo(""));
    }

}
