import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Radio 1");
    }

    @Test
    public void hasTune() {
        assertEquals("Radio 1", radio.getTune());
    }

    @Test
    public void setTune() {
        radio.setTune("Radio 2");
        assertEquals("Radio 2", radio.getTune());
    }
}
