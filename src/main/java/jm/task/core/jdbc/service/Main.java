package jm.task.core.jdbc.service;

import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Fed", "Dory", 28);
        userService.saveUser("Fded", "Dodsdry", 248);
        userService.saveUser("Fded", "Dodsdry", 248);
        userService.saveUser("Fded", "Dodsdry", 248);

        //userService.removeUserById(3L);

        System.out.println(userService.getAllUsers());

       // userService.cleanUsersTable();

        //userService.dropUsersTable();
    }
}
