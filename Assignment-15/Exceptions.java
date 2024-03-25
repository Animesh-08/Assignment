import java.lang.String;

class VowelException extends Exception {
    public String toString() {
        return "Vowel Exception";
    }
}

class BlankException extends Exception {
    public String toString() {
        return "Blank Exception";
    }
}

class ExitException extends Exception {
    public String toString() {
        return "Exit Exception";
    }
}

class TestException {
    static void display(char c) throws VowelException, BlankException, ExitException {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            throw new VowelException();
        } else if (c == ' ') {
            throw new BlankException();
        } else if (c == 'X') {
            throw new ExitException();
        } else {
        }
    }
    
}

class Exceptions {
    public static void main(String args[])throws Exception {
        try {
            char c = args[0].charAt(0);
            TestException t = new TestException();
            t.display(c);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
