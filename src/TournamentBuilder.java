public class TournamentBuilder {
    private String name;
    private int minAge;
    private String city;
    private double weightLimitKg;
    private int participantCount;

    public TournamentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public TournamentBuilder setMinAge(int minAge) {
        this.minAge = minAge;
        return this;
    }
    public TournamentBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public TournamentBuilder setWeightLimitKg(double weightLimitKg) {
        this.weightLimitKg = weightLimitKg;
        return this;
    }
    public TournamentBuilder setParticipantCount(int participantCount) {
        this.participantCount = participantCount;
        return this;
    }
    public Tournament build() {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                    "Tournament name cannot be empty"
            );
        }
        if (minAge <= 0) {
            throw new IllegalArgumentException(
                    "Minimum age must be positive"
            );
        }
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException(
                    "City cannot be empty"
            );
        }
        if (weightLimitKg <= 0) {
            throw new IllegalArgumentException(
                    "Weight limit must be positive"
            );
        }
        if (participantCount <= 0) {
            throw new IllegalArgumentException(
                    "Participant count must be positive"
            );
        }
        return new Tournament(
                name,
                minAge,
                city,
                weightLimitKg,
                participantCount
        );
    }
}
