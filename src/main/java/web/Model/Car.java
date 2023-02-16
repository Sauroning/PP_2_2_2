package web.Model;

public class Car {
    private String carBrand;

    private int series;

    private int yearOfRelease;

    public Car() {
    }

    public Car(String carBrand, int series, int yearOfRelease) {
        this.carBrand = carBrand;
        this.series = series;
        this.yearOfRelease = yearOfRelease;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return  "carBrand:'" + carBrand + '\'' +
                ", series:" + series +
                ", yearOfRelease:" + yearOfRelease;
    }
}
