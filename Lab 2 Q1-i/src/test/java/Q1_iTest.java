import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class Q1_iTest {
    Q1_i x;
    @BeforeEach
    public void init (){
        x=new Q1_i()  ;
    }
    @Nested
    public class Check{
        @Test
        public void CheckEven0(){
            assertEquals("Even",x.Check(0));
        }

        @Test
        public void CheckEven2(){
            assertEquals("Even",x.Check(2));
        }

        @Test
        public void CheckEven8(){
            assertEquals("Even",x.Check(8));
        }

        @Test
        public void CheckEven90(){
            assertEquals("Even",x.Check(90));
        }

        @Test
        public void CheckEven44(){
            assertEquals("Even",x.Check(44));
        }

        @Test
        public void CheckEven1234(){
            assertEquals("Even",x.Check(1234));
        }

        @Test
        public void CheckOdd1(){
            assertEquals("Odd",x.Check(1));
        }

        @Test
        public void CheckOdd7(){
            assertEquals("Odd",x.Check(7));
        }

        @Test
        public void CheckOdd15(){
            assertEquals("Odd",x.Check(15));
        }

        @Test
        public void CheckOdd125(){
            assertEquals("Odd",x.Check(125));
        }

        @Test
        public void CheckOdd199(){
            assertEquals("Odd",x.Check(199));
        }

        @Test
        public void CheckOdd4321(){
            assertEquals("Odd",x.Check(4321));
        }

        @Test
        public void CheckOdd425(){
            assertEquals("Odd",x.Check(425));
        }
    }
    @AfterEach
    public void cleanUp(){
        x=null;
    }


}