package problem.easy;

public class Animal {
    public String name;
    public double weightKg;
    public double heightM;
    public boolean isPredator;
    public double speedKpg;
    public double activityMultiplier;

    Animal(String name, double weightKg, double heightM, boolean isPredator, double speedKpg) {
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.isPredator = isPredator;
        this.speedKpg = speedKpg;
        this.activityMultiplier = 1.2;
    }

    public double getBmi() {
        return Math.floor((weightKg / (heightM * heightM)) * 100) / 100;
    }

    public double getDailyCalories() {
        return Math.floor((70 * Math.pow(weightKg, 0.75) * activityMultiplier) * 100) / 100;
    }

    public boolean isDangerous() {
        return isPredator | heightM >= 1.7 | speedKpg >= 35;
    }
}