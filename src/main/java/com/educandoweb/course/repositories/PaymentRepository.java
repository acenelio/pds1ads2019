package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
