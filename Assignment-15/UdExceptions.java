class FewArgumentsException extends Exception {
    public String toString() {
        // System.out.println();
        return "Few Arguments Exception";
    }
}

class InvalidOperatorException extends Exception {
    public String toString() {
        // System.out.println();
        return "Invalid Operator Exception";
    }
}

class NegativeResult extends Exception {
    public String toString() {
        // System.out.println();
        return "Negative Result Exception";
    }
}

class Operation {
    static void calc(int a, char o, int b) throws FewArgumentsException, InvalidOperatorException, NegativeResult {
        switch (o) {
            case '+': {
                System.out.println("Addition: " + (a + b));
                break;
            }
            case '-': {
                System.out.println("subtraction: " + (a - b));
                break;
            }
            case '*': {
                System.out.println("subtraction: " + (a * b));
                break;
            }
            case '/': {
                System.out.println("Division: " + (a / b));
                break;
            }
            case '%': {
                System.out.println("subtraction: " + (a % b));
                break;
            }
        }
    }
}

class UdExceptions {
    public static void main(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            char o = args[1].charAt(0);
            int b = Integer.parseInt(args[2]);
            Operation op = new Operation();
            op.calc(a, o, b);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
