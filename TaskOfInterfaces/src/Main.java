public class Main {
    public static void main(String[] args){
Tourist tourist = new Tourist("fgfsdgdfsgh","rgwertewrew",32,321);
Tourist tourist1 = new Tourist("ewrtqa","wetrq",32,3421);
AdventureTour adventureTour = new AdventureTour("qerw",132,"fgsadfgds");
AdventureTour adventureTour1 = new AdventureTour("qaerw",231,"asfdg");
CityTour cityTour = new CityTour("sgdf",4312,"fgdwera");
        tourist.addTour(adventureTour);
        tourist.addTour(cityTour);
        tourist1.addTour(adventureTour1);
tourist.getTourList();
tourist1.getTourList();
    }
}