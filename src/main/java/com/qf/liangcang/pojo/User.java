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
public class User {

  private Integer uid;
  private String unickname;
  private Integer usex;
  private String uphone;
  private Integer ucode;
  private String uavatar;
  private String udescription;
  private String ustatus;

}
