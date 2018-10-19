
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StockTest {
    @Test
    public void testChangePercent() {
        String symbol = "ORCL";
        String name = "Oracle Corporation";

        double resultExpected = 0.434782608695648;
        Stock stock = new Stock(symbol, name);

        stock.setCurrentPrice(34.35);
        stock.setPreviousClosingPrice(34.5);

        double resultChangePercent = stock.getChangePercent();

        assertEquals(resultExpected, resultChangePercent);
    }
}

