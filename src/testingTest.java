import static org.junit.jupiter.api.Assertions.*;

class testingTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
       void checkLengthGood() {
        System.out.println("checkLength good");
        String password = "password123";
        boolean expResult = true;
        boolean actualResult = testing.checkLength(password);
        assertEquals(expResult,actualResult);
    }


    @org.junit.jupiter.api.Test
        void checkLengthBad() {
        System.out.println("checkLength bad");
        String password = "pass";
        boolean expResult = false;
        boolean actualResult = testing.checkLength(password);
        assertEquals(expResult,actualResult);
    }


    @org.junit.jupiter.api.Test
        void checkLengthBoundary() {
        System.out.println("checkLength boundary");
        String password = "password";
        boolean expResult = true;
        boolean actualResult = testing.checkLength(password);
        assertEquals(expResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void checkLengthSpecialCharacterGood() {
        System.out.println("Check special good");
        String password = "password123*!";
        boolean expResult = true;
        boolean actualResult = testing.checkSpecial(password);
        assertEquals(expResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void checkLengthSpecialCharacterBad() {
        System.out.println("Check special bad");
        String password = "password";
        boolean expResult = false;
        boolean actualResult = testing.checkSpecial(password);
        assertEquals(expResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void checkLengthSpecialCharacterBoundary() {
        System.out.println("check special boundary");
        String password = "password123!";
        boolean expResult = true;
        boolean actualResult = testing.checkSpecial(password);
        assertEquals(expResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void checkUpperGood() {
        System.out.println("Check upper good");
        String password = "PassworD";
        boolean expResult = true;
        boolean actualResult = testing.checkUpper(password);
        assertEquals(expResult,actualResult);
    }

    @org.junit.jupiter.api.Test
    void checkUppeBad() {
        System.out.println("Check upper bad");
        String password = "password123";
        boolean expResult = false;
        boolean actualResult = testing.checkUpper(password);
        assertEquals(expResult,actualResult);
    }


    @org.junit.jupiter.api.Test
    void checkUpperBoundary() {
        System.out.println("Check upper good");
        String password = "PassworD";
        boolean expResult = true;
        boolean actualResult = testing.checkUpper(password);
        assertEquals(expResult,actualResult);
    }
}