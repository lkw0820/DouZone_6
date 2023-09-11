package com.kosa.securitystudy.Repository;

import com.kosa.securitystudy.data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User getByUid(String uid);
}
