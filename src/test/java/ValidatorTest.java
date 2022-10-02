import com.sun.nio.sctp.Association;
import org.junit.Test;

public class ValidatorTest {

    @Test
     void lengthTestPass () {
        Association.assertEquals(false,passwordValidator.isLongerThan7("1234567"));
    }
    }
