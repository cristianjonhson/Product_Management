package BSaleTest.Rest;

import BSaleTest.DAO.CategoryDao;
import BSaleTest.DAO.ProductDao;
import BSaleTest.Model.Category;
import BSaleTest.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRest {

    @Autowired
    private ProductDao productdao;
    @Autowired
    private CategoryDao categorydao;
   /* @Autowired
    private ImagenService services;*/

   /* @GetMapping("/in")
    public ModelAndView find( Pageable page){
        ModelAndView md = new ModelAndView("index");
        md.addObject("imgs", services.find(page));
        return md;
    }*/

   @GetMapping("/")
    public String Home() {
        return "/index";
    }

    @GetMapping("/listproducts")
    public List<Product> ToListProduct() {
        // Category category = new Category();
        // Product product = new Product();
        // if(category.getId() == product.getCategory())
        return productdao.findAll();
    }

    @GetMapping("/listcategory")
    public List<Category> ToListCategory() {
        return categorydao.findAll();
    }
}

