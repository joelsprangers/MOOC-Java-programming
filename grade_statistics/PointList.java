
import java.util.ArrayList;

public class PointList {

    private ArrayList<Integer> listOfPoints;

    public PointList() {
        this.listOfPoints = new ArrayList<>();

    }

    public void add(int number) {
        if (number >= 0 && number <= 100) {
            listOfPoints.add(number);
        }
    }

    public int sum() {
        int sumAll = 0;
        for (int point : listOfPoints) {
            sumAll += point;
        }
        return sumAll;
    }

    public int above50Sum() {
        int sumAbove50 = 0;

        for (int point : listOfPoints) {
            if (point >= 50) {
                sumAbove50 = sumAbove50 + point;
            }
        }
        return sumAbove50;
    }

    public int above50Count() {
        int countAbove50 = 0;
        for (int point : listOfPoints) {
            if (point >= 50) {
                countAbove50++;
            }
        }
        return countAbove50;
    }

    public double average() {
        return ((1.0 * sum()) / (1.0 * listOfPoints.size()));
    }

    public double averagePassingGrade() {
        return ((1.0 * above50Sum()) / (1.0 * above50Count()));
    }

    public double passingPercentage() {
        return 100.0 * above50Count() / (1.0 * listOfPoints.size());
    }

    public String passingAverageGradeToString() {
        if (above50Sum() == 0) {
            return "Point average (passing): -";
        }
        return "Point average (passing): " + averagePassingGrade();
    }

    public String pointAverageToString() {
        if (sum() == 0) {
            return "Point average (all): -";
        }
        return "Point average (all): " + average();
    }

    public String passAverageToString() {
        return "Pass percentage : " + passingPercentage();
    }

    public String printStar(int times) {
        String star = "";
        for(int i = 0; i < times; i++){
            star = star+ "*";
        }
        return star;
    }

    public String pointToGradeCount() {
        int grade0 = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        int grade4 = 0;
        int grade5 = 0;

        for (int point : listOfPoints) {

            if (point < 50) {
                grade0++;
                continue;
            }

            if (point >=50 && point < 60) {
                grade1++;
                continue;

            }

            if (point >=60 && point < 70) {
                grade2++;
                continue;

            }
            if (point >=70 && point < 80) {
                grade3++;
                continue;

            }
            if (point >=80 && point < 90) {
                grade4++;
                continue;

            }
            if (point >= 90) {
                grade5++;
                continue;

            }
            
        }
        return 
        "Grade distribution:"+"\n"+
        "5: "+printStar(grade5)+"\n"+
        "4: "+printStar(grade4)+"\n"+
        "3: "+printStar(grade3)+"\n"+
        "2: "+printStar(grade2)+"\n"+
        "1: "+printStar(grade1)+"\n"+
        "0: "+printStar(grade0);

    }
    
}
