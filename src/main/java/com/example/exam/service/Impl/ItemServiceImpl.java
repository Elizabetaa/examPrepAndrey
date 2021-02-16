package com.example.exam.service.Impl;

import com.example.exam.model.entities.Category;
import com.example.exam.model.entities.Item;
import com.example.exam.model.entities.enums.CategoryName;
import com.example.exam.model.entities.enums.GenderName;
import com.example.exam.model.service.ItemServiceModel;
import com.example.exam.model.view.ItemDetailsView;
import com.example.exam.model.view.ItemView;
import com.example.exam.repository.ItemRepository;
import com.example.exam.service.CategoryService;
import com.example.exam.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {
    private final ModelMapper modelMapper;
    private final ItemRepository itemRepository;
    private final CategoryService categoryService;

    public ItemServiceImpl(ModelMapper modelMapper, ItemRepository itemRepository, CategoryService categoryService) {
        this.modelMapper = modelMapper;
        this.itemRepository = itemRepository;
        this.categoryService = categoryService;
    }

    @Override
    public void addItem(ItemServiceModel itemServiceModel) {
        Item item = this.modelMapper.map(itemServiceModel, Item.class);
        item.setCategory(this.categoryService.findCategory(itemServiceModel.getCategory()));

        this.itemRepository.save(item);
    }

    @Override
    public List<ItemView> findAllItems() {
        return this.itemRepository.findAll()
                .stream()
                .map(item -> {
                    ItemView itemView = this.modelMapper.map(item,ItemView.class);
                    itemView.setImgUrl(String.format("/img/%s-%s.jpg",item.getGender(),item.getCategory().getName()));
                    return itemView;
                }).collect(Collectors.toList());
    }

    @Override
    public ItemView findItem(Long id) {
        Optional<Item> byId = this.itemRepository.findById(id);
        ItemView itemView = new ItemView();
        itemView.setId(byId.get().getId())
                .setName(byId.get().getName())
                .setDescription(byId.get().getDescription())
                .setPrice(byId.get().getPrice())
                .setImgUrl(String.format("/img/%s-%s.jpg",byId.get().getGender(),byId.get().getCategory().getName()));
        return itemView;
    }

    @Override
    public void delete(Long id) {
        this.itemRepository.delete(this.itemRepository.findById(id).orElse(null));
    }


}
