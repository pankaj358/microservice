package org.service.provider;

import org.apache.camel.Body;
import org.apache.camel.Header;

/**
 * 
 * @author rootlinear
 *
 */

public interface CamelRass {

  public Integer methodOne(@Body String arg0);
  
  public Integer methodTwo(@Header("ARG0")String arg0, @Header("ARG1") String arg1);
}
