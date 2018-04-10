import java.util.HashSet;
import java.util.Set;

public class Category {
    private String name;
    private Category parentCategory;
    private Set childCategories = new HashSet();

    public Category () {}
}

