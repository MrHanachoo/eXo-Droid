package org.exoplatform.support;


import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by exo on 9/29/15.
 */
public class JCRCrudServiceJob  implements Job{
    private static final Log log = ExoLogger.getLogger(JCRCrudServiceJob.class);

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("////////////////////////////JCRCrudServiceJob is running!!!");
    }
}
