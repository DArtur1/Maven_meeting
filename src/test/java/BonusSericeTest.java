import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.BonusService;

public class BonusSericeTest {
    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calxBonus(5000, true);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredUnderLimit(){
        BonusService service = new BonusService();

        int expected = 50;
        int actual = service.calxBonus(5000, false);
        //System.out.println("2. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
