package baitap.triangleclassifier;

public class TriangleClassifier {

    public static String triangleClassifier(int side1, int side2, int side3) {
        if (isTriangle(side1,side2,side3)){
            if (side1 == side2 && side1 == side3)
                return "Tam giác đều";
            else if(side1 == side2 || side1 == side3|| side2==side3)
                return "Tam giác cân";
            else return "Tam giác thường";
        }return "Không phải là tam giác";
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        if ((side1 > 0 && side2 > 0 && side3 > 0) && (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            return true;
        }
        return false;
    }
}
