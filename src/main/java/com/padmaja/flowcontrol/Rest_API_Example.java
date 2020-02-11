package com.padmaja.flowcontrol;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class Rest_API_Example {
    public int tablesExample(int num,boolean divisibleBy7) {
       // boolean divisibleBy7 = false;
        do {
            System.out.println(num);
            if (num % 7 == 0)divisibleBy7 = true;
            num--;
        }while (divisibleBy7 == false);

        return num;

    }

    public int whileLoopExample2(int num, boolean divisibleBy7) {
        //boolean divisibleBy7 = true;
        do {
            System.out.println(num);
            if (num % 7 == 0)divisibleBy7 =false;
            num--;
        }while(divisibleBy7 == true);
        return num;

    }

}
/*
import java.util.HashMap;
import java.util.Map;/** * Example DataStore class that provides access to user data. *
Pretend this class accesses a database. */
//public class DataStore {
    //Map of names to Person instances.	private Map<String, Person> personMap = new HashMap<>();
// this class is a singleton and should not be instantiated directly!
// private static DataStore instance = new DataStore();
// public static DataStore getInstance(){		return instance;	}
// private constructor so people know to use the getInstance() function instead	private DataStore(){
// dummy data		personMap.put("Ada", new Person("Ada", "Ada Lovelace was the first programmer.", 1815));
// personMap.put("Kevin", new Person("Kevin", "Kevin is the author of HappyCoding.io.", 1986));
// personMap.put("Stanley", new Person("Stanley", "Stanley is Kevin's cat.", 2007));	}
// public Person getPerson(String name) {		return personMap.get(name);	}
// public void putPerson(Person person) {		personMap.put(person.getName(), person);	}}



