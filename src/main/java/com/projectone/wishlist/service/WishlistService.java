package com.projectone.wishlist.service;

import com.projectone.wishlist.entity.Wishlist;
import com.projectone.wishlist.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WishlistService {
    //In service class we write our business logic
    @Autowired
    private WishlistRepository wishlistRepository;

    //this is my first business logic to add new product in wishlist
    public Wishlist addToWishlist(Wishlist wishlist){
        return wishlistRepository.save(wishlist);
    }


    //this is my second business logic to get all the wishlist available in the wishlist table
    public List<Wishlist> getAllWishlist(){
        return wishlistRepository.findAll();
    }

    //this is my third business logic to delete any wishlist by its wishlist_id
    public void deleteWishlistById(Long wishlistId){
        Wishlist wishlist= wishlistRepository.findById(wishlistId).get();
        wishlistRepository.delete(wishlist);
    }
}
