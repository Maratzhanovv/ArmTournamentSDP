public class Tournament {
    private String name;
    private int minAge;
    private String city;
    private double weightLimitKg;
    private int participantCount;

    public Tournament(String name, int minAge, String city, double weightLimitKg, int participantCount) {
        this.name = name;
        this.minAge = minAge;
        this.city = city;
        this.weightLimitKg = weightLimitKg;
        this.participantCount = participantCount;
    }
    public void showInfo() {
        System.out.println("Tournament: " + name);
        System.out.println("Minimum age: " + minAge);
        System.out.println("City: " + city);
        System.out.println("Weight limit: " + weightLimitKg + " kg");
        System.out.println("Participant count: " + participantCount);
    }
}


