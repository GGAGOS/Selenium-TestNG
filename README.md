# Selenium-TestNG
sample repository

For testing :
   -You have to change Chrome Driver path on OpenUrl class
   -You have to change the html Id for Login of the page you select( or change the link text) on Test1.class
      (Open1.driver.findElement(By.id("u_0_5")).click(); // For facebook change ex. u_0_5,u_0_2 
      Open1.driver.findElement(By.partialLinkText("Login")).click();)
   -If you change the classes TestListener1 and Test1NGTest you have to copy manually the class from the test folder for classes 
    to the source folder for classes. ( Netbeans not find the path for the test from testng.xml)
