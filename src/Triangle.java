public class Triangle {

    Point pointFirst, pointSecond, pointThird;

    public Triangle(
            double corOneX, double corOneY,
            double corTwoX, double corTwoY,
            double corThreeX, double corThreeY
    ) {
        pointFirst = new Point(corOneX, corOneY);
        pointSecond = new Point(corTwoX, corTwoY);
        pointThird = new Point(corThreeX, corThreeY);
    }

    double perimeter() {
        double sideFirst = Math.sqrt(
                Math.pow(pointFirst.corX - pointSecond.corX, 2) +
                        Math.pow(pointFirst.corY - pointSecond.corY, 2)
        );
        double sideSecond = Math.sqrt(
                Math.pow(pointFirst.corX - pointThird.corX, 2) +
                        Math.pow(pointFirst.corY - pointThird.corY, 2)
        );
        double sideThird = Math.sqrt(
                Math.pow(pointSecond.corX - pointThird.corX, 2) +
                        Math.pow(pointSecond.corY - pointThird.corY, 2)
        );
        return sideFirst + sideSecond + sideThird;
    }

    private class Point {
        double corX;
        double corY;

        public Point(double corX, double corY) {
            this.corX = corX;
            this.corY = corY;
        }
    }
}
