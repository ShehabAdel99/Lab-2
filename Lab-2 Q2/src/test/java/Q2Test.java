import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {
    Q2 x;
    @BeforeEach
    public void init(){
        x=new Q2();
    }
    @Nested
    public class Check {
    /*
    -------------------------------------------------------------
                         Edge Coverage
    -------------------------------------------------------------
     */
        @Test
        public void TimeToDate(){
        x.Click('a');
        assertEquals("NORMAL,DATE",x.getState());
        assertEquals("2000-1-1", x.getDate());
        assertEquals("0:0", x.getTime());
        }
        @Test
        public void DateToTime(){
            x.Click('a');
            x.Click('a');
            assertEquals("NORMAL,TIME",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void NormalToUpdate(){
            x.Click('c');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void NormalToAlarm(){
            x.Click('b');
            assertEquals("ALARM,Alarm",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        /*
        ------------------------------------------------------------
                              Update State
        ------------------------------------------------------------
         */
        @Test
        public void minTomin(){
            x.Click('c');
            x.Click('b');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:1", x.getTime());

        }
        @Test
        public void minToHour_HourToHour(){
            x.Click('c');
            x.Click('a');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Click('b');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("1:0", x.getTime());

        }
        @Test
        public void hourToDay_DayToDay(){
            x.Click('c');
            x.Click('a');
            x.Click('a');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Click('b');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-2", x.getDate());
            assertEquals("0:0", x.getTime());

        }
        @Test
        public void dayToMonth_MonthToMonth(){
            x.Click('c');
            x.Click('a');
            x.Click('a');
            x.Click('a');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Click('b');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-2-1", x.getDate());
            assertEquals("0:0", x.getTime());

        }
        @Test
        public void monthToYear_YearToYear(){
            x.Click('c');
            x.Click('a');
            x.Click('a');
            x.Click('a');
            x.Click('a');
            assertEquals("UPDATE,year",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Click('b');
            assertEquals("UPDATE,year",x.getState());
            assertEquals("2001-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void yearToNormal(){
            x.Click('c');
            x.Click('a');
            x.Click('a');
            x.Click('a');
            x.Click('a');
            x.Click('a');
            assertEquals("NORMAL,TIME",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        /*
        ------------------------------------------------------------
                              ADUP
        ------------------------------------------------------------
         */
        @Test
        public void ADUP1(){
            x.Click('c');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());

        }
        @Test
        public void ADUP2(){
            x.Click('c');
            x.Click('b');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:1", x.getTime());


        }
        @Test
        public void ADUP3(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:2", x.getTime());


        }
        @Test
        public void ADUP4(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:2", x.getTime());


        }
        @Test
        public void ADUP5(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("1:2", x.getTime());


        }
        @Test
        public void ADUP6(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP7(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP8(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-2", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP9(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP10(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-1-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP11(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-2-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP12(){
            x.Click('c');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            x.Click('a');
            x.Click('b');
            x.Click('b');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-3-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }

    }
    @AfterEach
    public void cleanUp(){
        x=null;
    }

}