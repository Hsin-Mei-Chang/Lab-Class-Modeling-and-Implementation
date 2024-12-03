package lab;
import java.util.ArrayList;

class Product {
    private String pname;
    private int price;
    private int number;

    // 無參數構造函數
    public Product() {}

    // 有參數構造函數
    public Product(String pname, int price, int number) {
        this.pname = pname;
        this.price = price;
        this.number = number;
    }

    // 獲取產品名稱
    public String getName() {
        return pname;
    }

    // 獲取產品價格
    public int getPrice() {
        return price;
    }

    // 獲取產品數量
    public int getNumber() {
        return number;
    }

    // 設置產品名稱
    public void setName(String pname) {
        this.pname = pname;
    }

    // 設置產品價格
    public void setPrice(int price) {
        this.price = price;
    }

    // 設置產品數量
    public void setNumber(int number) {
        this.number = number;
    }
}

class Store {
    private String storename;
    private int storeID;
    private String address;
    private String phone;
    private ArrayList<Product> products;  // 用來儲存商店的產品

    // 無參數構造函數
    public Store() {
        products = new ArrayList<>();
    }

    // 有參數構造函數
    public Store(String storename, int storeID, String address, String phone) {
        this.storename = storename;
        this.storeID = storeID;
        this.address = address;
        this.phone = phone;
        products = new ArrayList<>();
    }

    // 創建產品並將其加入商店
    public void createProduct(String pname, String description, int price) {
        // 創建新的產品物件
        Product newProduct = new Product(pname, price, 0);  // 產品的數量初始化為0
        products.add(newProduct);
        System.out.println("Product created: " + pname);
    }

    // 修改已上傳的產品資訊
    public void reviseProduct(String pname, String newDescription, int newPrice) {
        for (Product product : products) {
            if (product.getName().equals(pname)) {
                product.setPrice(newPrice);
                // 設置新描述和圖片等（這兩項是用於示範，產品類中沒有對應屬性，可擴展）
                System.out.println("Product updated: " + pname);
                return;
            }
        }
        System.out.println("Product not found: " + pname);
    }

    // 獲取商店的所有產品
    public ArrayList<Product> getProducts() {
        return products;
    }
}

public class UserStory {
    public static void main(String[] args) {
        // 創建商店
        Store store = new Store("7-11", 10001, "62 Yanchao District, Kaohsiung City", "123-456-7890");

        // 商家創建新產品
        store.createProduct("Sofy Sanitary napkins", "light", 88);
        store.createProduct("Kotex Sanitary napkins", "soft", 99);

        // 修改產品
        store.reviseProduct("Sofy Sanitary napkins", "Updated Sofy Sanitary napkins product", 55);

        // 顯示所有產品
        for (Product product : store.getProducts()) {
            System.out.println("Product Name: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}
