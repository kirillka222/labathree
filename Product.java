public class Product {
    private String title;
    private String description;
    private int cost;
    private int count;

    public Product(String t, String d, int c, int cnt) {
        title = t;
        description = d;
        cost = c;
        count = cnt;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return description;
    }
    public int getCost() {
        return cost;
    }
    public int getCount() {
        return count;
    }
}
