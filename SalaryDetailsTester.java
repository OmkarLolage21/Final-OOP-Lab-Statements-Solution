public class SalaryDetailsTester {

    public static void main(String[] args) {
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double[] details = findDetails(salaries);

        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }

    public static double[] findDetails(double[] salaries) {
        double sum = 0.0;
        for (double salary : salaries) {
            sum += salary;
        }
        double average = sum / salaries.length;

        int greaterThanAverage = 0;
        int lesserThanAverage = 0;

        for (double salary : salaries) {
            if (salary > average) {
                greaterThanAverage++;
            } else if (salary < average) {
                lesserThanAverage++;
            }
        }

        return new double[] { average, greaterThanAverage, lesserThanAverage };
    }
}

//3