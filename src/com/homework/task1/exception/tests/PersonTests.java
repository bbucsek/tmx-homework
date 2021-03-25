package com.homework.task1.exception.tests;

import com.homework.task1.Gender;
import com.homework.task1.Person;
import com.homework.task1.exception.AlreadyMarriedException;
import com.homework.task1.exception.NotOldEnoughException;
import com.homework.task1.exception.SameGenderException;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PersonTests {

    @Test()
    public void testIsCreatedPersonHasTheRightAttribute() {
        Person boy = new Person(Gender.MALE, 20);
        assertEquals(Gender.MALE, boy.getGender());
        assertEquals(20, boy.getAge());
    }

    @Test
    public void testMarryMethod() throws AlreadyMarriedException, SameGenderException, NotOldEnoughException {
        Person boy = new Person(Gender.MALE, 20);
        Person girl = new Person(Gender.FEMALE, 20);
        boy.marry(girl);
        assertEquals(boy, girl.getSpouse());
        assertEquals(girl, boy.getSpouse());

    }

    @Test(expected = NotOldEnoughException.class)
    public void testThrowExceptionWhenNotOldEnough() throws AlreadyMarriedException, SameGenderException, NotOldEnoughException {
        Person boy = new Person(Gender.MALE, 18);
        Person girl = new Person(Gender.FEMALE, 17);
        boy.marry(girl);
    }

    @Test(expected = AlreadyMarriedException.class)
    public void testThrowExceptionWhenAlreadyMarried() throws AlreadyMarriedException, SameGenderException, NotOldEnoughException {
        Person boy = new Person(Gender.MALE, 18);
        Person otherBoy = new Person(Gender.MALE, 20);
        Person lover = new Person(Gender.FEMALE, 18);
        otherBoy.marry(lover);
        boy.marry(lover);
    }

    @Test(expected = SameGenderException.class)
    public void testThrowExceptionWhenGenderIsSame() throws AlreadyMarriedException, SameGenderException, NotOldEnoughException {
        Person boy = new Person(Gender.MALE, 18);
        Person boy2 = new Person(Gender.MALE, 20);
        boy.marry(boy2);
    }

}
