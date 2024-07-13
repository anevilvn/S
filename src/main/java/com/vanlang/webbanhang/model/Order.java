package com.vanlang.webbanhang.model;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;
    private String customerNote;
    private String customerPayment;



    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;
}
