public class JaggedArray 
{
    private int[][] marksArray;

    public JaggedArray(int[] subjectsPerChild)
        {
        marksArray = new int[5][];
        for (int i = 0; i < subjectsPerChild.length; i++) {
            marksArray[i] = new int[subjectsPerChild[i]];
        }
    }

    public void inputMarks(String childName, int[] marks) {
        int index = getChildIndex(childName);
        if (index != -1) {
            marksArray[index] = marks;
        } else {
            System.out.println("Child not found!");
        }
    }

    public void showMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < marksArray.length; i++) {
            System.out.print(childNames[i] + ": ");
            for (int mark : marksArray[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

    public void totalMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < marksArray.length; i++) {
            int total = 0;
            for (int mark : marksArray[i]) {
                total += mark;
            }
            System.out.println(childNames[i] + " Total Marks: " + total);
        }
    }

    public void countMarksAbove80() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < marksArray.length; i++) {
            int count = 0;
            for (int mark : marksArray[i]) {
                if (mark > 80) {
                    count++;
                }
            }
            System.out.println(childNames[i] + " Marks Above 80: " + (count));
        }
    }

    public void alertLowMarks() {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < marksArray.length; i++) {
            System.out.print(childNames[i] + " Alert ! Low Marks (<30) in subjects: ");
            for (int mark : marksArray[i]) {
                if (mark < 30) {
                    System.out.print(mark + " ");
                }
            }
            System.out.println();
        }
    }

    private int getChildIndex(String childName) {
        String[] childNames = {"Child1", "Child2", "Child3", "Child4", "Child5"};
        for (int i = 0; i < childNames.length; i++) {
            if (childNames[i].equals(childName)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] subjectsPerChild = {3, 5, 2, 6, 4};
        JaggedArray marksArray = new JaggedArray(subjectsPerChild);

        marksArray.inputMarks("Child1", new int[]{90, 87, 69});
        marksArray.inputMarks("Child2", new int[]{77, 56, 97, 82, 61});
        marksArray.inputMarks("Child3", new int[]{70, 28});
        marksArray.inputMarks("Child4", new int[]{64, 96, 27, 29, 93, 88});
        marksArray.inputMarks("Child5", new int[]{32, 26, 98, 79});

        marksArray.showMarks();
        marksArray.totalMarks();
        marksArray.countMarksAbove80();
        marksArray.alertLowMarks();
    }
}