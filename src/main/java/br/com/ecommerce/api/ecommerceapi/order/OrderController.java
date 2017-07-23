package br.com.ecommerce.api.ecommerceapi.order;

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
@RequestMapping( "/api/v1/orders")
public class OrderController implements OrderControllerDocumentation<Order> {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> index(){
        return orderService.findAll();
    }

    @PostMapping
    public HttpEntity<Order> create(@RequestBody Order order){
        orderService.save(order);
        return ResponseEntity.ok(order);
    }

    @PutMapping
    public HttpEntity<?> update(@Valid @RequestBody Order order){
        return create(order);
    }

    @DeleteMapping("/{id}")
    public HttpEntity<?> delete(@PathVariable Long id){
        if(!orderService.exists(id))
            return ResponseEntity.notFound().build();
        orderService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public HttpEntity<Order> get(@PathVariable Long id){
        Order order = orderService.findOne(id);
        if(order == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(order);
    }

    @GetMapping("/newTest")
    public HttpEntity<Order> get(){
        return create(OrderUtil.getInstance().createOrder());
    }

}
