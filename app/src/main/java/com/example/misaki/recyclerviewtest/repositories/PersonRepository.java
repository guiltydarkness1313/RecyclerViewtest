package com.example.misaki.recyclerviewtest.repositories;

import com.example.misaki.recyclerviewtest.models.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misaki on 10/2/17.
 */

public class PersonRepository {

    private static List<Person> persons;

    static {
        persons = new ArrayList<>();
        persons.add( new Person(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        persons.add( new Person(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        persons.add( new Person(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        persons.add( new Person(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        persons.add( new Person(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        persons.add( new Person(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        persons.add( new Person(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(100, "Juan Perez", "jperez@gmail.com", "jperez") );
        persons.add( new Person(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        persons.add( new Person(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
        persons.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        persons.add( new Person(500, "Luiz Maza", "lmaza@gmail.com", "lmaza") );
    }

    public static List<Person> getPersons() {
        return persons;
    }
}
