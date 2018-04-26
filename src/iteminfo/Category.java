package iteminfo;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private String Name;
    private Category parentCategory;
    private List<Category> kidsCategory = new ArrayList<>();
    private List<Item> items = new ArrayList<>();

    public void setParent(Category parentCategory) {
        this.parentCategory = parentCategory;
}

    public void setName(String Name) {
        this.Name = Name;
    }

    public void addChildCategory(Category childCategory) {
        kidsCategory.add(childCategory);
    }

    public void addItem(Item item) {
        items.add(item);
    }
}

