package com.companyA.backend.CustomerOrderSystem.contoller;
import java.util.Optional;
import com.companyA.backend.CustomerOrderSystem.model.OrderStatus;
import com.companyA.backend.CustomerOrderSystem.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class OrderStatusController {
    @Autowired
    private OrderStatusService orderStatusService;

    @GetMapping("/getOrderStatus")
    public ResponseEntity<Optional<OrderStatus>> getOrderStatus(@RequestParam("order_ID") String order_ID) {

        Optional<OrderStatus> response = orderStatusService.getOrderStatus(order_ID);
        return new ResponseEntity<Optional<OrderStatus>>(response, HttpStatus.OK);
    }
}