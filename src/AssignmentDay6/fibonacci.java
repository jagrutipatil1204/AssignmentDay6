package AssignmentDay6;

public class fibonacci {

        public static void main(String[] args) {

            int n = 15, firstvalue = 0, secondvalue = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int j = 1; j <= n; ++j) {
                System.out.print(firstvalue + ", ");

                // compute the next term
                int nextvalue = firstvalue + secondvalue;
                firstvalue = secondvalue;
                secondvalue = nextvalue;
            }
        }
    }
