package org.exoplatform.support;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;

import org.picocontainer.Startable;

public class SampleService  implements Startable {

    private static final Log LOG = ExoLogger.getLogger(SampleService.class);

    public SampleService () {
        LOG.info("---------------------- eXo Sample Service ----------------------------");
    }

        public void start() {
            LOG.info("|||||||||||||||||||||||||||| eXo Sample Service is Starting ||||||||||||||||||||||||||||");
        }

        public void stop() {
            LOG.info("|||||||||||||||||||||||||||| eXo Sample Service is Stopping ||||||||||||||||||||||||||||");
        }

  }

