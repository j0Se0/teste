import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int planeta = this.random.nextInt(10);
        return PLANET_CLASSES[planeta];
    }

    String randomShipRegistryNumber() {
        final String cod = "NCC-";
        int n = this.random.nextInt(1000,10000);
        return cod+n;
    }

    double randomStardate() {
        double data = this.random.nextDouble(41000.0,42000.0);
        return data;
    }
}
