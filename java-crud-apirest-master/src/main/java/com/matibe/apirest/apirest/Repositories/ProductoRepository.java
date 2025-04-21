package com.matibe.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matibe.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository <Producto, Long> {

}
