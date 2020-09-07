package com.qf.liangcang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author WDZ
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private Integer pid;
  private String pname;
  private String pimage;
  private Integer pstatus;

}
