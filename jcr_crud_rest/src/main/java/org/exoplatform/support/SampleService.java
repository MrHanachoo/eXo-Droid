package org.exoplatform.support;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.picocontainer.Startable;

public class SampleService implements Startable {
  private static final Log LOG = ExoLogger.getLogger(SampleService.class);


  public SampleService () {
      LOG.info("---------------------- eXo Sample Service ----------------------------");
  }


    public void start() {
        LOG.info("#####################################################################################################" +
                "\n$$$$$$$$$$$$$$$$$$$$ $eXo Sample Service is Starting $$$$$$$$$$$$$$$$$$$$\n" +
                "######################################################################################################");
    }

    public void stop() {
        LOG.info("\n\n\n$$$$$$$$$$$$$$$$$$$$ eXo Sample Service is Stopping $$$$$$$$$$$$$$$$$$$$\n\n\n  ");

    }
}
