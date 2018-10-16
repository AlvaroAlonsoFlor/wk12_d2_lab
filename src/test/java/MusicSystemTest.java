import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSystemTest {
    MusicSystem system;
    Radio radio;

    @Before
    public void before() {
        radio = new Radio();
        system = new MusicSystem("Positron7000", radio);
    }

    @Test
    public void getName() {
        assertEquals("Positron7000", system.getName());
    }

    @Test
    public void getRadio() {
        assertEquals(radio, system.getRadio());
    }

    @Test
    public void getComponentsEmpty() {
        assertEquals(0, system.getComponents().size());
    }

    @Test
    public void addComponent(){
        system.addComponent(new CDPlayer());
        assertEquals(1, system.getComponents().size());
    }
}
