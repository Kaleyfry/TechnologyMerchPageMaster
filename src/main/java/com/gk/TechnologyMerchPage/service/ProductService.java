package com.gk.TechnologyMerchPage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.TechnologyMerchPage.model.Product;
import com.gk.TechnologyMerchPage.repository.ProductRepository;

//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.gk.TechnologyMerchPage.repository.ProductRepository;
//import com.gk.TechnologyMerchPage.model.Product;

 @Service
    public class ProductService {
        @Autowired
        private ProductRepository productRepository;
 
        public List<Product> findAll() {
            return productRepository.findAll();
        }
 
        public Product findById(long id) {
            return productRepository.findById(id);
        }
 
        public List<String> findDistinctBrands() {
            return productRepository.findDistinctBrands();
        }
 
        public List<String> findDistinctCategories() {
            return productRepository.findDistinctCategories();
        }
 
        public void save(Product product) {
            productRepository.save(product);
        }
 
        public void deleteById(long id) {
            productRepository.deleteById(id);
        }
 
        public List<Product> findByBrandAndOrCategory(String brand, String category) {
            if(category == null && brand == null)
                return productRepository.findAll();
            else if(category == null)
                return productRepository.findByBrand(brand);
            else if(brand == null)
                return  productRepository.findByCategory(category);
            else
                return productRepository.findByBrandAndCategory(brand, category);
        }
    }


//@Service 
//public class ProductService {
//
//	@Autowired
//	private ProductRepository productRepository;
//	
//	public List<Product> findAll() {
//	    List<Product> products = productRepository.findAllByOrderByCreatedAtDesc();
//	    return formatProducts(products);
//	  }
//
//	private List<Product> formatProducts(List<Product> products) {
//		return products;
//	}
//	
////	public List<Product> findAllById(long id){
////        List<Product> products = productRepository.findById(id);
////        return formatProducts(products);
////    }
//
//	
////	private List<Tweet> formatTweets(List<Tweet> tweets) {
////	    addTagLinks(tweets);
////	    shortenLinks(tweets);
////	    return tweets;
////	  }
//}