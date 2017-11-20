public class VariablesAndNames
{
    public static void main( String[] args )
    {
        int cars, drivers, passengers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passengers_per_car;

        cars = 100;//cars
        space_in_a_car = 4;//so cho ngoi//4.0
        drivers = 30;//tai xe
        passengers = 90;//hanh khach
        cars_not_driven = cars - drivers;//car not driven
        cars_driven = drivers;//car drinen
        carpool_capacity = cars_driven * space_in_a_car; //so khach van chuyen duoc
        average_passengers_per_car = passengers / cars_driven;//so khach trung binh tren moi xe


        System.out.println( "There are " + cars + " cars available." );//so xe hien co
        System.out.println( "There are only " + drivers + " drivers available." );// so xe co tai xe
        System.out.println( "There will be " + cars_not_driven + " empty cars today." );//so xe k co tai xe
        System.out.println( "We can transport " + carpool_capacity + " people today." );
        System.out.println( "We have " + passengers + " to carpool today." );
        System.out.println( "We need to put about " + average_passengers_per_car + " in each car." );
    }
}