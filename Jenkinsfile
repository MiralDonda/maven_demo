node {
  stage('SCM') {
    git 'https://github.com/MiralDonda/maven_demo.git'
  }
  
   stage('Build & Package') {
    withSonarQubeEnv('SonarQube') {
        sh 'mvn clean package sonar:sonar'
    }
}

 stage('Results'){
    archive 'gameoflife-web/target/gameoflife.war'
    junit 'gameoflife-web/target/surefire-reports/*.xml'
}
}
}
