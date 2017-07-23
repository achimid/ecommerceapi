package br.com.ecommerce.api.ecommerceapi;

import br.com.ecommerce.api.ecommerceapi.category.CategoryService;
import br.com.ecommerce.api.ecommerceapi.category.CategoryUtil;
import br.com.ecommerce.api.ecommerceapi.order.OrderService;
import br.com.ecommerce.api.ecommerceapi.orderdetail.OrderDetailService;
import br.com.ecommerce.api.ecommerceapi.product.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@InjectMocks
	@Autowired
	CategoryService categoryService;

	@InjectMocks
	@Autowired
	ProductService productService;

	@InjectMocks
	@Autowired
	OrderService orderService;

	@InjectMocks
	@Autowired
	OrderDetailService orderDetailService;

	@Test
	public void contextLoads() {

	}

}
