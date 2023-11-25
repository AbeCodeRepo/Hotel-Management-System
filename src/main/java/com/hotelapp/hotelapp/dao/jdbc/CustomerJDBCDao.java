//package com.hotelapp.hotelapp.dao.jdbc;
//
//import com.hotelapp.hotelapp.dto.CustomerDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@Repository
//public class CustomerJDBCDao {
//
//
//
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    public List<CustomerDTO> getAllCustomerWithSearch(){
//        List<CustomerDTO> result = new ArrayList<>();
//        Map<String,Object> params = new HashMap<>();
//
//        StringBuilder SQL = new StringBuilder();
//        SQL.append("SELECT                       \n");
//        SQL.append("    tc.CUSTOMER_ID ,         \n");
//        SQL.append("    tc .CUSTOMER_NAME ,      \n");
//        SQL.append("    tc.MOBILE_NO ,           \n");
//        SQL.append("    tc.ADDRESS,              \n");
//        SQL.append("    tc.STATUS                \n");
//        SQL.append("FROM                         \n");
//        SQL.append("    t_customer tc ;          \n");
//
//        return namedParameterJdbcTemplate.query(SQL.toString(), params, new ResultSetExtractor<List<CustomerDTO>>() {
//                    @Override
//                    public List<CustomerDTO> extractData(ResultSet rs) throws SQLException, DataAccessException {
//                       while (rs.next()){
//                          CustomerDTO customerDTO = new CustomerDTO();
//                          customerDTO.setCustomerID(rs.getInt("CUSTOMER_ID"));
//                          customerDTO.setCustomerName(rs.getString("CUSTOMER_NAME"));
//                          customerDTO.setMobileNo(rs.getString("MOBILE_NO"));
//                          customerDTO.setAddress(rs.getString("ADDRESS"));
//                          customerDTO.setStatus(rs.getString("STATUS "));
//
//                          result.add(customerDTO);
//                       }
//
//                        return result;
//                    }
//                }
//
//        );
//
//    }
//}
