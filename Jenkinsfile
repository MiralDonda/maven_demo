node {
  stage('SCM') {
   
    git 'https://github.com/MiralDonda/maven_demo.git'
    
  }
  stage('SonarQube analysis') {
    withSonarQubeEnv(credentialsId: 'sonar', installationName: 'sonar_server') { 
      // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar
    }
  }
}
