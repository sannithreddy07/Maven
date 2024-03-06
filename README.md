##To get Maven-surefire-reports (add maven-surefire-plugin dependency)
To execute all testNG testcases and get surefire-reports add below xml code in pom.xml and run the pom.xml (Run as-->maven test
  <build>
	  <pluginManagement>
		  <plugins>
			  <plugin>

    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.2.5</version>
<configuration>
	<suiteXmlFiles>
		<suiteXmlFile>testng.xml</suiteXmlFile>
	</suiteXmlFiles>
</configuration>

			  </plugin>
		  </plugins>
	  </pluginManagement>
  </build>
###Commands to execute 
