package com.orm.demo.dao;

import com.orm.demo.entity.Order;
import com.springframework.orm.dao.DefaultBaseDao;
import org.springframework.stereotype.Repository;

/**
 * Created by shenyiwei on 2019/4/29.
 */
@Repository
public class OrderDao extends DefaultBaseDao<Order> {

}
