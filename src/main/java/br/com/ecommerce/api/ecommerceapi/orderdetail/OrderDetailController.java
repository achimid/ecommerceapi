package br.com.ecommerce.api.ecommerceapi.orderdetail;

import br.com.ecommerce.api.ecommerceapi.order.Order;
import br.com.ecommerce.api.ecommerceapi.order.OrderService;
import br.com.ecommerce.api.ecommerceapi.order.OrderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Lourran on 11/07/2017.
 */
@RestController
@RequestMapping( "/api/v1/orderdetails")
public class OrderDetailController implements OrderDetailControllerDocumentation<OrderDetail> {

    @Autowired
    private OrderDetailService orderDetailService;

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderDetail> index(){
        return orderDetailService.findAll();
    }

    @PostMapping
    public HttpEntity<OrderDetail> create(@RequestBody OrderDetail orderDetail){
        orderDetailService.save(orderDetail);
        return ResponseEntity.ok(orderDetail);
    }

    @PutMapping
    public HttpEntity<?> update(@Valid @RequestBody OrderDetail orderDetail){
        return create(orderDetail);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Long id){
        if(!orderDetailService.exists(id))
            return ResponseEntity.notFound().build();
        orderDetailService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public HttpEntity<OrderDetail> get(@PathVariable Long id){
        OrderDetail orderDetail = orderDetailService.findOne(id);
        if(orderDetail == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(orderDetail);
    }

    @GetMapping("/newTest")
    public HttpEntity<OrderDetail> get(){
        return null;
    }

}
