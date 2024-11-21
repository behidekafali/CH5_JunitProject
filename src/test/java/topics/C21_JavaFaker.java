package topics;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C21_JavaFaker {

    //Fake Data = Mock Data 🡪 Gerçek olmayan verilerdir.
    //Faker Class: Gerçek görünümlü verileri dinamik olarak oluşturmanıza olanak tanır.

    @Test
    public void fakerTest() {

        //Faker objesi olustur
        Faker faker = new Faker();

        //obje ile sahte veri üret
        //Firstname
        System.out.println(faker.name().firstName());

        //Lastname
        System.out.println(faker.name().lastName());

        //Full Name
        System.out.println(faker.name().fullName());
        System.out.println(faker.name().nameWithMiddle());

        //SSN
        System.out.println(faker.idNumber().ssnValid());

        //Address
        System.out.println(faker.address().city());
        System.out.println(faker.address().streetPrefix());
        System.out.println(faker.address().country());
        System.out.println(faker.address().buildingNumber());
        System.out.println(faker.address().timeZone());
        System.out.println(faker.address().zipCode());

        //Phone number
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.phoneNumber().subscriberNumber(8));

        //number
        System.out.println(faker.number().digit());
        System.out.println(faker.number().digits(15));
        System.out.println(faker.number().numberBetween(2,9));

        //Internet
        System.out.println(faker.internet().image());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().emailAddress("johndoe"));
        System.out.println(faker.internet().url());
        System.out.println(faker.internet().password());

        //Faker.instance().name().firstName(); --> instance () static method ile obje olusturmadan fake data üretebilirsiniz .


        //Lorem
        System.out.println(Faker.instance().lorem().character());
        System.out.println(faker.lorem().characters());
        System.out.println(faker.lorem().paragraph());
        System.out.println(faker.lorem().paragraphs(3));
        System.out.println(faker.lorem().sentence(3));

        System.out.println(faker.lordOfTheRings().character());


    }
}
