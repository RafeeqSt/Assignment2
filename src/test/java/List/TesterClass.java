package List;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class TesterClass {

    @Test
    public void addApple() {
        Assert.assertEquals("apple",ListClass.addApple());
    }

    @Test
    public void analyseMood() throws Exception {
        String actual = MoodAnalyser.analyseMood("I am feeling happy");

        Assert.assertEquals("laugh",actual);
    }

    @Test
    public void addCat() {
        Assert.assertEquals("Cat",SetClass.addCat());
    }

    @Test
    public void payMoney()
        {
            Pay send = new Employer();
            String actual = send.payMoney("500");

            Assert.assertEquals("500 rand was payed", actual);
        }
}