package com.github.ioc;

public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public void doSomething() {
        orderDao.select();
    }
}
