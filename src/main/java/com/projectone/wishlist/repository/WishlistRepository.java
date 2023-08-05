package com.projectone.wishlist.repository;

import com.projectone.wishlist.entity.Wishlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

}
