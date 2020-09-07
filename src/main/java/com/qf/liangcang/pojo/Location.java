package com.qf.liangcang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

  private long lid;
  private String lname;
  private String lphone;
  private String larea;
  private String ldetail;
  private long lstatus;

}
