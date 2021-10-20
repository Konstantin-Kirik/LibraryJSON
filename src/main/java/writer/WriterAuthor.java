package writer;

import java.util.List;

public class WriterAuthor {
    private String name;
    private List<String> product;

    public WriterAuthor(){

    }

    public WriterAuthor(String name, List<String> product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProduct() {
        return product;
    }

    public void setProduct(List<String> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return
                "Name Author = " + name + '\'' +
                "product = " + product + "\n";
    }
}
