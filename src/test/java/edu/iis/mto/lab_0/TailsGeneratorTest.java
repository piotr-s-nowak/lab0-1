package edu.iis.mto.lab_0;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TailsGeneratorTest {

    private static final String HELLO = "Hello";
    private TailsGenerator tailsGenerator;
    private List<String> tails;

    @BeforeEach
    void setup() {

        tailsGenerator = new TailsGenerator();
        tails = tailsGenerator.tails(HELLO);
    }

    @Test
    void tailsShouldReturnListOfStringsOfSizeEqualsToInputStringLengthPlusOne() {

        assertThat(tails, hasSize(HELLO.length() + 1));
    }

    @Test
    void tailsShouldReturnFullStringAsFirstElement() {

        assertThat(tails.get(0), equalTo(HELLO));
    }

    @Test
    void tailsShouldReturnStringMinusTwoFirstSignsAsThirdElement() {
        assertThat(tails.get(2), equalTo(HELLO.substring(2)));
    }

    @Test
    void tailsShouldReturnEmptyStringAsLastElement() {

        assertThat(tails.get(tails.size() - 1), equalTo(""));
    }

}
