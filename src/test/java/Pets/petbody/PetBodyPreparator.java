package Pets.petbody;

import java.util.ArrayList;
import java.util.List;

public class PetBodyPreparator {

    public PetBody prepare(final Integer petCategoryId, final String petCategoryName, final String petName, final Integer petTagId, final String petTagName) {
        Category category = new Category();
        category.setId(petCategoryId);
        category.setName(petCategoryName);
        PetBody pet = new PetBody();
        pet.setId(0);
        pet.setName(petName);
        pet.setCategory(category);
        List<Tag> tags = new ArrayList<Tag>();
        Tag tag = new Tag();
        tag.setId(petTagId);
        tag.setName(petTagName);
        tags.add(tag);
        pet.setTags(tags);
        return pet;
    }
}
