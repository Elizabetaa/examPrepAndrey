package com.example.exam.repository;

import com.example.exam.model.entities.Item;
import com.example.exam.model.entities.enums.CategoryName;
import com.example.exam.model.entities.enums.GenderName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByCategory_NameAndGender(CategoryName category, GenderName gender);


}
