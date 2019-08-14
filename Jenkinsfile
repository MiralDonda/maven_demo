node {
  stage('SCM') {
   
    git 'https://github.com/javaparser/javaparser-maven-sample.git'
    
  }
  stage('SonarQube analysis') {
    withSonarQubeEnv(credentialsId: 'sonar', installationName: 'sonar_server') { // You can override the credential to be used
      sh 'mvn clean package sonar:sonar'
  }
}
}
