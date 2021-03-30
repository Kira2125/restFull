package com.example.rest1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@GetMapping("/get")
	public List<CartItem> getCartDetails() {
		System.out.println("Inside getCartDetails");
		return cartService.getCartDetails();
	}
	
	@PostMapping("/add")
	public int addCartDetails(@RequestBody CartItem cartItem) {
		System.out.println("@@@ Inside add");
		return cartService.addCartDetails(cartItem);
	}
	
	@PutMapping("/update")
	public int updateCartDetails(@RequestBody CartItem cartItem) {
		return cartService.updateCartDetails(cartItem);
	}
	
	@DeleteMapping("/delete/{id}")
	public int deleteCartItem(@PathVariable int id) {
		System.out.println("hi :" + id);
		return cartService.deleteCartItem(id);
	}
}
