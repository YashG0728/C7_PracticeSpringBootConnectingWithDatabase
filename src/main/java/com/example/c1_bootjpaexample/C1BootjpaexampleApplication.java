package com.example.c1_bootjpaexample;

import com.example.c1_bootjpaexample.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class C1BootjpaexampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(C1BootjpaexampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

//        //Create User
//        User user = new User();
//        user.setName("Pranav");
//        user.setCity("Nagpur");
//        user.setStatus("I am java developer");
//
//        User use = userRepository.save(user);
//        System.out.println(use);
//
//        User user1 = new User();
//        user1.setName("Himanshu");
//        user1.setCity("Nagpur");
//        user1.setStatus("I am civil engineer");
//
//        User use1 = userRepository.save(user1);
//        System.out.println(use1);
//
//        //Add to list
//        List<User> users = List.of(use1,use);
//        //Save multiple Objects
//        Iterable<User> result = userRepository.saveAll(users);
//        result.forEach(userss-> System.out.println(userss));
//
//
//        //update
//        Optional<User> optional = userRepository.findById(6);
//        User usersssss = optional.get();
//        user.setName("Sonal");
//        userRepository.save(usersssss);
//        System.out.println(usersssss);
//
//        //findall
//        Iterable<User> itr = userRepository.findAll();
//
//
//        //1stway
//        Iterator<User> iterator = itr.iterator();
//        while (iterator.hasNext()) {
//            User userssss = iterator.next();
//            System.out.println(userssss);
//        }
//
//
//        //2ndway using lambda
//        itr.forEach(usersss -> System.out.println(usersss));
//
//
//        //delete
//        userRepository.deleteById(2);
//        System.out.println("deleted");
//
//
//        //deleteall
//        Iterable<User> allusers = userRepository.findAll();
//        allusers.forEach(userss -> System.out.println(userss));
//        userRepository.deleteAll(allusers);
        //findbyname
//        List<User> users = userRepository.findByName("Sparsh");
//        users.forEach(user -> System.out.println(user));
//
//        //find by name and city
//        List<User> user = userRepository.findByNameAndCity("Sparsh", "Nagpur");
//        user.forEach(e -> System.out.println(e));

        //Queryforgetallusers
//        List<User> allUser = userRepository.getAllUser();
//        allUser.forEach(System.out::println);


        //queryforgetdatabyname
//        List<User> allUser = userRepository.getUserByName("Sparsh");
//        allUser.forEach(System.out::println);

        //Queryforgetdatausingnameandcity
//        List<User> allUsers = userRepository.getUserByNameAndCity("Sparsh","Nagpur");
//        allUsers.forEach(System.out::println);

        //queryforgetalluser
//        List<User> allUser = userRepository.getAllUser();
//        allUser.forEach(System.out::println);
    }

}
