# REPORT JOBSHEET 7: LOOPS 1

Name: Davina Tegar Putri Ervia

Student ID: 264107020083

GitHub: https://github.com/davinategar

# 1. Learning Objective

* Students are able to explain the syntax for writing loop programs (for, while, and do-while).

* Students are able to implement loop flowcharts using the Java programminglanguage.

# 2. Practical Exercise 

## 2.1 Experiment 1: Student Grades Case Study in SIAKAD – FOR Loop

The code: 

```
import java.util.Scanner;

public class SiakadForAttendance07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score, highest = 0, lowest = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            if (score > highest) {
                highest = score;
            }
            if (score < lowest) {
                lowest = score;
            }
        }

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
```

Result:

