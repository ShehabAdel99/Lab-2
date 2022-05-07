import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1_iiTest {
    Q1_ii x;
    @BeforeEach
    public void init (){
        x=new Q1_ii()  ;
    }
    @Nested
    public class Check{
        @Test
        public void CheckMaxPositive(){
            x.setArr(new int[]{1,2,5,6,25,4860,300,800,94});
            assertEquals(4860,x.Max());
        }
        @Test
        public void CheckMaxNegative(){
            x.setArr(new int[]{-200,-4,-985,-88,-56,-841,-1,-2,-8});
            assertEquals(-1,x.Max());
        }
        @Test
        public void CheckMaxPos_Neg(){
            x.setArr(new int[]{1,-1,5,500,-8956,-8,11,251,-852,14});
            assertEquals(500,x.Max());
        }
        @Test
        public void CheckMMinPositive(){
            x.setArr(new int[]{500,5,41,8,1,9,2,84,77});
            assertEquals(1,x.Min());
        }
        @Test
        public void CheckMinNegative(){
            x.setArr(new int[]{-1,-85,-84,-5,-74,-500,-12});
            assertEquals(-500,x.Min());
        }
        @Test
        public void CheckMinPos_Neg(){
            x.setArr(new int[]{0,55,88,-84,-89,5162,1,-1,-198});
            assertEquals(-198,x.Min());
        }
    }

    @AfterEach
    public void cleanUp(){
        x=null;
    }

}