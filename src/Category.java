import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Category {
    private String name;
    private Category parentCategory;
    private Set childCategories = new HashSet();
    private Set items = new HashSet();

    public Category () {}


    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(Set childCategories) {
        this.childCategories = childCategories;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Set getItems() {
        return items;
    }

    public void setItems(Set items) {
        this.items = items;
    }


    Category aParent = new Category();
    Category aChild = new Category();
    aChild.setParentCategory(aParent);
    aParent.getChildCategories() .add(aChild);

    public void addChildCategory (Category childCategory) {
        if (childCategory == null)
            throw new IllegalArgumentException("Null child category!");
        if (childCategory.getParentCategory() !=null) childCategory.getParentCategory() .getChildCategories().remove(childCategory);
        childCategory.setParentCategory(this);
        childCategories.add(childCategory);
    }


}

