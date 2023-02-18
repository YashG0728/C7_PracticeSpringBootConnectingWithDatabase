package com.example.c1_bootjpaexample.repository;

import com.example.c1_bootjpaexample.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<BookModel,Integer> {
//     List<BookModel> findByName(String name);   //introducer =  find , byName = criteria
//     List<BookModel> findByNameAndCity(String name, String city);
//
//     @Query("select u FROM BookModel u")
//     public List<BookModel> getAllUser();
//
//     @Query("select u FROM BookModel u WHERE u.name =:n")
//     public List<BookModel> getUserByName(@Param("n") String name);//@PARAM is used to bind with variable n with name
//
//     @Query("select u FROM BookModel u WHERE u.name =:n and u.city=:c")
//     public List<BookModel> getUserByNameAndCity(@Param("n") String name, @Param("c") String city);
//
//
//     @Query(value = "select * from User", nativeQuery = true)
//     public List<BookModel> getUser();
}
