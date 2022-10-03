import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
     void lengthTestPass () {
        Assertions.assertEquals(false,passwordValidator.isLongerThan7("1234567"));
    }
    @Test
    void passwordIsLongEnough(){
        Assertions.assertEquals(true,passwordValidator.isLongerThan7("12345678"));
    }

    }
