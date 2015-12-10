# eXo-training-project
# Training steps : 
** eXo Service:
 
 1. Import the projet eXoSampleService in your IDE
 2. Build the project and create a jar
 3. Transform the service to a startable service
 4. Add a logging to the service to show a message like : “eXo Sample Service is Starting” with Info Level
 5. Deploy the jar in your server’s lib directory, then start the server -> The log should appear in the terminal

** JCRCrudService
 
 1. Create another eXo Service Called JCRCrudService
 2. This service is not Startable
 3. Add three functions respectively : addJCRNode, updateJCRNode and removeJCRNode
 4. addJCRNode(String nodeName) creates a JCR node under / with name nodeName
 5. updateJCRNode(String propertyName,String propertyValue) updates the node with a new property having the name equal to propertyName and value equal propertyValue
 6. removeJCRNode(String nodeName) will remove this JCR node with name equal to nodeName

** Rest Web Service
 
 Create a Rest Web Service that invokes the functions in JCRCrudService http://docs.exoplatform.com/PLF42/PLFDevGuide.DevelopingRESTServices.html

** Listener

 Create a Listener for the OrganizationService

** JOB

 Create a Job that will call periodically JCRCrudService and update a property of type Date hourly. http://docs.exoplatform.com/PLF42/Kernel.JobSchedulerService.HowJobSchedulerWork.html
