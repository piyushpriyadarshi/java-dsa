package assertion;

public class Assertion {
    private static final String CHECKMARK = "\u2714"; // Unicode for checkmark
    private static final String CROSSMARK = "\u2716";

    public static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            System.out.println(
                    CROSSMARK + " Test failed for assertEquals with expected: " + expected + " and actual: " + actual);
        } else {
            System.out.println(
                    CHECKMARK + " Test passed for assertEquals with expected: " + expected + " and actual: " + actual);
        }
    }

    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Expected: true, but was: false");
        }
    }

    public static void assertFalse(boolean condition) {
        if (condition) {
            throw new AssertionError("Expected: false, but was: true");
        }
    }

    public static void assertNull(Object object) {
        if (object != null) {
            throw new AssertionError("Expected: null, but was: " + object);
        }
    }

    public static void assertNotNull(Object object) {
        if (object == null) {
            throw new AssertionError("Expected: not null, but was: null");
        }
    }
}

class AssertionError extends Error {
    private final String message;

    public AssertionError(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
