package com.psl.lmsserver.dao;

import com.psl.lmsserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.lmsserver.models.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepo extends JpaRepository<Role, Integer> {

    @Query("Select u from Role as u where u.name=:n")
    public Role findRoleByName(@Param("n") String name);
}
