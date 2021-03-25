package com.homework.task1;

import com.homework.task1.exception.AlreadyMarriedException;
import com.homework.task1.exception.NotOldEnoughException;
import com.homework.task1.exception.SameGenderException;

public class Person {

    private Gender gender;
    private int age;
    private Person spouse;

    public Person(Gender gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    private boolean isOldEnough(Person person) throws NotOldEnoughException {
        if (person.getAge() < 18) {
            throw new NotOldEnoughException("The person is not old enough!");
        }
        return true;
    }

    private boolean isAlreadyMarried(Person person) throws AlreadyMarriedException {
        if (person.getSpouse() != null) {
            throw new AlreadyMarriedException("Already married!");
        }
        return true;
    }

    private boolean isDifferentGender(Person lover) throws SameGenderException {
        if (lover.getGender() == this.gender) {
            throw new SameGenderException("Love is not tolerated!");
        }
        return true;
    }

    private boolean canBeMarried() throws AlreadyMarriedException, NotOldEnoughException {
        return isAlreadyMarried(this) && isOldEnough(this);
    }

    private boolean canLoverBeMarried(Person lover) throws NotOldEnoughException, AlreadyMarriedException {
        return isOldEnough(lover) && isAlreadyMarried(lover);
    }

    public boolean marry(Person lover) throws NotOldEnoughException, AlreadyMarriedException, SameGenderException {
        if (canLoverBeMarried(lover) && canBeMarried() && isDifferentGender(lover)) {
            this.setSpouse(lover);
            lover.setSpouse(this);
            return true;
        }
        return false;
    }
}
