public class TournamentDirector {
    public Tournament createLocalTournament(
            TournamentBuilder builder) {
        return builder
                .setName("Kazaly ArmClub Tournament")
                .setMinAge(16)
                .setCity("Kazaly")
                .setWeightLimitKg(80)
                .setParticipantCount(16)
                .build();
    }
    public Tournament createNationalTournament(
            TournamentBuilder builder) {
        return builder
                .setName("Kazakhstan Armwrestling Championship")
                .setMinAge(18)
                .setCity("Astana")
                .setWeightLimitKg(100)
                .setParticipantCount(32)
                .build();
    }
}

