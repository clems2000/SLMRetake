
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Fuck() {
        //arrange

        //act
        String actual = Main.GetMessage();
        //assert
        Assertions.assertEquals("Hello World", actual);
    }

}