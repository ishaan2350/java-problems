import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMessage_ShouldReturnSad() {

        MoodAnalyzer moodAnalyzer =
                new MoodAnalyzer("I am in Sad Mood");

        String mood = moodAnalyzer.analyseMood();

        assertEquals("SAD", mood);
    }

    @Test
    public void givenHappyMessage_ShouldReturnHappy() {

        MoodAnalyzer moodAnalyzer =
                new MoodAnalyzer("I am in Happy Mood");

        String mood = moodAnalyzer.analyseMood();

        assertEquals("HAPPY", mood);
    }
}
