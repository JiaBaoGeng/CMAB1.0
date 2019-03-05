pipeline {
    agent {
            docker {
	                image 'maven:3-alpine' 
			args '-v /root/.m2:/root/.m2' 
		}
	}
    stages{
    	stage('Build') { 
	    steps {
	        sh 'mvn -B -DskipTests clean package' 
            }
	}
	stage('RunCMAB') {
	   steps {
	       sh 'nohup java -Xms256m -Xmx512m -XX:PermSize=256m -XX:MaxPermSize=512m -jar target/CMAB-1.0-SNAPSHOT.jar &'
	   }
	}
    }
}
