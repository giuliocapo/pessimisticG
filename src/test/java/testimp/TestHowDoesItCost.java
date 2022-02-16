package testimp;

import com.example.optimisticg.HowDoesItCost;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHowDoesItCost {

    @Test
    public  void itCosts1(){
        HowDoesItCost howDoesItCost = new HowDoesItCost();
        Boolean res = howDoesItCost.itCost1dollar(1,"1.36"); //qui il tester australiano pensa al cambio 1 american dollar == 1.36 australian dollar
        assertTrue(res);

    }

    @Test
    public  void itCosts(){
        HowDoesItCost howDoesItCost = new HowDoesItCost();
        Boolean res = howDoesItCost.itCost1dollar(2,"1.0"); //qui il tester australiano pensa al cambio 1 american dollar == 1.36 australian dollar
        assertTrue(res);

    }
}
