import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DateTest {
    //public static Date junitTest;

    @Mock
    static Date dateMock;
    static Calculation calMock;

    @BeforeClass
    public static void makeInstance()throws Exception{
        System.out.println("Before TestClass");
    }
    @Before
    public void beforTest()throws Exception{
        System.out.println("Before Test");
    }

    @Test
    public void JunitTest()throws Exception{
        System.out.println("JunitTest()");

        dateMock = new Date("2019 05 03");
        calMock = new Calculation();

        assertEquals("Fri",  dateMock.getDate());
        assertFalse(dateMock.cal.isleapYear( dateMock.getYear()));
        assertEquals(4444, calMock.totalDate(2019,03,03));

    }

    @Test
    public void verifyCal(){
        System.out.println("verifyCal()");

        calMock = mock(Calculation.class);

        calMock.setDate(2019,01,03);
        Mockito.verify(calMock, never()).isleapYear(2019);
    }

    @After
    public void printAfter()throws Exception{
        System.out.println("After Test");
    }

    @AfterClass
    public static void printAfterClass()throws Exception{
        System.out.println("After TestClass ");
    }

}
