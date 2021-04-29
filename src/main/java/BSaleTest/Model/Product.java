package BSaleTest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String url_image;
    @Column
    private Float price;
    @Column
    private Integer discount;
    @Column
    private Integer category;


    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image( String url_image ) {
        this.url_image = url_image;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice( Float price ) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount( Integer discount ) {
        this.discount = discount;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory( Integer category ) {
        this.category = category;
    }
}
