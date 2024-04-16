public class Tourist implements Tour {
    private String firstName;
    private String lastName;
    private int age;
    private Tour[] tourList;
    private int tourCount;

    public Tourist(String firstName, String lastName, int age, int tourCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.tourList = new Tour[tourCount];
        this.tourCount = 0;
    }

    public void addTour(Tour tour) {
        if (tourCount < tourList.length) {
            tourList[tourCount] = tour;
            tourCount++;
        } else {
            System.out.println("error");
        }
    }
    public void deleteTour(Tour tour) {
        for (int i = 0; i < tourCount; i++) {
            if (tourList[i] == tour) {
                for (int j = i; j < tourCount - 1; j++) {
                    tourList[j] = tourList[j + 1];
                }
                tourList[tourCount - 1] = null;
                tourCount--;
                break;
            }
        }
    }



    public void getTourList() {
        System.out.println( firstName + " " + lastName);
        for (int i = 0; i < tourCount; i++) {
            System.out.println(tourList[i].getTourName() + " " + tourList[i].getTourPrice());
        }
    }


    @Override
    public String getTourName() {
        return null;
    }

    @Override
    public Object getTourPrice() {
        return null;
    }
}




