class AutoMobile
{
    String type, make;
    int regNo;
    float price, maxSpeed, mileage;

    // public AutoMobile( String type, int regNo) {
    //     this.type=type;
    //     this.regNo=regNo;
    // }

    public void display() {

        System.out.println(type);
        
    }

    public static void main(String[] args) {
        
    }

}

class Track extends AutoMobile
{
    int capacity, noOfWheels;
    String hoodType;
    
	public Track(int capacity, int noOfWheels, String hoodType) {
		this.capacity = capacity;
		this.noOfWheels = noOfWheels;
		this.hoodType = hoodType;
	}

	public Track() {
	}

}

class Care extends AutoMobile
{
    int noOfDoors, seatingCapacity;

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
    
}