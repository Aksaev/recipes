package me.aksaev.recipes.service;

import me.aksaev.recipes.model.Ingredient;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.core.io.InputStreamResource;
import org.springframework.web.multipart.MultipartFile;

public interface IngredientService {
    Ingredient add(Ingredient ingredient);
    Ingredient get(long id);
    Ingredient update(long id, Ingredient ingredient);
    Ingredient remove(long id);
    InputStreamResource getAllInBytes();
    void importIngredients(MultipartFile ingredients);
}
