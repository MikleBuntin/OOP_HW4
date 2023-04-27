package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, String dateOfBirth);
}
