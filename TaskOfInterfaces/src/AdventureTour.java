public class AdventureTour implements Tour {
    private String tourName;
    private float tourPrice;
    private String difficultyLevel;

    public AdventureTour(String tourName, float tourPrice, String difficultyLevel) {
        this.tourName = tourName;
        this.tourPrice = tourPrice;
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String getTourName() {
        return tourName;
    }

    @Override
    public Object getTourPrice() {
        return tourPrice;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
