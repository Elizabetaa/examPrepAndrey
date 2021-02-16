package com.example.exam.web;

import com.example.exam.model.binding.ItemAddBindingModel;
import com.example.exam.model.service.ItemServiceModel;
import com.example.exam.model.view.ItemDetailsView;
import com.example.exam.model.view.ItemView;
import com.example.exam.service.ItemService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;
    private final ModelMapper modelMapper;

    public ItemController(ItemService itemService, ModelMapper modelMapper) {
        this.itemService = itemService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/add")
    public String add(Model model){
        if (!model.containsAttribute("itemAddBindingModel")){
            model.addAttribute("itemAddBindingModel",new ItemAddBindingModel());
        }
        return "add-item";
    }

    @PostMapping("/add")
    public String addConfirm(@Valid ItemAddBindingModel itemAddBindingModel,
                             BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("itemAddBindingModel",itemAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.itemAddBindingModel",bindingResult);
            return "redirect:add";
        }

        this.itemService.addItem(this.modelMapper.map(itemAddBindingModel, ItemServiceModel.class));


        return "redirect:/";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model){
        model.addAttribute("item",this.itemService.findItem(id));
        return "details-item";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        this.itemService.delete(id);
        return "redirect:/";
    }
}
