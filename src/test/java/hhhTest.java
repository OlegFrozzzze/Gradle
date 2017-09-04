import org.junit.Test;

import static org.junit.Assert.*;

public class hhhTest {
    hhh cl;
    private void init(){
        cl = new hhh();
    }
    @Test
    public void m() throws Exception {
        init();
        assertEquals("111", cl.m());
    }



}