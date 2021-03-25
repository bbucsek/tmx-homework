package com.homework;

import com.homework.task1.Gender;
import com.homework.task1.Person;
import com.homework.task1.exception.AlreadyMarriedException;
import com.homework.task1.exception.NotOldEnoughException;
import com.homework.task1.exception.SameGenderException;

public class Main {

    public static void main(String[] args) throws NotOldEnoughException, AlreadyMarriedException, SameGenderException {

        Person boy = new Person(Gender.MALE, 20);
        Person boy1 = new Person(Gender.MALE, 20);
        Person girl = new Person(Gender.FEMALE, 16);
        Person girl1 = new Person(Gender.FEMALE, 213);
        System.out.println(boy.marry(girl));


    }
}
