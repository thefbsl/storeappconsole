package menu;

public class ItemCategories {
    public int id;
    public String categoryName;
    public ItemCategories(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.categoryName;
    }
}
