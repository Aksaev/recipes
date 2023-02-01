package me.aksaev.recipes.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.aksaev.recipes.record.InfoRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@Tag(name = "Описание проекта", description = "Книга рецептов")
public class FirstController {
    @GetMapping
    public String index() {
        return "Приложение запущено!";
    }

    @GetMapping("/info")
    public InfoRecord info() {
        return new InfoRecord("Сергей Аксаев", "Рецепты",
                LocalDate.of(2022, 12, 26), "Книга рецептов");
    }

}