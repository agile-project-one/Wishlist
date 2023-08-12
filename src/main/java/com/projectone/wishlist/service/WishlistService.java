package com.projectone.wishlist.service;

import com.projectone.wishlist.entity.Wishlist;
import com.projectone.wishlist.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WishlistService {

    @Autowired
    private WishlistRepository wishlistRepository;

    public Wishlist addToWishlist(Wishlist wishlist){
        return wishlistRepository.save(wishlist);
    }

    public List<Wishlist> getAllWishlist(){
        return wishlistRepository.findAll();
    }

    public Wishlist deleteWishlistById(Long wishlistId){
        Wishlist wishlist= wishlistRepository.findById(wishlistId).get();
        wishlistRepository.delete(wishlist);
        return wishlist;
    }

    public Wishlist updateWishlistById(Long wishlistId, Wishlist wishlistFromClient){
       Wishlist wishlist = wishlistRepository.findById(wishlistId).get();
       wishlist.setProductId(wishlistFromClient.getProductId());
       wishlist.setUserId(wishlistFromClient.getUserId());
       wishlist.setCategory(wishlistFromClient.getCategory());
       wishlistRepository.save(wishlist);
       return wishlist;
    }
}
