package eTicaret;

import java.util.ArrayList;

import eTicaret.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("kardelen", "uysal", "hgsh@hotmail.com", "kjkjýýý");
        User user2 = new User("Gernas", "Kilic", "kcjnsd@hotmail.com", "klnjjjj");
       

        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
       
    }


}
