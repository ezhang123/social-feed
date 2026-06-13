package com.eric.socialfeed.repository;

import com.eric.socialfeed.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
