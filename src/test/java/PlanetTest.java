import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    Planet planet;

    @Before
    public void before(){
        planet = new Planet("Mars", 5.6e10, false);
    }

    @Test
    public void hasName(){
        assertEquals("Mars", planet.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(5.6e10, planet.getSize(), 0.0);
    }

    @Test
    public void hasExploded(){
        assertEquals(false, planet.getExploded());
    }

    @Test
    public void explodeStatement(){
        assertEquals("Mars has exploded? true", planet.explode());
    }
 

}
