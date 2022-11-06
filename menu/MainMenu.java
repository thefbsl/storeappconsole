package menu;
public class MainMenu {
    private static ItemCategories itemCategory;
    private static ItemCategories[] categories = new ItemCategories[]{
            itemCategory = new ItemCategories(1, "Phone"),
            itemCategory = new ItemCategories(2, "Laptop"),
            itemCategory = new ItemCategories(3, "PC"),
            itemCategory = new ItemCategories(4, "Watches"),
            itemCategory = new ItemCategories(5, "TV")
    };
    public static void printCategories(){
        for(int i = 0; i < categories.length; i++){
            System.out.println(categories[i].toString());
        }
    }
    public static void intro(){
        System.out.println("Choose what you are looking for:");
    }
}
