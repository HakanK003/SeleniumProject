package com.cydeo.tests.day9_javaFaker_testBase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        // We can change the format
        System.out.println("faker.numerify(\"333-###-333-###-333\") = " + faker.numerify("333-###-333-###-333"));


        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("faker.letterify(\"????????????????????????\") = " + faker.letterify("????????????????????????"));

        System.out.println("faker.letterify(\"HHH-???-HHH-???-HHH\") = " + faker.letterify("HHH-???-HHH-???-HHH"));


        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("faker.bothify(\"###-???-##??-#?#?#?\") = " + faker.bothify("###-???-##??-#?#?#?"));

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replace("Chuck Norris", "Muhtar"));

        System.out.println("faker.leagueOfLegends().champion() = " + faker.leagueOfLegends().champion());

        System.out.println("faker.yoda().quote() = " + faker.yoda().quote());

        System.out.println("faker.artist().name() = " + faker.artist().name());

        System.out.println("faker.cat().breed() = " + faker.cat().breed());

        System.out.println("faker.book().title() = " + faker.book().title());

        System.out.println("faker.programmingLanguage().name() = " + faker.programmingLanguage().name());

        System.out.println("faker.lordOfTheRings().character() = " + faker.lordOfTheRings().character());

        System.out.println("faker.color().name() = " + faker.color().name());

    }

}
