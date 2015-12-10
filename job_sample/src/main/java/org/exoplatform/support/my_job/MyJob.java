package org.exoplatform.support.my_job;

/**
 * Created by exo on 10/13/15.
 */

import org.exoplatform.services.log.Log;
import org.exoplatform.services.log.ExoLogger;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements  Job{

    private static final Log log = ExoLogger.getLogger(MyJob.class);

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info(">>> MyJob is running !!!");
    }
}
