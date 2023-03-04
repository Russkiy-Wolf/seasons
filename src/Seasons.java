public enum Seasons
{
    Spring(6),
    Summer(30) {
        public void getDescription() {
            System.out.println(" - Жаркое время года, " + averageTemperature);
        }
    },
    Fall(10),
    Winter(-19);

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public void getDescription()
    {

        System.out.println(" - Холодное время года, " + averageTemperature);
    }

    public int averageTemperature;


}

