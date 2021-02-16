package com.example.exam.service;

import com.example.exam.model.entities.enums.CategoryName;
import com.example.exam.model.entities.enums.GenderName;
import com.example.exam.model.service.ItemServiceModel;
import com.example.exam.model.view.ItemDetailsView;
import com.example.exam.model.view.ItemView;

import java.util.List;

public interface ItemService {
    void addItem(ItemServiceModel map);

    List<ItemView> findAllItems();

    ItemView findItem(Long id);

    void delete(Long id);
}
