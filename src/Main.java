public class Main {
    public static void main(String[] args) {
        TournamentDirector director = new TournamentDirector();

        Tournament localTournament =
                director.createLocalTournament(
                        new TournamentBuilder()
                );

        Tournament nationalTournament =
                director.createNationalTournament(
                        new TournamentBuilder()
                );

        Tournament customTournament =
                new TournamentBuilder()
                        .setName("Student Armwrestling Cup")
                        .setMinAge(18)
                        .setCity("Almaty")
                        .setWeightLimitKg(90)
                        .setParticipantCount(20)
                        .build();

        System.out.println("LOCAL TOURNAMENT");
        localTournament.showInfo();

        System.out.println("\nNATIONAL TOURNAMENT");
        nationalTournament.showInfo();

        System.out.println("\nCUSTOM TOURNAMENT");
        customTournament.showInfo();
    }
}
