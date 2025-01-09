public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String attractionName;
        private String operatingHours;
        private double cost;

        public Attraction(String attractionName, String operatingHours, double cost) {
            this.attractionName = attractionName;
            this.operatingHours = operatingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println("Attraction: " + attractionName);
            System.out.println("Operating Hours: " + operatingHours);
            System.out.println("Cost: $" + cost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park amusementPark = new Park("WonderLand");

        Park.Attraction rollerCoaster = amusementPark.new
                Attraction("Roller Coaster", "10 AM - 10 PM", 5.0);
        Park.Attraction ferrisWheel = amusementPark.new
                Attraction("Ferris Wheel", "11 AM - 9 PM", 3.0);
        Park.Attraction hauntedHouse = amusementPark.new
                Attraction("Haunted House", "12 PM - 8 PM", 4.0);
        Park.Attraction bumperCars = amusementPark.new
                Attraction("Bumper Cars", "10 AM - 11 PM", 2.5);
        Park.Attraction carousel = amusementPark.new
                Attraction("Carousel", "10 AM - 10 PM", 1.5);

        rollerCoaster.displayInfo();
        ferrisWheel.displayInfo();
        hauntedHouse.displayInfo();
        bumperCars.displayInfo();
        carousel.displayInfo();
    }
}
