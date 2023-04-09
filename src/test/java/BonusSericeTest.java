import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.BonusService;

public class BonusSericeTest {
    @Test
    public void test() {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calxBonus(5000, true);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
