package yahoofinance;

import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by rongyj on 8/23/17.
 */
public class YahooFinanceAPITest extends TestCase {
    @Test
    public void testSingleStock() throws Exception{
        Stock stock = YahooFinance.get("BCS");

        int i = 10;
        while (i>0) {
            stock.getQuote(true);
            stock.print();
            Thread.sleep(6000);
            i--;
        }
    }
}
